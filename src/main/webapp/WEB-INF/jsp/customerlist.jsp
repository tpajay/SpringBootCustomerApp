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
a:hover {
	background-color: #82a7ce;
	color: white;
}
</style>

<body>
	<table style="background-color: #c7d3d2">
		<tr>
			<td>&nbsp</td>
			<td>&nbsp</td>
			<td><a class="thisbold" href="/customer/page/new">New Customer</a></td>
		</tr>
	</table>
	
	<h1>Customer Listing</h1>
	
	<table>
		<c:forEach items="${customerlist}" var="customer">
		   <tr>
			   <td><a href="/customer/page/${customer.id}">${customer.lname}, ${customer.fname}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>

</html>
