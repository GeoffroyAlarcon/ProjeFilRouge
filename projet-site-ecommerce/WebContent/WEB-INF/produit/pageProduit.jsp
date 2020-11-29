<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ourson Peluche</title>
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

	<!-- Page Content -->
	<div class="container">
		<div class="row">
			<div class="col-lg-3 text-center">
				<h3>Peluche :</h3>
				<p>
					<c:out value="${produit.designation }" />
				</p>
			</div>
			<div class="col-lg-4">
				<img src=" ${produit.imageURL }" alt="" />

			</div>
			<div class="col-lg-2">
				<h3>Prix :</h3>
				<p>
					<c:out value="${produit.prixUnitaire } euros "></c:out>
				</p>
			</div>

			<div class="col-lg-3">
				<h3>Description :</h3>
				<p>

					<c:out value="${produit.description }"></c:out>
				</p>
			</div>
		</div>


		<div class="row bg-dark text-white text-center">

			<div class="col-lg-12">Passez commande</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<form action="pageProduit" method="post">
					<div class="form-group">
						<label for="quantite"> quantité choisie :</label> <select
							name="quantite" id="quantite">
							<c:forEach begin="0" end="5" step="1" var="x">
								<option value="${x}">${x}</option>
							</c:forEach>
						</select>
					</div>
					<div class="form-group">
						<input class="btn btn-primary" type="submit"
							value="Ajouter au panier" />
					</div>
					<c:set var="test" value="${id}" scope="request" />
				</form>
			</div>
		</div>
	</div>


</body>
</html>