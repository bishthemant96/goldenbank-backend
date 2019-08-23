window.onload = function(){
	document.getElementById('div1').style.display="block";
	document.getElementById('div2').style.display="none";
	document.getElementById('div3').style.display="none";
	document.getElementById('div4').style.display="none";
	
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