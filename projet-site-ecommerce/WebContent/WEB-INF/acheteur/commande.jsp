<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta charset="UTF-8">
<title>Commande</title>
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
			<c:forEach items="${allCommande}" var="commande" varStatus="status">

				<div class="col-md-3 text-center">
					<p>
						Num�ro de la commande :
						<c:out value="${commande.commande.id}"></c:out>
					</p>
				</div>

				<div class="col-md-3 text-center">
					<p>
						Date de la commande :
						<c:out value="${commande.commande.datescommande}"></c:out>
					</p>
				</div>
				<div class="col-md-3 text-center">
					<p>
						Nom de l'article Commande :
						<c:out value="${commande.produit.designation}"></c:out>
					</p>
				</div>

				<div class="col-md-3 text-center">
					<p>
						Prix total de article :
						<c:out
							value="${commande.produit.prixUnitaire * commande.quantiteCommandee}"></c:out>
						euros
					</p>
				</div>
			</c:forEach>

			<!-- end of panier-->
			<!-- form-->
			<div class="container">
				<div class="row bg-primary my-5">
					<div class="col text-center text-white">
						<h2>Passez votre commmande</h2>
					</div>
				</div>
				<form id="form"></form>
			</div>
		</div>
		<!-- end form-->
	</div>
	<!-- Footer -->
	<div class="container-fluid">
		<footer class="py-4 my-5 bg-dark">

			<div class="row">
				<p class="col-6 text-center text-white">Copyright &copy;
					Orinocco 2020</p>
				<p class="col-6 text-center text-white">Mentions l�gales</p>
			</div>
		</footer>
	</div>

</body>
</html>