<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<form action="edititem">

	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<!DOCTYPE html>
	<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table align="center">
		<tr>
			<td>itemno</td>
			<td>Item Name</td>
			<td>Item Price</td>
			<td>Item Qty</td>
			<td>Item Discount</td>
			<td>Total price</td>

		</tr>
		<c:forEach var="ul" items="${itemlist}">
			<tr>
				<td>${ul.itemno}</td>
				<td>${ul.itemname}</td>
				<td>${ul.itemprice}</td>
				<td>${ul.itemqty}</td>
				<td>${ul.itemdiscount}</td>
				<td>${ul.rr}</td>
		</c:forEach>


		
	</table>
	
	
	
		<form action="edititem">
			for edititem all data <input type="submit">

			</tr></form>
			
			
	 <form action="deleteitem">
				for delete item data <input type="submit">

				</tr></form>
</body>
	</html>