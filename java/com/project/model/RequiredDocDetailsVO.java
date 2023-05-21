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
@Table(name = "requiredDocFileMaster")
public class RequiredDocDetailsVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "required_doc_file_id")
	private int requiredDocFileId;

	@ManyToOne
	@JoinColumn(name = "required_doc_id")
	private RequiredDocVO requiredDocVO;

	@ManyToOne
	@JoinColumn(name = "doc_id")
	private DocumentVO documentVO;

	@Column(name = "status")
	private boolean status = true;

	public int getRequiredDocFileId() {
		return requiredDocFileId;
	}

	public void setRequiredDocFileId(int requiredDocFileId) {
		this.requiredDocFileId = requiredDocFileId;
	}

	public RequiredDocVO getRequiredDocVO() {
		return requiredDocVO;
	}

	public void setRequiredDocVO(RequiredDocVO requiredDocVO) {
		this.requiredDocVO = requiredDocVO;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public DocumentVO getDocumentVO() {
		return documentVO;
	}

	public void setDocumentVO(DocumentVO documentVO) {
		this.documentVO = documentVO;
	}

}
