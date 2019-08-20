function myFunction1() {
	    var x = document.getElementById('div1');
	    if (x.style.display === 'none') {
	        x.style.display = 'block';
	    } else {
	        x.style.display = 'none';
	    }
	}
	
	function myFunction2() {
	    var x = document.getElementById('div2');
	    if (x.style.display === 'none') {
	        x.style.display = 'block';
	    } else {
	        x.style.display = 'none';
	    }
	}
	
	function myFunction3() {
	    var x = document.getElementById('div3');
	    if (x.style.display === 'none') {
	        x.style.display = 'block';
	    } else {
	        x.style.display = 'none';
	    }
	}
	
	function myFunction4() {
	    var x = document.getElementById('div4');
	    if (x.style.display === 'none') {
	        x.style.display = 'block';
	    } else {
	        x.style.display = 'none';
	    }
	}
	
	function main()
	{
	    $('#showdiv1').on('click', function() 
		{
	        $('#div1').toggle();
	    });
		
		
	    $('#showdiv2').on('click', function() 
		{
	        $('#div2').toggle();
	    });
		
		
		$('#showdiv3').on('click', function() 
		{
	        $('#div3').toggle();
	    });
	
		$('#showdiv4').on('click', function() 
		{
			$('#div4').toggle();
	    });
	}
	