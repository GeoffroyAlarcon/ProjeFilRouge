package demos.stagiaire.service;

import java.util.ArrayList;

import demos.stagiaire.model.Produit;
import demos.stagiaire.model.Seller;

public class ServiceProduit {
	private ArrayList<Produit> tableauDeProduit = new ArrayList<Produit>();

	public ServiceProduit() {
		tableauDeProduit.add(new Produit(1, "Garfunkel", 25, 10, new Seller(),
				"https://lagranderecre-lagranderecre-fr-storage.omn.proximis.com/Imagestorage/imagesSynchro/0/0/c6037e6e50767e22233191637bafe63a103b4da9_IMG-PRODUCT-847442-1.jpeg",
				"lorem ipsum", new String[] { "bleu", "beige" }));
		tableauDeProduit.add(new Produit(2, "Eliot", 25, 10, new Seller(),
				"https://lagranderecre-lagranderecre-fr-storage.omn.proximis.com/Imagestorage/imagesSynchro/0/0/c6037e6e50767e22233191637bafe63a103b4da9_IMG-PRODUCT-847442-1.jpeg",
				"lorem ipsum", new String[] { "bleu", "beige" }));
		tableauDeProduit.add(new Produit(3, "Lenny", 25, 10, new Seller(),
				"https://lagranderecre-lagranderecre-fr-storage.omn.proximis.com/Imagestorage/imagesSynchro/0/0/c6037e6e50767e22233191637bafe63a103b4da9_IMG-PRODUCT-847442-1.jpeg",
				"lorem ipsum", new String[] { "bleu", "beige" }));
		tableauDeProduit.add(new Produit(4, "Karl", 25, 10, new Seller(),
				"https://lagranderecre-lagranderecre-fr-storage.omn.proximis.com/Imagestorage/imagesSynchro/0/0/c6037e6e50767e22233191637bafe63a103b4da9_IMG-PRODUCT-847442-1.jpeg",
				"lorem ipsum", new String[] { "bleu", "beige" }));
	}

	public ArrayList<Produit> getTableauDeProduit() {
		return tableauDeProduit;
	}

	public void setTableauDeProduit() {
	}

	public void addProcduct(Produit produit) {
		tableauDeProduit.add(produit);

	}

	public void remove(Produit produit) {
		tableauDeProduit.remove(produit);
	}

	public Produit findById(int id) {
		for (int i = 0; i < tableauDeProduit.size(); i++) {
			Produit findProduitById = tableauDeProduit.get(i);
			if (id == findProduitById.getId()) {
				return tableauDeProduit.get(i);
			}

		}
		return null;

	}

	public void updateOne(int id, Produit produit) {
		for (int i = 0; i < tableauDeProduit.size(); i++) {
			Produit findProduitById = tableauDeProduit.get(i);
			if (id == findProduitById.getId()) {
				tableauDeProduit.remove(findProduitById);
				tableauDeProduit.add(produit);
			}

		}

	}

	public ArrayList<Produit> findAll() {
		return tableauDeProduit;
	}

	public ArrayList<Produit> findAllDisponible() {
		for (int i = 0; i < tableauDeProduit.size(); i++) {
			Produit verifystock = tableauDeProduit.get(i);
			if (verifystock.getQuantiteStock() >= 1) {
				return tableauDeProduit;
			}
		}
		return null;

	}

	public ArrayList<Produit> findProductBySeller(Seller seller) {
		ArrayList<Produit> productSeller = new ArrayList<Produit>();
		for (Produit produit : tableauDeProduit) {

			if (produit.getVendeur().equals(seller)) {
				productSeller.add(produit);
			}

		}

		return productSeller;

	}

	@Override
	public String toString() {
		return "TableauDeProduit [tableauDeProduit=" + tableauDeProduit + "]";
	}

}
