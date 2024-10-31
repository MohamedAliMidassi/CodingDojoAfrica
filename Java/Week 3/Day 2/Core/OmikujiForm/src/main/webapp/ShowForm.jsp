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
		<h1>Heres Your Omikuji</h1>
		<div class="show">
			<p>
				In
				<c:out value="${number}" />
				years, you will live in
				<c:out value="${in1}" />
				with
				<c:out value="${in2}" />
				as your roommate,
				<c:out value="${in3}" />
				for a living. The next time you see a
				<c:out value="${in4}" />
				, you will have good luck! Also,<c:out value="${in5}"/>.
			</p>

		</div>
		<a href="/omikuji">Back</a>
	</div>
</body>
</html>