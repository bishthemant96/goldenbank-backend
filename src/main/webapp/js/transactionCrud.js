window.onload = function(){
	document.getElementById('div1').style.display="block";
	document.getElementById('div2').style.display="none";
	
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
	var two = document.getElementById('div2');
	
	
	if(caller=="add"){
		one.style.display = 'block';
		two.style.display = 'none';
	} else if(caller=="view"){
        one.style.display = 'none';
        two.style.display = 'block';
	} 
}

function validateViewTrans(){
	
	fromAcc=document.addTrans.fromAcc.value;
	toAcc=document.addTrans.toAcc.value;
	amount=document.addTrans.amount.value;
	
	if(amount<10){
		alert("Enter Amount greater than 10");
		  return false;
	}
}

