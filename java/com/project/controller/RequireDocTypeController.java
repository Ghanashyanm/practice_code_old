package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.AccountTypeVO;
import com.project.model.DocumentVO;
import com.project.model.LoanTypeVO;
import com.project.model.RequiredDocDetailsVO;
import com.project.model.RequiredDocVO;
import com.project.service.AccountTypeService;
import com.project.service.DocumentService;
import com.project.service.LoanTypeService;
import com.project.service.RequiredDocDetaillsService;
import com.project.service.RequiredDocService;

@Controller
public class RequireDocTypeController {

	@Autowired
	private AccountTypeService accountTypeService;

	@Autowired
	private DocumentService documentService;

	@Autowired
	private LoanTypeService loanTypeService;

	@Autowired
	private RequiredDocService requiredDocService;

	@Autowired
	private RequiredDocDetaillsService requiredDocDetaillsService;

	@GetMapping(value = "admin/addRequiredDoc")
	public ModelAndView addRequiredDoc() {
		List<AccountTypeVO> accountTypeList = this.accountTypeService.searchAccountType();
		List<LoanTypeVO> loanTypeList = this.loanTypeService.searchLoanType();
		List<DocumentVO> documentList = this.documentService.searchDocument();
		return new ModelAndView("admin/addRequiredDoc").addObject("accountTypeList", accountTypeList)
				.addObject("documentList", documentList).addObject("loanTypeList", loanTypeList);
	}

	@PostMapping(value = "admin/saveRequiredDoc")
	public ModelAndView saveRequiredDoc(HttpServletRequest request, @RequestParam String documentRequiredFor,
			@RequestParam(required = false) String accountType, @RequestParam(required = false) String loanType) {
		RequiredDocVO requiredDocVO = new RequiredDocVO();
		requiredDocVO.setDocRequiredFor(documentRequiredFor);
		if (documentRequiredFor.equals("Account")) {
			AccountTypeVO accountTypeVO = new AccountTypeVO();
			accountTypeVO.setAccountTypeId(Integer.parseInt(accountType));
			requiredDocVO.setAccountTypeVO(accountTypeVO);
		} else if (documentRequiredFor.equals("Loan")) {
			LoanTypeVO loanTypeVO = new LoanTypeVO();
			loanTypeVO.setLoanTypeId(Integer.parseInt(loanType));
			requiredDocVO.setLoanTypeVO(loanTypeVO);
		}
		this.requiredDocService.insertRequiredDoc(requiredDocVO);

		String[] requiredDocId = request.getParameterValues("requiredDocId");

		if (requiredDocId != null) {

			for (int i = 0; i < requiredDocId.length; i++) {
				RequiredDocDetailsVO detailsVO = new RequiredDocDetailsVO();

				DocumentVO documentVO = new DocumentVO();
				documentVO.setDocumentId(Integer.parseInt(requiredDocId[i]));

				detailsVO.setDocumentVO(documentVO);
				detailsVO.setRequiredDocVO(requiredDocVO);
				this.requiredDocDetaillsService.insertRequiredDocFile(detailsVO);

			}
		}
		return new ModelAndView("redirect:addRequiredDoc");
	}

	@GetMapping(value = "admin/viewRequiredDoc")
	public ModelAndView viewRequiredDoc() {
		List<RequiredDocVO> searchRequiredDocList = this.requiredDocService.searchRequiredDoc();
		List<AccountTypeVO> accountTypeList = this.accountTypeService.searchAccountType();
		List<LoanTypeVO> loanTypeList = this.loanTypeService.searchLoanType();

		return new ModelAndView("admin/viewRequiredDoc", "searchRequiredDocList", searchRequiredDocList)
				.addObject("accountTypeList", accountTypeList).addObject("loanTypeList", loanTypeList);
	}

	@GetMapping(value = "admin/deleteRequiredDoc")
	public ModelAndView deleteRequiredDoc(@RequestParam int id, @ModelAttribute RequiredDocVO requiredDocVO) {

		List<RequiredDocVO> deleteRequiredDocList = this.requiredDocService.getByIdRequiredDoc(id);
		requiredDocVO = deleteRequiredDocList.get(0);
		requiredDocVO.setStatus(false);
		this.requiredDocService.insertRequiredDoc(requiredDocVO);

		return new ModelAndView("redirect:viewRequiredDoc");
	}

	@GetMapping(value = "admin/editRequiredDoc")
	public ModelAndView editRequiredDoc(@RequestParam int id) {
		List<RequiredDocVO> editRequiredDocList = this.requiredDocService.getByIdRequiredDoc(id);
		List<AccountTypeVO> accountTypeList = this.accountTypeService.searchAccountType();
		List<LoanTypeVO> loanTypeList = this.loanTypeService.searchLoanType();
		List<DocumentVO> documentList = this.documentService.searchDocument();
		return new ModelAndView("admin/addRequiredDoc", "RequiredDocVO", editRequiredDocList.get(0))
				.addObject("accountTypeList", accountTypeList).addObject("loanTypeList", loanTypeList)
				.addObject("documentList", documentList);
	}

	@GetMapping(value = "admin/getDocDetails")
	public ResponseEntity<Object> getDocDetails(@RequestParam int id) {
		List<RequiredDocDetailsVO> docDetailsList = this.requiredDocDetaillsService.getByIdRequiredDocFile(id);
		return new ResponseEntity<Object>(docDetailsList, HttpStatus.OK);
	}

}