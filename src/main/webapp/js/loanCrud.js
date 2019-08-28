window.onload = function() {
	document.getElementById('div1').style.display = "block";
	document.getElementById('div3').style.display = "none";
	document.getElementById('div4').style.display = "none";

	var status = document.getElementById('status').value;
	var error = document.getElementById('error').value;
	var loanAccNo = document.getElementById('loanAccNo').value;
	
	if (status.localeCompare('false') == 0) {
		alert("Operation failed with error:\n" + error);
	} else if (status.localeCompare('true') == 0) {
		alert("Request submitted successfully for loan account no.:"+loanAccNo);
	}

}

function toggleFunction(event) {
	var caller = event.target.name;

	var one = document.getElementById('div1');
	var three = document.getElementById('div3');
	var four = document.getElementById('div4');

	if (caller == "add") {
		one.style.display = 'block';
		three.style.display = 'none';
		four.style.display = 'none';
	} else if (caller == "delete") {
		one.style.display = 'none';
		three.style.display = 'block';
		four.style.display = 'none';
	} else if (caller == "view") {
		one.style.display = 'none';
		three.style.display = 'none';
		four.style.display = 'block';
	}
}

function validateform1() {
	var id = document.myform1.cusID.value;
	var branch = document.myform1.branch.value;
	var loanType = document.myform1.loanType.value;
	var amount = document.myform1.amount.value;

	var numbers = /^[0-9]+$/;
	var letters = /^[A-Z / a-z]+$/;

	if (!branch.match(letters)) {
		alert("branch should be a text field");
		return false;
	} else if (!id.match(numbers)) {
		alert("ID should be a number");
		return false;
	} else if (!loanType.match(letters)) {
		alert("Loan Type should be alphabetic");
		return false;
	} else if (!amount.match(numbers)) {
		alert("amount can not be empty");
		return false;
	} else if (amount < 100) {
		alert("Minimun transaction value should be greater than Rs 100");
		return false;
	} else {
		return true;
	}
}

function validateform2() {
	var id = document.myform2.loanAccNo.value;
	var numbers = /^[0-9]+$/;

	if (!id.match(numbers)) {
		alert("Loan Account Number should be a numeric value");
		return false;
	} else {
		return true;
	}
}

function validateform3() {
	var id = document.myform3.loanAccNo.value;
	var numbers = /^[0-9]+$/;

	if (!id.match(numbers)) {
		alert("Loan Account Number should be a numeric value");
		return false;
	} else {
		return true;
	}
}
