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
<title>Insert title here</title>
</head>
<body>
	<div class="container mt-3">
		<div class="col-5 bg-light p-4">
			<h1>Welcome!</h1>
			<h3>Join our growing community!</h3>
			<form:form action="register" method="post" modelAttribute="newUser">
				<div class="form-group">
					<label>User Name</label>
					<form:input path="userName" class="form-control" />
					<form:errors path="userName" class="text-danger" />
				</div>
				<div class="form-group">
					<label>Emal</label>
					<form:input path="email" class="form-control" />
					<form:errors path="email" class="text-danger" />
				</div>
				<div class="form-group">
					<label>Password</label>
					<form:input path="password" class="form-control" />
					<form:errors path="password" class="text-danger" />
				</div>
				<div class="form-group">
					<label>Confirm Password</label>
					<form:input path="confirmPassword" class="form-control" />
					<form:errors path="confirmPassword" class="text-danger" />
				</div>
				<div class="d-grid gap-2">
					<input type="submit" value="Register" class="btn btn-primary mt-3" />
				</div>
			</form:form>
		</div>
		<div class="col-5 bg-light p-4">
				<h3>Login</h3>
				<form:form action="/login" method="post" modelAttribute="newLogin">
					<div class="form-group">
						<label>Email</label>
						<form:input path="email" class="form-control" />
						<form:errors path="email" class="text-danger" />
					</div>
					<div class="form-group">
						<label>Password</label>
						<form:password path="password" class="form-control" />
						<form:errors path="password" class="text-danger" />
					</div>
					<div class="d-grid gap-2">
						<input type="submit" value="Login" class="btn btn-success mt-3" />
					</div>
				</form:form>
			</div>

	</div>
</body>
</html>