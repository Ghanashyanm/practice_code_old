function addAccountType() {

	if ($('#accountType').val().trim() === '') {
		$('#accountType').focus()
		showErrorToast('Please enter Account Type')
		return false;
	} else if ($('#accountDescription').val().trim() === '') {
		$('#accountDescription').focus()
		showErrorToast('Please enter Account Description')		
		return false;
	}else {
		return true;
	}
}