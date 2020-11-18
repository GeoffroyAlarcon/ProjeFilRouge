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
					href="product.html?id=5be9c8541c9d440000665243">Votre Compte</a></li>
				<li class="nav-item"><a class="nav-link" href="cart.html">Gestion
						de vos produits</a>
				<li class="nav-item"><c:url var="deconnexion"
						value="/disconnect"></c:url> <a class="nav-link"
					href="${ deconnexion }">deconnection</a></li>
			</ul>
		</div>
	</div>
</nav>