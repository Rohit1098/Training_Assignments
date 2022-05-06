<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style>
.error {
	color: red;
	background-color: cyan;
}
</style>
<meta charset="ISO-8859-1">
<title>item insert</title>
</head>
<body>
	<form:form action="datalist" modelAttribute="objuser">
		<table border="1" align="center">
			<tr>
				<td>Item</td>
				<td><form:input path="item" /> <form:errors
						path="item" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Category</td>
				<td><form:input path="category" /> <form:errors
						path="category" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Coustomer</td>
				<td><form:input path="customer" /> <form:errors path="customer"
						cssClass="error" /></td>
			</tr>
			
			<tr>

				<td colspan="2"><input type="submit" value="insertData" /></td>
			</tr></table>
	</form:form>

</body>
</html>