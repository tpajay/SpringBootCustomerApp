<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">

<script>
function showPopup() {
	var x;
	if(x=null) {
			alert("onfocus! value: " + document.forms[0].fname.value);
	}
	var x=1;
}

function createPerson() {
	//Person person = new Person();
	//person
}
</script>

<style>
.thisred {
	color:red;
	font-weight:bold;
}
</style>

<body>
	<table style="background-color: #c7d3d2">
		<tr>
			<td><a class="thisbold" href="/customer/page/list">Customer List</a></td>
			<td>&nbsp</td>
			<td>&nbsp</td>
		</tr>
	</table>
	
	<h1>New Customer</h1>	
	
	<form method="POST" action="/customer/page/submit" >
		
		First Name: <input type="text" name="fname" /> <br/>
		Last Name: <input type="text" name="lname" onfocus="showPopup()"/> <br/>
		
		<input type="submit" />
	
	</form>
	
    
</body>

</html>
