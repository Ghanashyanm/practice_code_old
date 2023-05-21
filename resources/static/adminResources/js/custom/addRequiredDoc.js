function display() {
	var account=document.getElementById("account");
	var loan=document.getElementById("loan");
	
	var accountType=document.getElementById("accountType");
	var loanType=document.getElementById("loanType");
	
	if(account.checked){
		
		accountType.style.display = "";
		
	}
	else
		{
		accountType.style.display = "none";
		}
	
	if(loan.checked){
		loanType.style.display = "";
	}
	else
		{
		loanType.style.display = "none";
		}
	 
}

var i = 1;
function addRequiredDoc()
{ 
	var RequiredDocTable = document.getElementById("requiredDocTable");
	
	var requiredDoc = document.getElementById("requiredDoc");
	
	if(requiredDoc.value != ""){
		
	var r = RequiredDocTable.insertRow(-1);
	var c1 = r.insertCell(0);
	var c2 = r.insertCell(1);
	var c3 = r.insertCell(2);
	
	c1.innerHTML = i++;
	c2.innerHTML = '<input type="hidden" name="requiredDocId" value="'+requiredDoc.value+'">'  + 
	requiredDoc.options[requiredDoc.selectedIndex].text
	c3.innerHTML = '<a href="#" onclick="delRow(this)"><i class="mdi mdi-delete lead text-danger"></i></a>';
	
	}
}
function delRow(a)
{
	var RequiredDocTable = document.getElementById("docTable");
	var r = a.parentNode.parentNode;
		
	RequiredDocTable.deleteRow(r.rowIndex);	
	
}

function getDocDetails(id){
	
	var requiredDocTable = document.getElementById("requiredDocTable");
	var modalTitle = document.getElementById("modalTitle");
		
	var htp = new XMLHttpRequest();

	var data = '';
	
	var title ;
	
	//var path = "E:/Project/com.bankingAlexa/src/main/webapp/document/reqDocument/"
	//getContext = "http://localhost:9090/document/reqDocument/";
	
	var filePath = "/document/reqDocument/";
	
	htp.onreadystatechange = function() {

		if (htp.readyState == 4) {

			var jsn = JSON.parse(htp.responseText);

			console.log(jsn);
			
			if (jsn && jsn.length > 0) {

				title = jsn[0];
				
				for (var i = 0; i < jsn.length; i++) {

					const file = filePath + jsn[i].documentVO.documentFileName
					
					//console.log(path);	
					//console.log(jsn[i].documentVO.documentFileName)
					
					data = data + '<tr>';
					data = data + '<td>'+ ( i+1) +'</td>';
					data = data + '<td>'+ jsn[i].documentVO.documentType +'</td>';
					data = data + '<td><a href="'+file+'" target="_blank"><img src="'+file+'"></a></td>';
					data = data + '</tr>';
					
				}
			}
			
			if(title.requiredDocVO.accountTypeVO && title.requiredDocVO.accountTypeVO.accountType){
				modalTitle.innerHTML = title.requiredDocVO.accountTypeVO.accountType;	
			}
			
			if(title.requiredDocVO.loanTypeVO && title.requiredDocVO.loanTypeVO.loanType){
				modalTitle.innerHTML = title.requiredDocVO.loanTypeVO.loanType;
			}
			
			
			
			requiredDocTable.innerHTML = data;
			$('#exampleModal').modal('show');
		}
	}

	htp.open("get", "getDocDetails?id=" + id, true);
	htp.send();
	
}
