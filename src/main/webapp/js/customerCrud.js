window.onload = function(){
	document.getElementById('div1').style.display='block';
	document.getElementById('div2').style.display='none';
	document.getElementById('div3').style.display='none';
	document.getElementById('div4').style.display='none';
	
	
	var status = document.getElementById('status').value;
	if(status.localeCompare('false')==0){
		alert("Requested operation couldn't be performed.");
	} else if(status.localeCompare('true')==1){
		alert("Request submitted successfully.");
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
	var pwd=document.myform1.cusPassword.value;
	var no=document.myform1.cusNo.value;
	
	var numbers = /^[0-9]+$/;
	var letters = /^[A-Za-z]+$/;
	
	
	if (name==null || name==""){  
		alert("Name can't be blank");  
		return false;  
	} 
	else {
		if(name.match(letters))
		{
			return true;
		}
		else
		{
			alert("name should be a text field");
			return false;
		}
	}
	
	
	
	if(age==null || age==""){  
		alert("Age can't be empty");  
		return false;
	}
	else{
		if(age.match(numbers) && age>=18 && age<111){
			return true;
		}
		else{
			alert("Age should be a number and in the range of 18-110");  
			return false;
		}
	}
		
	
	if(pwd==null || pwd=="" && pwd.length>5){  
		alert("Fill the password with atleast 6 characters");  
		return false;  
	}

	else if(no==null || no==""){  
		alert("Number can not be empty");  
		return false;
		if(no.match(numbers) && no<10){
			return true;
		}
		else{
			alert("Number should be a numeric value");  
			return false;
		}
	}   	
}


function validateform2(){  
	var id=document.myform2.cusID.value;  
	  
	if (id==null || id==""){  
	  alert("User ID can't be blank");  
	  return false;  
	}  
	}  

function validateform3(){  
	var id=document.myform3.cusID.value;  
	  
	if (id==null || id==""){  
	  alert("User ID can't be blank");  
	  return false;  
	}  
	}  

function validateform4(){  
	var id=document.myform4.cusID.value;  
	  
	if (id==null || id==""){  
	  alert("User ID can't be blank");  
	  return false;  
	}  
	}  

