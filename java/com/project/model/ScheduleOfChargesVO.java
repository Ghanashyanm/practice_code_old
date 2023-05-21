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
@Table(name="scheduleOfChargesMaster")
public class ScheduleOfChargesVO {

	@Id
	@Column(name="schedule_of_charges_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int scheduleOfChargesId;
	
	@ManyToOne
	@JoinColumn(name="account_id")
	private AccountTypeVO accountTypeVO;
	
	@Column(name="interest_rate")
	private String interestRate;
	
	@Column(name="amount_range")
	private String amountRange;
	
	@Column(name="debit_card_charge")
	private String debitCardCharge;
	
	@Column(name="sms_charge")
	private String smsCharge;
	
	@Column(name="same_bank_free_transaction")
	private String sameBankFreeTransaction;
	
	@Column(name="same_bank_service_transaction")
	private String sameBankServiceTransaction;
	
	@Column(name="other_bank_free_transaction")
	private String otherBankFreeTransaction;
	
	@Column(name="other_bank_service_transaction")
	private String otherBankServiceTransaction;
	
	@Column(name="status")
	private boolean status = true;

	public int getScheduleOfChargesId() {
		return scheduleOfChargesId;
	}

	public void setScheduleOfChargesId(int scheduleOfChargesId) {
		this.scheduleOfChargesId = scheduleOfChargesId;
	}

	public AccountTypeVO getAccountTypeVO() {
		return accountTypeVO;
	}

	public void setAccountTypeVO(AccountTypeVO accountTypeVO) {
		this.accountTypeVO = accountTypeVO;
	}

	public String getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}

	public String getAmountRange() {
		return amountRange;
	}

	public void setAmountRange(String amountRange) {
		this.amountRange = amountRange;
	}

	public String getDebitCardCharge() {
		return debitCardCharge;
	}

	public void setDebitCardCharge(String debitCardCharge) {
		this.debitCardCharge = debitCardCharge;
	}

	public String getSmsCharge() {
		return smsCharge;
	}

	public void setSmsCharge(String smsCharge) {
		this.smsCharge = smsCharge;
	}

	public String getSameBankFreeTransaction() {
		return sameBankFreeTransaction;
	}

	public void setSameBankFreeTransaction(String sameBankFreeTransaction) {
		this.sameBankFreeTransaction = sameBankFreeTransaction;
	}

	public String getSameBankServiceTransaction() {
		return sameBankServiceTransaction;
	}

	public void setSameBankServiceTransaction(String sameBankServiceTransaction) {
		this.sameBankServiceTransaction = sameBankServiceTransaction;
	}

	public String getOtherBankFreeTransaction() {
		return otherBankFreeTransaction;
	}

	public void setOtherBankFreeTransaction(String otherBankFreeTransaction) {
		this.otherBankFreeTransaction = otherBankFreeTransaction;
	}

	public String getOtherBankServiceTransaction() {
		return otherBankServiceTransaction;
	}

	public void setOtherBankServiceTransaction(String otherBankServiceTransaction) {
		this.otherBankServiceTransaction = otherBankServiceTransaction;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	

}