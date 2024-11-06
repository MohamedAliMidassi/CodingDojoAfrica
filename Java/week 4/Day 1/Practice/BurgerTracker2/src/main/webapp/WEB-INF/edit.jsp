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
<title>Burger Tracker</title>
</head>
<body>
	<div class="container mt-3">


		<div class="col-5 bg-light p-4">
			<div class="d-flex justify-content-between align-items-baseline">
				<h3 class="text-primary">Edit ${ burger.name}</h3>
				<a href="/">Go Back</a>
			</div>
			<br>
			<form:form action="/updateBurger/${burger.id }" method="post"
				modelAttribute="burger">

				<input type="hidden" name="_method" value="put" />
				<!-- Overriding the post method in the form to "put" -->
				<form:label class="form-label" path="name">Burger Name</form:label>
				<form:input class="form-control" path="name" />
				<form:errors class="text-danger" path="name" />
				<br>

				<form:label class="form-label" path="location">Restaurant Name</form:label>
				<form:input class="form-control" path="location" />
				<form:errors class="text-danger" path="location" />
				<br>
				<form:label class="form-label" path="rating">Rating</form:label>
				<form:input type="number" class="form-control" path="rating" />
				<form:errors class="text-danger" path="rating" />
				<br>
				<form:label class="form-label" path="note">Note</form:label>
				<form:textarea class="form-control" path="note" />
				<form:errors class="text-danger" path="note" />
				<br>

				<input type="submit" value="Update" class="btn btn-primary mt-3" />

			</form:form>
		</div>


	</div>
</body>
</html>