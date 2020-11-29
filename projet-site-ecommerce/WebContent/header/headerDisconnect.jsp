	<!-- Navigation -->
	<div class="container-fluid bg-dark text-white text-center">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<div class="container">
				<a class="navbar-brand" href="index.jsp">Orinoco</a>
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
