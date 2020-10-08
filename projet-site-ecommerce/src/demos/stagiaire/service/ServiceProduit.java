package demos.stagiaire.service;

import java.util.ArrayList;
import java.util.Arrays;

import demos.stagiaire.model.Produit;

public class ServiceProduit {
	private ArrayList<Produit> tableauDeProduit = new ArrayList();

	public ServiceProduit(ArrayList tableauDeProduit) {
		super();
		this.tableauDeProduit = tableauDeProduit;
	}

	public ServiceProduit() {
		super();
	}

	public ArrayList getTableauDeProduit() {
		return tableauDeProduit;
	}

	public void setTableauDeProduit(ArrayList tableauDeProduit) {
		tableauDeProduit = tableauDeProduit;
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

	@Override
	public String toString() {
		return "TableauDeProduit [tableauDeProduit=" + tableauDeProduit + "]";
	}

}
