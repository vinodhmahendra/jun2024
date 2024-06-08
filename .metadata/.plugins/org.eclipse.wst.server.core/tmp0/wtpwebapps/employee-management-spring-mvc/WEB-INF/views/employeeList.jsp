<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>

<link href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container">

	<h1>Employees</h1>
	
	<a href="${pageContext.request.contextPath}/employees/add" class="btn btn-primary"> Add Employee</a>
	
	<table class="table table-striped">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Department</th>
				<th>Actions</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="employee" items="${employees}">
				<tr>
					<td>${employee.id }</td>
					<td>${employee.name }</td>
					<td>${employee.department }</td>
					
					<td>
						<a href="${pageContext.request.contextPath}/employees/edit/${employee.id}" class="btn btn-success">Edit</a>
						<a href="${pageContext.request.contextPath}/employees/delete/${employee.id}" class="btn btn-danger" onclick="return confirm('Are you sure?')">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>