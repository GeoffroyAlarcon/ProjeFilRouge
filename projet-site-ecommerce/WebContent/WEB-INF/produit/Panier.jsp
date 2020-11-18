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
  <div class="container">
        <div id="banner" class="row">
            <div class="offset-lg-2 col-lg-8">
                <div class="text-center">
                    <img src="images/15675819263013_image1.png" alt="">
                </div>
            </div>
        </div>

    </div>
    <div class="container-fluid">
        <!-- panier -->
  <c:forEach items="${cart}" var="produit"
					varStatus="status">
					<div class="col-md-3 text-center">

						<h4 class="text-primary">
							<c:out value="${ cart.montant}"></c:out>
						</h4>
						<img alt="" src="${produit.imageURL}">
						<p>
							prix :
							<c:out value="${produit.prixUnitaire} euros"></c:out>
						</p>
						<c:url var="pageProduit"
							value="/pageProduit?idObject=${produit.id}"></c:url>
						<a href="${pageProduit}"> test </a>
					</div>
					<c:url  value="/supprimeProduitidObject=${produit.id}" var ="suprime"></c:url>
					<a href="">
						<button class="btn btn-primary" type="button"> Supprimez article </button>
					</a>
				</c:forEach>

        <!-- end of panier-->
        <!-- form-->
        <div class="container">
            <div class="row bg-primary my-5">
                <div class="col text-center text-white">
                    <h2> Passez votre commmande</h2>
                </div>
            </div>
            <form id="form">
            </form>
        </div>
    </div>
    <!-- end form-->

    <!-- Footer -->
    <div class="container-fluid">
        <footer class="py-4 my-5 bg-dark">

            <div class="row">
                <p class="col-6 text-center text-white">Copyright &copy; Orinocco 2020</p>
                <p class="col-6 text-center text-white"> Mentions légales</p>
            </div>
        </footer>
    </div>

</body>
</html>