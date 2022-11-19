<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome to the Java EE World</title>
<script type = "text/javascript">
	function validateInput(form){
		var re = /^[\w ]+$;
		 
		if(form.userNumber1.value == "") {
			alert("Error: Box1 is empty");
			return false;
		} else if(form.userNumber2.value == ""){
			alert("Error: Box2 is empty");
			return false;
		} else if(form.userNumber3.value == ""){
			alert("Error: Box3 is empty");
			return false;
		}
		return true;
	}
</script>
</head>
<body>
<h1>Addition!</h1>
<form action="getAdditionServlet" method="post" onsubmit ="return validateInput(this);">
Enter 3 numbers you would like to add:
<input  type="text" name ="userNumber1" size="10">
<input  type="text" name ="userNumber2" size="10">
<input  type="text" name ="userNumber3" size="10">
<input type="submit" value="Add Arguments"/>
</form>
<script type = "text/javascript">
	function validateInput2(form){
		var re = /^[\w ]+$;
		 
		if(form.userNumber1.value == 0) {
			alert("Error: Box1 is empty");
			form.userNumber1.focus();
			return false;
		} else if(form.userNumber2.value == 0){
			alert("Error: Box2 is empty");
			form.userNumber2.focus();
			return false;
		}
		return true;
	}
</script>
<form action="getSubtractionServlet" method="post" onsubmit="return validateInput2(this);">
Enter 2 numbers you would like to subtract:
<input type="text" name ="userNumber1" size="10" >
<input type="text" name ="userNumber2" size="10">
<input type="submit" value="Add Arguments"/>
</form>
</body>
</html>