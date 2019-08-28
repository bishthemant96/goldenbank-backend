window.onload = function(){
	document.getElementById('div1').style.display="block";
	document.getElementById('div2').style.display="none";
	document.getElementById('div3').style.display="none";
	document.getElementById('div4').style.display="none";
	
	var status = document.getElementById('status').value;
	var error = document.getElementById('error').value;
	var accNo = document.getElementById('accNo').value;
	
	if(status.localeCompare('false')==0){
		alert("Operation failed with error:\n"+error);
	} else if(status.localeCompare('true')==0){
		alert("Request submitted successfully for account: "+accNo);
	}
	
}

function toggleFunction(event) {
	var caller = event.target.name;
	
	var one = document.getElementById('div1');
	var two = document.getElementById('div2');
	var three = document.getElementById('div3');
	var four = document.getElementById('div4');
	
	
	if(caller=="add"){
		one.style.display = 'block';
		two.style.display = 'none';
		three.style.display = 'none';
		four.style.display = 'none';
	} else if(caller=="update"){
        one.style.display = 'none';
        two.style.display = 'block';
        three.style.display = 'none';
        four.style.display = 'none';
	} else if(caller=="delete"){
        one.style.display = 'none';
        two.style.display = 'none';
        three.style.display = 'block';
        four.style.display = 'none';
	} else if(caller=="view"){
        one.style.display = 'none';
        two.style.display = 'none';
        three.style.display = 'none';
        four.style.display = 'block';
	}
}

function validateAccountForm(){  
	var cusID=document.accountForm.cusID.value;  
	var branch=document.accountForm.branch.value; 
	var amount=document.accountForm.amount.value;
	var accType=document.accountForm.accType.value;
	var accNominee=document.accountForm.accNominee.value;

	
	var numbers = /^[0-9]+$/;
	var letters = /^[A-Z / a-z]+$/;
	
	if (!cusID.match(numbers)) {
		alert("Customer ID should be whole number.");
		return false;
	} else if(!branch.match(letters)){
		alert("Branch should be aplhabetic.");  
		return false;
	} else if(!amount.match(numbers)){
		alert("Amount should be whole number.");  
		return false;
	} else if(!accType.match(letters)){
		alert("Account type should be alphabetic.");
		return false;
	} else if(!accNominee.match(letters)){  
		alert("Account nominee should be alphabetic.");  
		return false;  
	} else {
		return true;
	}
}


function validateUpdateAccountForm(){  
	var numbers = /^[0-9]+$/;
	var id=document.updateAccountForm.accNo.value;  
	
	if (!id.match(numbers)){  
	  alert("User ID should be whole number.");  
	  return false;  
	}  else{
		return true;
	}
}  

function validateDeleteAccountForm(){  
	var numbers = /^[0-9]+$/;
	var id=document.deleteAccountForm.accNo.value;  
	
	if (!id.match(numbers)){  
	  alert("User ID should be whole number.");  
	  return false;  
	}  else{
		return true;
	}
}  

function validateViewAccountForm(){ 
	var numbers = /^[0-9]+$/;
	var id=document.viewAccountForm.accNo.value;  
	
	if (!id.match(numbers)){  
	  alert("User ID should be whole number.");  
	  return false;  
	}  else{
		return true;
	}
}  


function validateFullUpdateAccountForm(){    
	var branch=document.fullUpdateAccountForm.branch.value; 
	var amount=document.fullUpdateAccountForm.amount.value;
	var accType=document.fullUpdateAccountForm.accType.value;
	var accNominee=document.fullUpdateAccountForm.accNominee.value;

	
	var numbers = /^[0-9]+$/;
	var letters = /^[A-Z / a-z]+$/;
	
	if(!branch.match(letters)){
		alert("Branch should be aplhabetic.");  
		return false;
	} else if(!amount.match(numbers)){
		alert("Amount should be whole number.");  
		return false;
	} else if(!accType.match(letters)){
		alert("Account type should be alphabetic.");
		return false;
	} else if(!accNominee.match(letters)){  
		alert("Account nominee should be alphabetic.");  
		return false;  
	} else {
		return true;
	}
}


