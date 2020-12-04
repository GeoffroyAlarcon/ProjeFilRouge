<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html charset= UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://kit.fontawesome.com/a6c393237d.js"></script>

</head>
<body>
	<%@ include file="../../header/headeraddUser.jsp"%>

	<div class="container">
		<div class="row">
			<div class="col-12">
				<form method="POST" action="addUser">
					<div class="form-group">
						<label for="exampleInputEmail1">Email address</label> <input
							type="email" class="form-control" name="email"
							aria-describedby="emailHelp" placeholder="Enter email"> <small
							id="emailHelp" class="form-text text-muted">We'll never
							share your email with anyone else.</small>
					</div>
					<div class="form-group">
						<label for="passe">Password</label> <input type="password"
							class="form-control" name="password" placeholder="Password">
					</div>
					<div class="form-group">
						<select name="type" id="type">
							<option value=""></option>
							<option value="purchasser">acheteur</option>
							<option value="seller">vendeur</option>
						</select>
					</div>
					<div id="formUser"></div>
				</form>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		
	<%@ include file="../../js/form.js"%>
		
	</script>
</body>
</html>