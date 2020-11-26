let selectUser = document.getElementById("type");
let option = document.getElementsByTagName("option")
let formUser = document.getElementById("formUser")

selectUser.addEventListener('input', function() {

	if (selectUser.value === "purchasser") {
		// Paramétrage des balises pour les acheteurs

		let divCb = document.createElement("div");
		divCb.classlist = "form-group";
		let labelCb = document.createElement("label");
		let inputCb = document.createElement("input");
		inputCb.name = "cb";
		let divTel = document.createElement("div");
		divTel.classList = "form-group";
		let labelTel = document.createElement("label");
		let inputTel = document.createElement("input");
		inputTel.name = "tel"
		let divIdentite = document.createElement("div");
		divIdentite.className = "form-group";
		let labelIdentite = document.createElement("label");
		let inputIdentite = document.createElement("input");
		inputIdentite.name = "identite";
		let divRue = document.createElement("div");
		divRue.className = "form-group";
		let labelRue = document.createElement("label");
		let inputRue = document.createElement("input");
		inputRue.name = "rue";
		let divCodePostal = document.createElement("div");
		divCodePostal.className = "form-group";
		let labelCodePostal = document.createElement("label");
		let inputCodePostal = document.createElement("input");
		inputCodePostal.name = "codePostal";
		let divVille = document.createElement("div");
		divVille.className = "form-group";
		let labelVille = document.createElement("label");
		let inputVille = document.createElement("input");
		inputVille.name = "ville";
		let divSubmit = document.createElement("div");
		divSubmit.className = "form-group";
		let inputSubmit = document.createElement("input");
		inputSubmit.type = "submit";

		// affichage du formulaire d'inscription pour les acheteurs
		formUser.innerHTML = "";
		formUser.appendChild(divCb).appendChild(labelCb).innerHTML = " Rentrez votre numéro de carte de  carte bancaire";
		formUser.appendChild(divCb).appendChild(inputCb);
		formUser.appendChild(divTel).appendChild(labelTel).innerHTML = " Rentrez votre numéro de carte de téléphone";
		formUser.appendChild(divTel).appendChild(inputTel);
		formUser.appendChild(divIdentite).appendChild(labelIdentite).innerHTML = " Rentrez votre identifiant";
		formUser.appendChild(divIdentite).appendChild(inputIdentite);
		formUser.appendChild(divRue).appendChild(labelRue).innerHTML = " Rentrez le Nom de Votre rue";
		formUser.appendChild(divRue).appendChild(inputRue);
		formUser.appendChild(divCodePostal).appendChild(labelCodePostal).innerHTML = " Rentrez votre code Postal";
		formUser.appendChild(divCodePostal).appendChild(inputCodePostal);
		formUser.appendChild(divVille).appendChild(labelVille).innerHTML = " Rentrez votre Ville";
		formUser.appendChild(divVille).appendChild(inputVille);
		formUser.appendChild(divSubmit).appendChild(inputSubmit);
	}
	if (selectUser.value === "seller") {
		// Paramétrage des balises pour les Vendeurs
		formUser.innerHTML = "";
		let divCompagnie = document.createElement("div");
		let labelCompagnie = document.createElement("label");
		let inputCompagnie = document.createElement("input");
		inputCompagnie.name = "compagnie";
		divCompagnie.className = "form-group";
		let divSiret = document.createElement("div");
		let labelSiret = document.createElement("label");
		let inputSiret = document.createElement("input");
		inputSiret.name = "siret";
		divSiret.className = "form-group";
		let divDescription = document.createElement("div");
		let labelDescription = document.createElement("label");
		let inputDescription = document.createElement("input");
		inputDescription.name = "description";
		divDescription.className = "form-group";
		let divSubmit = document.createElement("div");
		divSubmit.className = "form-group";
		let inputSubmit = document.createElement("input");
		inputSubmit.type = "submit";
		// affichage du formulaire d'inscription pour les vendeurs
		formUser.innerhtml = "";
		formUser.appendChild(divCompagnie).appendChild(labelCompagnie).innerHTML = " Rentrez le nom de votre Compagnie";
		formUser.appendChild(divCompagnie).appendChild(inputCompagnie);
		formUser.appendChild(divSiret).appendChild(labelSiret).innerHTML = " Rentrez Votre numéro de Siret";
		formUser.appendChild(divSiret).appendChild(inputSiret);
		formUser.appendChild(divDescription).appendChild(labelDescription).innerHTML = " Rentrez la description  de votre Compagnie";
		formUser.appendChild(divDescription).appendChild(inputDescription);
		formUser.appendChild(divSubmit).appendChild(inputSubmit);
	}

});