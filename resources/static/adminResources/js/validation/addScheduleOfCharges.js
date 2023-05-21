function adddScheduleOfCharges() {

	if ($('#accountTypeSelect').val().trim() === '') {
		$('#accountTypeSelect').focus()
		showErrorToast('Please select AccountType')	
		return false;
	}else if ($('#interestRate').val().trim() === '') {
		$('#interestRate').focus()
		showErrorToast('Please enter Interest Rate')		
		return false;
	}else if ($('#amountRange').val().trim() === '') {
		$('#amountRange').focus()
		showErrorToast('Please enter Amount Range')		
		return false;
	}else if ($('#debitCardCharge').val().trim() === '') {
		$('#debitCardCharge').focus()
		showErrorToast('Please enter Debit Card Charge')		
		return false;
	}else if ($('#smsCharge').val().trim() === '') {
		$('#smsCharge').focus()
		showErrorToast('Please enter SMS Charge')		
		return false;
	}else if ($('#sameBankFreeTransaction').val().trim() === '') {
		$('#sameBankFreeTransaction').focus()
		showErrorToast('Please enter Same Bank Free Transaction')		
		return false;
	}else if ($('#sameBankServiceTransaction').val().trim() === '') {
		$('#sameBankServiceTransaction').focus()
		showErrorToast('Please enter Same Bank Service Transaction')		
		return false;
	}else if ($('#otherBankFreeTransaction').val().trim() === '') {
		$('#otherBankFreeTransaction').focus()
		showErrorToast('Please enter Other Bank Free Transaction')		
		return false;
	}else if ($('#otherBankServiceTransaction').val().trim() === '') {
		$('#otherBankServiceTransaction').focus()
		showErrorToast('Please enter Other Bank Service Transaction')		
		return false;
	}else {
		return true;
	}
}