<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="/css/styles.css">
<title>Reading Books</title>
</head>
<body>
	<h1> ${ book.title } </h1>
	<br>
	<h3>Description: ${ book.description } </h3>
	<h3>Language: ${ book.language } </h3>
	<h3>Number of Pages: ${ book.numberOfPages } </h3>

</body>
</html>