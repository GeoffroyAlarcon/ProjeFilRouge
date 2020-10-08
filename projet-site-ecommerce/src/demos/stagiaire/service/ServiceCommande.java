package demos.stagiaire.service;

import java.util.ArrayList;

import demos.stagiaire.model.Produit;
import demos.stagiaire.model.LigneCommande;

public class ServiceCommande {
	ArrayList<LigneCommande> tableauDeCommande;

	public ServiceCommande(ArrayList<LigneCommande> tableauDeCommande) {
		super();
		this.tableauDeCommande = tableauDeCommande;
	}

	public ServiceCommande() {
		super();

	}

	public ArrayList<LigneCommande> getTableauDeCommande() {
		return tableauDeCommande;
	}

	public void setTableauDeCommande(ArrayList<LigneCommande> tableauDeCommande) {
		tableauDeCommande = tableauDeCommande;
	}

	public void addProcduct(LigneCommande ligneCommande) {
		tableauDeCommande.add(ligneCommande);

	}

	public void remove(LigneCommande ligneCommande) {
		tableauDeCommande.remove(ligneCommande);
	}

	public LigneCommande findById(int id) {
		for (int i = 0; i < tableauDeCommande.size(); i++) {
			LigneCommande findProduitById = tableauDeCommande.get(i);
			if (id == findProduitById.getId()) {
				return tableauDeCommande.get(i);
			}

		}
		return null;

	}

	public void updateOne(int id, LigneCommande ligneCommande) {
		for (int i = 0; i < tableauDeCommande.size(); i++) {
			LigneCommande findProduitById = tableauDeCommande.get(i);
			if (id == findProduitById.getId()) {
				tableauDeCommande.remove(findProduitById);
				tableauDeCommande.add(ligneCommande);
			}

		}

	}

	public void findAll() {
		for (int i = 0; i < tableauDeCommande.size(); i++) {
			System.out.println(tableauDeCommande.get(i));
		}
	}

	@Override
	public String toString() {
		return "ServiceCommande [tableauDeCommande=" + tableauDeCommande + "]";
	}

}
