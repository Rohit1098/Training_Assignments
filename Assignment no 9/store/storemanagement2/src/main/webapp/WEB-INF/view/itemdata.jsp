<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

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
	<form action="itemmm"  modelAttribute="objuser">
		<table border="1" align="center">
			<tr>
				<td>itemname</td>
				<td><input path="itemname" /> </td>
			</tr>

			<tr>
				<td>itemprice</td>
				<td><input path="itemprice" /> </td>
			</tr>

			<tr>
				<td>itemqty</td>
				<td><input path="itemqty" /> </td>
			</tr>
			<tr>
				<td>itemdiscount</td>
				<td><input path="itemdiscount" /></td>
			</tr>

			<tr>

				<td colspan="2"><input type="submit" value="insertData" /></td>
			</tr>
		</table>
	</form>

</body>
</html>