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
<title>Save Travels</title>
</head>
<body>
	<div class="container mt-3">
	<h1 class="text-primary">Safe Travels</h1>
		<div>
			<table class="table">
				<thead>
					<tr class="bg-info">
						<th>Expense</th>
						<th>Vendor</th>
						<th>Amount</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${allTravels}" var="oneTravel">
						<tr>
							<td><a href="/travel/show/${oneTravel.id}">${oneTravel.vendor}</a></td>
							<td>${oneTravel.name}</td>
							<td>${oneTravel.price}</td>
							<td>
								<div class="d-flex">
									<div >
										<a href="/travels/edit/${oneTravel.id }"
											class="btn btn-primary">Edit</a>
									</div>
									<form action="/delete/travels/${oneTravel.id }" method="post">
										<input type="hidden" name="_method" value="delete" />
										<!-- Overriding the post method in the form to "put" -->
										<input class="btn btn-danger" type="submit" value="Delete" />
									</form>
								</div>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="col-5 bg-light p-4">
			<h3 class="text-primary">Add an Expense</h3>
			<form:form action="/newTravel" method="post" modelAttribute="travel">
				<form:label class="form-label" path="name">Expense Name</form:label>
				<form:input class="form-control" path="name" />
				<form:errors class="text-danger" path="name" />

				<form:label class="form-label" path="vendor">Vendor</form:label>
				<form:input class="form-control" path="vendor" />
				<form:errors class="text-danger" path="vendor" />

				<form:label class="form-label" path="price">Amount</form:label>
				<form:input type="number" class="form-control" path="price" />
				<form:errors class="text-danger" path="price" />

				<form:label class="form-label" path="description">Description</form:label>
				<form:textarea class="form-control" path="description" />
				<form:errors class="text-danger" path="description" />

				<input type="submit" value="Create" class="btn btn-primary" />
			</form:form>

		</div>

	</div>

</body>
</html>