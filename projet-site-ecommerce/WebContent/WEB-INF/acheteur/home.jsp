<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
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
	<%@ include file="../../header/header.jsp"%>
	<div class=container>
		<div class="row">
			<div class="col">
				<h1 class="text-center my-4">Notre collection de peluches</h1>
			</div>
		</div>
		<div class="row">
			<c:forEach items="${produits}" var="produit" varStatus="status">
				<div class="col-md-3 text-center">

					<h4 class="text-primary">
						<c:out value="${ produit.designation}"></c:out>
					</h4>
					<img alt="" src="${produit.imageURL }">
					<p>
						prix :
						<c:out value="${produit.prixUnitaire } euros"></c:out>
					</p>
					<c:url var="pageProduit"
						value="/pageProduit?idObject=${produit.id}"></c:url>
					<a href="${pageProduit }"> test </a>
				</div>
			</c:forEach>
		</div>

	</div>

	<!-- Footer -->
	<footer class="py-4 bg-dark">
		<div class="container">
			<div class="row">
				<p class="col-6 text-center text-white">Copyright Orinocco 2020</p>
				<p class="col-6 text-center text-white">Mentions légales</p>
			</div>
		</div>
	</footer>

</body>
</html>
</body>
</html>