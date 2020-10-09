package demos.stagiaire.test;

import java.util.ArrayList;

import demos.stagiaire.model.Purchasser;
import demos.stagiaire.model.Adresse;
import demos.stagiaire.model.User;
import demos.stagiaire.model.Seller;
import demos.stagiaire.service.ServiceUtilisateur;

public class TestUtilisateur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adresse adresse1 = new Adresse(1, "12 rue de la maison", "72000", "Le Mans");
		ServiceUtilisateur tableau = new ServiceUtilisateur();
		User user1 = new User(0, "geoffroy.alarcon@gmail.com", "test");
		User user2 = new User(1, "Thierry.dupont@gmail.com", "azerty");
		Purchasser acheteur = new Purchasser(0, "Thierry.dupont@gmail.com", "azerty", "0222222", "189",
				"Thierry Dupont", adresse1);
		Purchasser acheteur2 = new Purchasser(2, "geoffroy@gmail.com", "azerty", "0222222", "189", "Thierry Dupont",
				adresse1);

		
		tableau.addPurchaser(acheteur);
		tableau.addPurchaser(acheteur2);
		tableau.updateOnePurchasser(0, acheteur2);
		for(Purchasser purchasser: tableau.findAllPurchasser())
			System.out.println(purchasser);
	}
} // fin de la classe
