<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!-- for Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<!-- <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" /> -->

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Share</title>
</head>
<body>
	<div class="container mt-3">
		<div>
			<h1>Add a Book to Your Shelf</h1>
			<a href="/books">back to the Shelf</a>
		</div>
		<form:form action="/processBook" method="post" modelAttribute="book">
			<form:label class="form-label" path="title">Title</form:label>
			<form:input class="form-control" path="title" />
			<form:errors class="text-danger" path="title" />
			<br>
			<form:label class="form-label" path="author">Author</form:label>
			<form:input class="form-control" path="author" />
			<form:errors class="text-danger" path="author" />
			<br>
			<form:label class="form-label" path="thoughts">My Thoughts</form:label>
			<form:textarea class="form-control" path="thoughts" />
			<form:errors class="text-danger" path="thoughts" />
			<br>
			<div class="d-flex justify-content-between">
				<a href="/books" class="btn btn-danger">Cancel</a> 
				<input type="submit" value="Create" class="btn btn-success" />
			</div>
		</form:form>

	</div>
</body>
</html>