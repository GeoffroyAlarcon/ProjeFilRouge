package demos.stagiaire.test;

import demos.stagiaire.model.Commande;
import demos.stagiaire.model.LigneCommande;
import demos.stagiaire.model.Produit;
import demos.stagiaire.model.Vendeur;
import demos.stagiaire.service.ServiceCommande;

public class TestServiceCommande {

	public static void main(String[] args) {
		Vendeur vendeur = new Vendeur();
		Commande commande = new Commande();
		Produit produit1 = new Produit(0, "Teddy1", 2.3f, 5, vendeur,
				"https://ressources.mynoors.com/files/pages/original/2018/11/08/nounours-beige-23-cm-nicotoy-6497.jpg",
				"lorem  ", "couleur:  bleu");
		LigneCommande test = new LigneCommande(1, 2, commande, produit1);
		ServiceCommande tableau = new ServiceCommande();
		tableau.addProcduct(test);

	}
}// fin de classe
