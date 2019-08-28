window.onload = function() {
	document.getElementById('div1').style.display = "block";
	document.getElementById('div2').style.display = "none";

	var status = document.getElementById('status').value;
	var error = document.getElementById('error').value;
	var transId = document.getElementById('transId').value;
	
	if (status.localeCompare('false') == 0) {
		alert("Operation failed with error:\n" + error);
	} else if (status.localeCompare('true') == 0) {
		alert("Request submitted successfully for transaction ID: "+transId);
	}

}

function toggleFunction(event) {
	var caller = event.target.name;

	var one = document.getElementById('div1');
	var two = document.getElementById('div2');

	if (caller == "add") {
		one.style.display = 'block';
		two.style.display = 'none';
	} else if (caller == "view") {
		one.style.display = 'none';
		two.style.display = 'block';
	}
}

function validatefrom1() {

	var numbers = /^[0-9]+$/;
	var letters = /^[A-Za-z]+$/;

	fromAcc = document.addTrans.fromAcc.value;
	toAcc = document.addTrans.toAcc.value;
	amount = document.addTrans.amount.value;

	if (!fromAcc.match(numbers)) {
		alert("Reciever's Account field should be a number");
		return false;
	} else if (!toAcc.match(numbers)) {
		alert("Sender's Account field should be a number");
		return false;
	} else if (!toAcc.match(numbers)) {
		alert("Amount should a numeric Value");
		return false;
	} else if (amount < 10) {
		alert("Amount should be greater than 10");
		return false;
	} else {
		return true;
	}
}

function validateform2() {
	var id = document.readTrans.transId.value;
	var numbers = /^[0-9]+$/;

	if (!id.match(numbers)) {
		alert("Transaction ID should be a numeric value");
		return false;
	} else {
		return true;
	}
}