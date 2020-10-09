package demos.stagiaire.main;

import java.util.ArrayList;
import java.util.Scanner;

import demos.stagiaire.model.Adresse;
import demos.stagiaire.model.Produit;
import demos.stagiaire.model.Purchasser;
import demos.stagiaire.model.User;
import demos.stagiaire.model.Seller;
import demos.stagiaire.service.ServiceProduit;
import demos.stagiaire.service.ServiceUtilisateur;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seller vendeur1 = new Seller(0, "geoffroy.alarcon@gmail.com", "test", "lorem", "122", "testsqdsd");
		ServiceUtilisateur tableauUser = new ServiceUtilisateur();
		System.out.println("tapez 1 si vous êtes client, tapez 2 si vous êtes vendeur ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		

		if (i == 1) {
			Adresse adresse1 = new Adresse(1, "12 rue de la maison", "72000", "Le Mans");
			Purchasser acheteur1 = new Purchasser(2, "geoffroy@gmail.com", "azerty", "0222222", "189", "Thierry Dupont",
					adresse1);
			tableauUser.addPurchaser(acheteur1);
		}
		if (i == 2) {
		
		
			tableauUser.addSeller(vendeur1);
		}
		System.out.println("voici notre liste  de produit");
		Produit produit1 = new Produit(0, "Teddy1", 2.3f, 5, vendeur1,
				"https://ressources.mynoors.com/files/pages/original/2018/11/08/nounours-beige-23-cm-nicotoy-6497.jpg",
				"lorem  ", "couleur:  bleu");
		Produit produit2= new Produit(1, "Garfild", 2.3f, 5, vendeur1,
				"https://ressources.mynoors.com/files/pages/original/2018/11/08/nounours-beige-23-cm-nicotoy-6497.jpg",
				"lorem  ", "couleur:  bleu");
		Produit produit3= new Produit(3, "Hanfunker", 2.3f, 5, vendeur1,
				"https://ressources.mynoors.com/files/pages/original/2018/11/08/nounours-beige-23-cm-nicotoy-6497.jpg",
				"lorem  ", "couleur:  bleu");

	}
} // fin de la classe
