<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">

<head>
	<!-- <link rel="stylesheet" href='<c:url value="/resources/css/bootstrap.css" />' /> -->
</head>

<script>
</script>

<style>
.thisred {
	color:red;
	font-weight:bold;
}

.thisbold {
	font-weight:bold;
}
</style>

<body>
	<table style="background-color: #c7d3d2">
		<tr>
			<td><a class="thisbold" href="/customer/page/list">Customer List</a></td>
			<td>&nbsp</td>
			<td><a class="thisbold" href="/customer/page/new">New Customer</a></td>
		</tr>
	</table>
	
	<h1>Customer Details</h1>
	
	<table>
		<tr class="thisred">
			<td>Customer ID:</td>
			<td>${customer.id}</td>
		</tr>
		<tr>
			<td>First Name:</td>
			<td>${customer.fname}</td>
		</tr>
		<tr>
			<td>Last Name:</td>
			<td>${customer.lname}</td>
		</tr>		
	</table>	
	
</body>

</html>
