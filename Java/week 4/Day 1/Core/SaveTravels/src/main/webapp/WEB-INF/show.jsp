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
<title>Show Expense</title>
</head>
<body>
	<div class="container mt-3">
		
			<div class="d-flex justify-content-between">
				<h1>Expense Details</h1>
				<a href="/">Go Back</a>
			</div>
			<div class="col-8 bg-light p-4">
				<h3>Expense Name: ${travel.name }</h3>
				<h3>Expense Description: ${travel.description }</h3>
				<h3>Vendor: ${travel.vendor }</h3>
				<h3>Amount Spent: $ ${travel.price }</h3>
			</div>
		</div>


</body>
</html>