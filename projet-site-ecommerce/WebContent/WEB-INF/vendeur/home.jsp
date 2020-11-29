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
	<%@ include file="../../header/headerSeller.jsp"%>
	<div class=container>
		<div class="row">
			<div class="col">
				<h1 class="text-center my-4">Votre liste d'articles en vente</h1>
			</div>
		</div>

		<c:forEach items="${produitsVendeur}" var="produit" varStatus="status">
			<div class="row">
				<div class="col-md-3">
					<h4 class="text-primary">
						<c:out value="${ produit.designation}"></c:out>
					</h4>
				</div>

				<div class="col-md-3">
					<img alt="" src="${produit.imageURL}">
				</div>

				<div class="col-md-3">
					<p>
						prix :
						<c:out value="${produit.prixUnitaire }"></c:out>
						euros
					</p>
					<p>
						Quantité en stock :
						<c:out value="${produit.quantiteStock }"></c:out>
					</p>
				</div>
				<div class="col-md-3">
					<c:url var="updateProduct"
						value="/updateProduct?idObject=${produit.id}"></c:url>
					<a href="${updateProduct}"> Modifier </a>


					<c:url  var="deleteProduct" value="/deleteProduct?idObject=${produit.id}"></c:url>
					<a href="${deleteProduct}">
						<button class="btn btn-primary" type="button">Supprimez
							article</button>
					</a>
				</div>
			</div>
		</c:forEach>
		<div class="row">
			<div class="offset-md-4 col-md-3 text-center">
				<c:url var="ajoutProduit" value="/ajoutProduit">
				</c:url>
				<a href="${ajoutProduit }">
					<button type="button">ajouter un article</button>
				</a>
			</div>
		</div>
	</div>
	