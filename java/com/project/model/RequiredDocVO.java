package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RequiredDocMaster")
public class RequiredDocVO {
	@Id
	@Column(name = "required_doc_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int requiredDocId;

	@ManyToOne
	@JoinColumn(name = "accountType_id")
	private AccountTypeVO accountTypeVO;

	@ManyToOne
	@JoinColumn(name = "loanType_id")
	private LoanTypeVO loanTypeVO;

	@Column(name = "doc_required_for")
	private String docRequiredFor;

	@Column(name = "status")
	private boolean status = true;

	public int getRequiredDocId() {
		return requiredDocId;
	}

	public void setRequiredDocId(int requiredDocId) {
		this.requiredDocId = requiredDocId;
	}

	public AccountTypeVO getAccountTypeVO() {
		return accountTypeVO;
	}

	public void setAccountTypeVO(AccountTypeVO accountTypeVO) {
		this.accountTypeVO = accountTypeVO;
	}

	public LoanTypeVO getLoanTypeVO() {
		return loanTypeVO;
	}

	public void setLoanTypeVO(LoanTypeVO loanTypeVO) {
		this.loanTypeVO = loanTypeVO;
	}

	public String getDocRequiredFor() {
		return docRequiredFor;
	}

	public void setDocRequiredFor(String docRequiredFor) {
		this.docRequiredFor = docRequiredFor;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
