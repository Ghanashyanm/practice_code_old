function addLoan() {
	if ($('#loanTypeSelect').val().trim() === '') {
		$('#loanTypeSelect').focus()
		showErrorToast('Please select Loan Type')
		return false;
	} else if ($('#interestTypeSelect').val().trim() === '') {
		$('#interestTypeSelect').focus()
		showErrorToast('Please select Interest Type')
		return false;
	}else if ($('#interestRate').val().trim() === '') {
		$('#interestRate').focus()
		showErrorToast('Please enter Interest Rate')
		return false;
	}else if ($('#loanAmount').val().trim() === '') {
		$('#loanAmount').focus()
		showErrorToast('Please enter Loan Amount')
		return false;
	}else if ($('#tenure').val().trim() === '') {
		$('#tenure').focus()
		showErrorToast('Please enter Tenure ')
		return false;
	}else if ($('#description').val().trim() === '') {
		$('#description').focus()
		showErrorToast('Please enter Description')		
		return false;
	}else {
		return true;
	}
}