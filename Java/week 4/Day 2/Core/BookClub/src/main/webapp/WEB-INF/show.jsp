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
<title>Read Share</title>
</head>
<body>
	<div class="container mt-3">
		<div class="d-flex justify-content-between">
			<h1>${book.title}</h1>
			<a href="/books" class="btn btn-primary">Back to the Shelves</a>
		</div>
		<br> <br>
		<div>
			<c:choose>
				<c:when test="${book.owner.userName != user.userName}">
					<p>
						<span class="text-danger">${book.owner.userName}</span> read <span
							class="text-primary">${book.title}</span> by <span
							class="text-success">${book.author}</span>.
					</p>
					<div>
						<p>Here are ${book.owner.userName}'s thoughts:</p>
						<hr class="border border-danger border-2 opacity-25">
						<p>${book.thoughts }</p>
						<hr class="border border-danger border-2 opacity-25">
					</div>
				</c:when>
				<c:otherwise>
					<p>
						<span class="text-danger">You</span> read <span
							class="text-primary">${book.title}</span> by <span
							class="text-success">${book.author}</span>.

					</p>
					<div>
						<p>Here are your thoughts:</p>
						<hr class="border border-danger border-2 opacity-25">
						<p>${book.thoughts }</p>
						<hr class="border border-danger border-2 opacity-25">
					</div>
				</c:otherwise>
			</c:choose>
		</div>

		<!-- BUTTONS -->
		<div class="d-flex justify-content-end">
			<c:choose>
				<c:when test="${book.owner.userName == user.userName}">
					<div>
						<a href="/books/edit/${book.id }" class="btn btn-primary">Edit</a>
					</div>
					<form action="/books/delete/${book.id }" method="post">
						<input type="hidden" name="_method" value="delete" />
						<!-- Overriding the post method in the form to "put" -->
						<input class="btn btn-danger" type="submit" value="Delete" />
					</form>
				</c:when>
				<c:otherwise>

				</c:otherwise>
			</c:choose>

		</div>
	</div>

</body>
</html>