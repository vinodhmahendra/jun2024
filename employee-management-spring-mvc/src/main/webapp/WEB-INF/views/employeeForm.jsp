<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${employee.id == null ? "Add Employee " : "Edit Employee"}</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
	<h1>${employee.id == null ? "Add Employee " : "Edit Employee"}</h1>

		
	<form:form method="post" modelAttribute="employee" action="${pageContext.request.contextPath}/employees/${employee.id ==null?'add':'edit'}" class="form">
		<form:hidden path="id"/>
		
		<div class="mb-3">
			<form:label path="id">ID  :</form:label>
			<form:input path="id" type="text" class="form-control" required="true" />
		</div>
		<div class="mb-3">
			<form:label path="name">Name  :</form:label>
			<form:input path="name" type="text" class="form-control" required="true" />
		</div>
		
		<div class="mb-3">
			<form:label path="department">Department  :</form:label>
			<form:input path="department" type="text" class="form-control" required="true" />
		</div>
		
		<button type="submit" class="btn btn-primary">${employee.id == null ? "Add" : "Update"} Employee</button>
		<a href="${pageContext.request.contextPath}/employees" class="btn btn-secondary">Cancel</a>
		
</form:form>
</div>

</body>
</html>