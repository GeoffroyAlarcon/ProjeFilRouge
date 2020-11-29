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
	<div class="container">
		<div class="row">
	<div class="col-md text-center"><h3> Modifiez Votre Produit  </h3></div>
			<form action="updateProduct" method="post">

				<label for="designation"> Nom de l'article : </label><input
					name="designation" type="text" value="${produit.designation }" />
				<label for="prixUnitaire"> prix de l'article : </label><input
					name="prixUnitaire" value="${produit.prixUnitaire }" type="text">
				<label for="quantiteStock"> Quantité de l'article :</label><input
					name="quantiteStock" value="${produit.quantiteStock}" type="number" />
				<label for="imageURL"></label> URL de l'image : <input
					name="imageURL" type="text" value="${produit.imageURL }" /> <label
					for="description"></label> description : <input name=description
					type="text" value="${produit.description }" />
					
				<button class="btn btn-primary">ajouter</button>
			</form>
		</div>
	</div>


</body>
</html>