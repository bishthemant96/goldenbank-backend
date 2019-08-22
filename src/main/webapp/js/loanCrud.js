window.onload = function(){
	document.getElementById('div1').style.display="block";
	document.getElementById('div2').style.display="none";

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