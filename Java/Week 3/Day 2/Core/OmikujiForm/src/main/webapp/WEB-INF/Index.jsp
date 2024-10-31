<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/styles.css">
<title>Omikuji</title>
</head>
<body>
	<div class="pg">
		<h1>Send an Omikuji</h1>
		<form action="/omiroute" method="post" class="fm">
			<div class="mb-3">
				<label class="form-label">Pick a number from 5 to 25</label> <input
					type="number" name="number" class="form-control">
					
			</div>
			<div>
				<label class="form-label">Enter the name of any city: </label> <input
					type="text" name="in1" class="form-control">
			</div>
			<div>
				<label class="form-label">Enter the name of any real person:
				</label> <input type="text" name="in2" class="form-control">
			</div>
			<div>
				<label class="form-label">Enter professional endeavor or
					hobby: </label> <input type="text" name="in3" class="form-control">
			</div>
			<div>
				<label class="form-label">Enter any type of living thing: </label> <input
					type="text" name="in4" class="form-control">
			</div>
			<div>
				<label class="form-label">Say something nice to someone: </label>
				<textarea name="in5" class="form-control"></textarea>
			</div>
			<div>
				<br>
				<p>Send and Show a Friend</p>
			</div>
			<button class="btn btn-primary">Send</button>
		</form>

	</div>
</body>
</html>