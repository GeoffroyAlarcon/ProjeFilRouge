<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

</head>
<body>
	<!-- Navigation -->
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
						href="product.html?id=5be9c8541c9d440000665243">Ourson</a></li>
					<li class="nav-item"><a class="nav-link" href="cart.html">Panier</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container-fluid bg-dark text-white text-center">
		<form action="auth" method="post">
			<label for="identifiant"> identifiant : </label> <input name="identifiant" type="text">
			<label for="mdp"> Mot de passe : </label> <input name="mdp"
				type="text"> <input type="submit" value="envoyer">
		</form>
		<c:url var = "newUser" value ="/newUser"> </c:url>
		<a href="${newUser }">   Nouvel utilisateur ? </a>
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