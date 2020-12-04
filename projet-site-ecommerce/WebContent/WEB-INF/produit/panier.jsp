<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

	<div class="container-fluid">

		<div class="row">
			<c:forEach items="${cart}" var="produit" varStatus="status">
				<div class="col-md-3 text-center">
					<p>
						Nom de l'article :
						<c:out value="${produit.produit.designation}"></c:out>
					</p>
				</div>
				<div class="col-md-2 text-center">
					<p>
						prix de l'article :
						<c:out value="${produit.produit.prixUnitaire}"></c:out>
					</p>
				</div>

				<div class="col-md-2 text-center">
					<p>
						Quantité commandée :
						<c:out value="${produit.quantiteCommandee}"></c:out>
					</p>
				</div>
				<div class="col-md-3 text-center">
					<p>
						Prix total :
						<c:out
							value="${produit.produit.prixUnitaire * produit.quantiteCommandee}"></c:out>
					</p>
				</div>
				<div class="col-md-2 text-center">
					<c:url var="deleteProduct"
						value="/deleteCart?idObject=${produit.produit.id}"></c:url>
					<a href="${deleteProduct}">
						<button class="btn btn-primary" type="button">Supprimez
							article</button>
					</a>

					<c:url var="pageProduit"
						value="/pageProduit?idObject=${produit.produit.id}"></c:url>
					<a href="${pageProduit }">
						<button class="btn btn-primary" type="button">modifier
							quantité</button>
					</a>

				</div>

			</c:forEach>
			<div class="col-12 text-center">
				<h4>
					total du panier :
					<c:out value="${prixTotalPanier}"></c:out>
					euros
				</h4>
			</div>
		</div>
		<!-- end of panier-->
		<!-- form-->
		<div class="container">
			<form action="panier" method="post">
				<input class="btn btn-primary" type="submit"
					value="Passez une Commande " />
			</form>
		</div>
	</div>
	<!-- end form-->

	<!-- Footer -->
	<div class="container-fluid">
		<footer class="py-4 my-5 bg-dark">

			<div class="row">
				<p class="col-6 text-center text-white">Copyright &copy;
					Orinocco 2020</p>
				<p class="col-6 text-center text-white">Mentions légales</p>
			</div>
		</footer>
	</div>

</body>
</html>