window.onload = function(){
	document.getElementById('div1').style.display="block";
	document.getElementById('div3').style.display="none";
	document.getElementById('div4').style.display="none";
	
	
	var status = document.getElementById('status').value;
	var error = document.getElementById('error').value;
	if(status.localeCompare('false')==0){
		alert("Operation failed with error:\n"+error);
	} else if(status.localeCompare('true')==1){
		alert("Request submitted successfully.");
	}
	
}

function toggleFunction(event) {
	var caller = event.target.name;
	
	var one = document.getElementById('div1');
	var three = document.getElementById('div3');
	var four = document.getElementById('div4');
	
	
	if(caller=="add"){
		one.style.display = 'block';
		three.style.display = 'none';
		four.style.display = 'none';
	} else if(caller=="delete"){
        one.style.display = 'none';
        three.style.display = 'block';
        four.style.display = 'none';
	} else if(caller=="view"){
        one.style.display = 'none';
        three.style.display = 'none';
        four.style.display = 'block';
	}
}



function validateform1(){  
	var id=document.myform1.cusID.value;  
	var branch=document.myform1.branch.value;       
	var loanType=document.myform1.loanType.value;
	var amount=document.myform1.amount.value;
	
	var numbers = /^[0-9]+$/;
	var letters = /^[A-Za-z]+$/;
	
	
	if (branch==null || branch==""){  
		alert("branch can't be blank");  
		return false;  
	} 
	else {
		if(branch.match(letters))
		{
			return true;
		}
		else
		{
			alert("branch should be a text field");
			return false;
		}
	}
	
	
	
	if(id==null || id==""){  
		alert("ID can't be empty");  
		return false;
	}
	else{
		if(id.match(numbers)){
			return true;
		}
		else{
			alert("ID should be a number");  
			return false;
		}
	}
		
	
	if(loanType==null || loanType==""){  
		alert("LoanType is a required field");  
		return false;
		if(loanType.match(letters))
		{
			return true;
		}
		else
		{
			alert("loanType should be a text field");
			return false;
		}
	}

	else if(amount==null || amount==""){  
		alert("amount can not be empty");  
		return false;
		if(amount.match(numbers) && amount>=2000){
			return true;
		}
		else{
			alert("amount should be a numeric value and minimum 2000 rs");  
			return false;
		}
	}   	
}


function validateform2(){  
	var id=document.myform2.loanAccNo.value;  
	  
	if (id==null || id==""){  
	  alert("loanAccNo can't be blank");  
	  return false;  
	}  
	}  

function validateform3(){  
	var id=document.myform3.loanAccNo.value;  
	  
	if (id==null || id==""){  
	  alert("User loanAccNo can't be blank");  
	  return false;  
	}  
	}

