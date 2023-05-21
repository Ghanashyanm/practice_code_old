function addLoanType() {

	if ($('#loanType').val().trim() === '') {
		$('#loanType').focus()
		showErrorToast('Please enter Loan Type')
		return false;
	} else if ($('#loanDescription').val().trim() === '') {
		$('#loanDescription').focus()
		showErrorToast('Please enter Loan Description')		
		return false;
	}else {
		return true;
	}
}