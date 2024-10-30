<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Current Visit Count</title>
</head>
<body>
	<p>
		You have visited <a href="">http://localhost:8080/</a>
		<c:out value="${count}"> times.</c:out>
	</p>
	<p>
		You have visited <a href="">http://localhost:8080/other</a>
		<c:out value="${count2}"> times.</c:out>
	</p>
	<a href="/" style="text-decoration:none;">Test another visit?!     </a><button><a href="/reset"style="text-decoration:none;">reset</a></button><br>
	<a href="/other" style="text-decoration:none;">Test the other site another visit?!    </a><button><a href="/reset2"style="text-decoration:none;">reset</a></button>
</body>
</html>