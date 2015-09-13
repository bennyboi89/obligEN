<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Handleliste</title>
</head>
<body>
<h1>Din handleliste</h1>
<c:forEach var="produkt" items="${vareListe}">
	Navn: ${produkt.navn} Pris: ${produkt.pris}<br/>
</c:forEach>

<h1>Legge til handlelisten</h1>
<form method="post" action="addProdukt">
	Navn: <input type="text" name="Navn" /> Pris: <input type="text" name="pris" />
	<button>Legge til</button>
</form>
</body>
</html>
