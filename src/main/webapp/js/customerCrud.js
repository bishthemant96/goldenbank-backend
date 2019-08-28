window.onload = function(){
	document.getElementById('div1').style.display='block';
	document.getElementById('div2').style.display='none';
	document.getElementById('div3').style.display='none';
	document.getElementById('div4').style.display='none';
	
	
	var status = document.getElementById('status').value;
	var error = document.getElementById('error').value;
	var cusID = document.getElementById('cusID').value;
	

	if(status.localeCompare('false')==0){
		alert("Operation failed with error:\n"+error);
	} else if(status.localeCompare('true')==0){
		alert("Request submitted successfully for cusID:"+cusID);
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


function validateform1(){  
	var name=document.myform1.cusName.value;  
	var age=document.myform1.cusAge.value; 
	var gender=document.myform1.cusGender.value;
	var pwd=document.myform1.cusPassword.value;
	var email=document.myform1.cusEmail.value;
	var cusAddress=document.myform1.cusAddress.value;
	var no=document.myform1.cusNo.value;
	var cusNationality=document.myform1.cusNationality.value;
	
	var numbers = /^[0-9]+$/;
	var letters = /^[A-Z / a-z]+$/;
	
	if (!name.match(letters)) {
		alert("Name should be aplhabetic.");
		return false;
	} else if(!(age.match(numbers) && age>=18 && age<151)){
		alert("Age should be a number(18-150)");  
		return false;
	} else if(!gender.match(letters)){
		alert("Gender should be alphabetic.");  
		return false;
	} else if(email.length>100){
		alert("Email is too long.");
		return false;
	} else if(pwd.length<5){  
		alert("Plese enter password of length 6");  
		return false;  
	} else if(!no.match(numbers)){
		alert("Number should be a numeric value");  
		return false;
	} else if(no.length!=10){
		alert("Enter a valid mobile number.");
		return false;
	} else if(!cusNationality.match(letters)) {
		alert("Nationality should be alphabetic.");
		return false;
	} else {
		return true;
	}
}


function validateform2(){  
	var numbers = /^[0-9]+$/;
	var id=document.myform2.cusID.value;  
	
	if (!id.match(numbers)){  
	  alert("User ID should be whole number.");  
	  return false;  
	}  else{
		return true;
	}
}  

function validateform3(){  
	var numbers = /^[0-9]+$/;
	var id=document.myform3.cusID.value;  
	
	if (!id.match(numbers)){  
	  alert("User ID should be whole number.");  
	  return false;  
	}  else{
		return true;
	}
}  

function validateform4(){ 
	var numbers = /^[0-9]+$/;
	var id=document.myform4.cusID.value;  
	
	if (!id.match(numbers)){  
	  alert("User ID should be whole number.");  
	  return false;  
	}  else{
		return true;
	}
}  


function validateform5(){
	var name=document.myform1.cusName.value;  
	var age=document.myform1.cusAge.value; 
	var gender=document.myform1.cusGender.value;
	var email=document.myform1.cusEmail.value;
	var cusAddress=document.myform1.cusAddress.value;
	var no=document.myform1.cusNo.value;
	var cusNationality=document.myform1.cusNationality.value;
	
	var numbers = /^[0-9]+$/;
	var letters = /^[A-Z / a-z]+$/;
	
	if (!name.match(letters)) {
		alert("Name should be aplhabetic.");
		return false;
	} else if(!(age.match(numbers) && age>=18 && age<151)){
		alert("Age should be a number(18-150)");  
		return false;
	} else if(!gender.match(letters)){
		alert("Gender should be alphabetic.");  
		return false;
	} else if(email.length>100){
		alert("Email is too long.");
		return false;
	} else if(!no.match(numbers)){
		alert("Number should be a numeric value");  
		return false;
	} else if(no.length!=10){
		alert("Enter a valid mobile number.");
		return false;
	} else if(!cusNationality.match(letters)) {
		alert("Nationality should be alphabetic.");
		return false;
	} else {
		return true;
	}
}
