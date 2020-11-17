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
			<div class="col-lg-9 text-center">
				<p>
					Nom du Produit
					<c:out value="${produit.designation }" />
				</p>
				<img src=" ${produit.imageURL }" alt="" />
				<p>
					prix :
					<c:out value="${produit.prixUnitaire } euros "></c:out>
				</p>
				<p>
					couleur :
					<c:out value="${produit.couleur }"></c:out>
				</p>
				<p>
					Description :
					<c:out value="${produit.description }"></c:out>
				</p>
			</div>
			<form action="pageProduit" method="post">
				<div class="form-group">
					<label for="quantite"> quantité choisie :</label> <select
						name="quantite" id="quantite">
						<c:forEach begin="0" end="5" step="1" var="x">
							<option value=" ${x}">${x}</option>
						</c:forEach>
					</select>
				</div>
				<div class="form-group">
					<input type="submit" value="Ajouter au panier" />
				</div>
			</form>
		</div>

	</div>

</body>
</html>