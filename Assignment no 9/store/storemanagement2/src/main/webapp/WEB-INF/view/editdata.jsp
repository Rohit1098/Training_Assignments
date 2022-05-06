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
	<form:form action="edititem"  modelAttribute="objuser">
		<table border="1" align="center">
		
			
		

			<tr>
				<td>Item</td>
				<td><form:input path="item" /> <form:errors
						path="item" cssClass="error" /></td>
			</tr>

			<tr>
				<td>category</td>
				<td><form:input path="category" /> <form:errors path="category"
						cssClass="error" /></td>
			<tr>

			<td colspan="2"><input type="submit" value="insertData" /></td>
			</tr>
			
			<tr>
				<td>uid</td>
				<td><form:input path="uid" /> <form:errors path="uid"
						cssClass="error" /></td></tr>
			
		</table>
	</form:form>

</body>
</html>