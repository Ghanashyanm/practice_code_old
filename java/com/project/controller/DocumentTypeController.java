package com.project.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.DocumentVO;
import com.project.service.DocumentService;

@Controller
public class DocumentTypeController {

	@Autowired
	private DocumentService documentService;

	@GetMapping(value = "admin/addDocument")
	public ModelAndView addDocument() {
		return new ModelAndView("admin/addDocument", "DocumentVO", new DocumentVO());
	}

	@PostMapping(value = "admin/insertDocument")
	public ModelAndView insertDocument(@ModelAttribute DocumentVO documentTypeVO, HttpSession session,
			@RequestParam("file") MultipartFile file) {
		String path = session.getServletContext().getRealPath("/");

		String fileName = file.getOriginalFilename();

		String filePath = path + "document\\reqDocument\\";

		try {
			byte barr[] = file.getBytes();

			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(filePath + "/" + fileName));

			bout.write(barr);
			bout.flush();
			bout.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		documentTypeVO.setDocumentFileName(fileName); 
		documentTypeVO.setDocumentFilePath(filePath);
		
		this.documentService.insertDocument(documentTypeVO);
		return new ModelAndView("admin/addDocument", "DocumentVO", new DocumentVO());
	}

	@GetMapping(value = "admin/viewDocument")
	public ModelAndView viewDocument() {
		List<DocumentVO> searchDocumentList = this.documentService.searchDocument();
		return new ModelAndView("admin/viewDocument", "searchDocumentList", searchDocumentList);
	}

	@GetMapping(value = "admin/deleteDocument")
	public ModelAndView deleteDocument(@ModelAttribute DocumentVO docuemntTypeVO, @RequestParam int id) {

		List<DocumentVO> deleteListDocumentType = this.documentService.getByIdDocument(id);
		docuemntTypeVO = deleteListDocumentType.get(0);
		docuemntTypeVO.setStatus(false);

		this.documentService.insertDocument(docuemntTypeVO);

		return new ModelAndView("redirect:viewDocument");
	}

	@GetMapping(value = "admin/editDocument")
	public ModelAndView editAccountType(@RequestParam int id) {

		List<DocumentVO> editListDocumentType = this.documentService.getByIdDocument(id);

		return new ModelAndView("admin/addDocument", "DocumentVO", editListDocumentType.get(0));
	}
}