function addRequiredDocValidation(){
	
	var account=document.getElementById("account");
	var loan=document.getElementById("loan");
	
	var requiredDocTable = document.getElementById("requiredDocTable");
	var x = requiredDocTable.parentNode.parentNode;
	console.log(x.rowIndex);
	
	if(account.checked)
	{
		if($('#accountTypeSelect').val().trim() === '')
		{
			$('#accountTypeSelect').focus()
			showErrorToast('Please enter Account Type')
			return false;
		}
	}
	
	if(loan.checked)
	{ 
		if ($('#loanTypeSelect').val().trim() === '')
		{
			$('#loanTypeSelect').focus()
			showErrorToast('Please enter Loan Type')		
			return false;
		}
	}
	
	if($('#requiredDocTable').children().length == 0) {
		$('#requiredDocTable').focus()
		showErrorToast('Please add Document in Table')		
		return false;
	}
	else{
		return true;
	}
}