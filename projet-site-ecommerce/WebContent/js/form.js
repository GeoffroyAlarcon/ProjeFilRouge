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
		let divNom = document.createElement("div");
		divNom.className = "form-group";
		let labelNom = document.createElement("label");
		let inputNom = document.createElement("input");
		inputNom.name = "nom";
		let divPrenom = document.createElement("div");
		divPrenom.className = "form-group";
		let labelPrenom = document.createElement("label");
		let inputPrenom = document.createElement("input");
		inputPrenom.name = "prenom";
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
		formUser.appendChild(divNom).appendChild(labelNom).innerHTML = " Rentrez votre nom de Famille";
		formUser.appendChild(divNom).appendChild(inputNom);
		formUser.appendChild(divPrenom).appendChild(labelPrenom).innerHTML = " Rentrez votre prénom";
		formUser.appendChild(divPrenom).appendChild(inputPrenom);
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
		formUser.appendChild(divSubmit).appendChild(inputSubmit);
	}

});