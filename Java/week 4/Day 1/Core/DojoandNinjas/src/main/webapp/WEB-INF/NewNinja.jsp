<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<h1 class="h1">New Ninja</h1>
<form:form action="/ninjas" method="post" modelAttribute="ninja">

    <p>
        <form:label class="form-label" path="firstName">First Name:</form:label>
        <form:input class="input-group" path="firstName"/>
    </p>
    
    <p>
        <form:label class="form-label" path="lastName">Last Name:</form:label>
        <form:input class="input-group" path="lastName"/>
    </p>
    <p>
        <form:label class="form-label" path="age">Age:</form:label>
        <form:input class="input-group" path="age"/>
    </p>
    
    <p>
        <form:label path="dojo">Dojo:</form:label>
        
        <form:select class="form-select" path="dojo">
        
        	<c:forEach var="eachDojo" items="${dojos}">
	        
	        	<option value="${eachDojo.id}"><c:out value="${eachDojo.name}"/></option>
	        
        	</c:forEach>
        	
        </form:select>
    </p>
    
    
    <input type="submit"class="btn btn-primary"  value="Submit"/>
    
</form:form>  
	
</body>
</html>