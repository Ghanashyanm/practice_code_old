function addDocument() {

	if ($('#documentType').val().trim() === '') {
		$('#documentType').focus()
		showErrorToast('Please enter Document Type')
		return false;
	} else if ($('#documentDescription').val().trim() === '') {
		$('#documentDescription').focus()
		showErrorToast('Please enter Document Description')		
		return false;
	}else if ($('#documentFile').val().trim() === '') {
		$('#documentFile').focus()
		showErrorToast('Please upload Document File')		
		return false;
	}else {
		return true;
	}
}