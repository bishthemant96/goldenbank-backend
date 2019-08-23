window.onload = function(){
	document.getElementById('div1').style.display="block";
	document.getElementById('div3').style.display="none";
	document.getElementById('div4').style.display="none";
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