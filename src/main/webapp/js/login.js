function validateform(){  
var name=document.myform.empID.value;  
var password=document.myform.empPassword.value;  
  
if (name==null || name==""){  
  alert("User ID can't be blank");  
  return false;  
}else if(password==null || password==""){  
  alert("Fill the password");  
  return false;  
  }  
}  