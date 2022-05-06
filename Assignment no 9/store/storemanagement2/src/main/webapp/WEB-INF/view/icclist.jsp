<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Item Info</title>
</head>
<body>
	<table align="center">
		<tr>
			
			<td>Item Name</td>
			<td>Item Category</td>
			<td>Item Customer</td>
		
	
		</tr>
		<c:forEach var="ul" items="${itemlist}">
			<tr>
			    
				<td>${ul.item}</td>
				<td>${ul.category}</td>
				<td>${ul.customer}</td>
				
				
				
				
				
				
			</tr>
		</c:forEach>


	</table>
	
</body>
</html>