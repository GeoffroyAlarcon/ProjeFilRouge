package demos.stagiaire.main;

import java.util.ArrayList;
import java.util.Scanner;

import demos.stagiaire.model.Produit;
import demos.stagiaire.model.User;
import demos.stagiaire.model.Vendeur;
import demos.stagiaire.service.ServiceProduit;
import demos.stagiaire.service.ServiceUtilisateur;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceUtilisateur tableau = new ServiceUtilisateur();
		User user1 = new User(0, "geoffroy.alarcon@gmail.com", "test");
		User user2 = new User(1, "zinedine.zidane@gmail.com", "azerty");
		User user3 = new User(2, "eric.Cantona@gmail.com", "doc");
		tableau.addUser(user1);
		tableau.addUser(user2);
		tableau.addUser(user3);
		tableau.findAll();

	}
} // fin de la classe
