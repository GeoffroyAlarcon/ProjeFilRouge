<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset= UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form id="formUser" method="POST" action ="addUser">
		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label> <input
				type="email" class="form-control" name="email"
				aria-describedby="emailHelp" placeholder="Enter email"> <small
				id="emailHelp" class="form-text text-muted">We'll never
				share your email with anyone else.</small>
		</div>
		<div class="form-group">
			<label for="passe">Password</label> <input
				type="password" class="form-control" name="password"
				placeholder="Password">
		</div>
		<div class="form-group">
			<select name="type" id="type">
				<option value=""></option>
				<option value="purchasser">acheteur</option>
				<option value="seller">vendeur</option>
			</select>
		</div>
	</form>
	<script type="text/javascript">
		
	<%@ include file="../../js/form.js"%>
		
	</script>
</body>
</html>