<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	<!-- Navigation -->
	<div class="container-fluid bg-dark text-white text-center">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<div class="container">
				<a class="navbar-brand" href="index.html">Orinoco</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarResponsive" aria-controls="navbarResponsive"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarResponsive">
					<ul class="navbar-nav ml-auto">
						<li class="nav-item active"><a class="nav-link"
							<c:url var = "authSeller" value ="/authSeller"> </c:url>
							href="${authSeller }">Vendeur</a></li>
						<li class="nav-item"><a class="nav-link" href="cart.html">Panier</a>
						</li>
					</ul>
				</div>
			</div>
		</nav>

		<form action="authPurchasser" method="POST">
			<label for="email"> adresse mail : </label> <input name="email"
				type="email"> <label for="password"> Mot de passe :
			</label> <input name="password" type="password"> <input type="submit"
				value="envoyer">
		</form>
		<c:url var="addUser" value="/addUser">
		</c:url>
		<a href="${addUser }"> Nouvel utilisateur ? </a>
	</div>

	<!-- end Navigation-->
	<!-- banner-->
	<div class="container">
		<div id="banner" class="row">
			<div class="offset-lg-2 col-lg-8">

				<img src="images/15675819263013_image1.png" alt="Logo d'orinoco">
			</div>
			<!-- end banner-->
		</div>

		<div class="row">
			<div class="col">
				<h1 class="text-center my-4">Notre collection de peluches</h1>
			</div>
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