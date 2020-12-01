package demos.stagiaire.model;

import java.util.ArrayList;

import demos.stagiaire.dao.PanierDao;

public class Panier {
	PanierDao  panierDao =  new PanierDao();


	public LigneCommandePanierProduit findById(int id) {
		for (int i = 0; i < panierProduits.size(); i++) {
			LigneCommandePanierProduit findlignedeCommandePanierProduit = panierProduits.get(i);
			if (id == findlignedeCommandePanierProduit.getId()) {
				return panierProduits.get(i);
			}

		}
		return null;
	}


	public float prixTotalPanier() {
		float prixTotal = 0;
		for (LigneCommandePanierProduit produit : panierProduits) {
			prixTotal = prixTotal + produit.montant();

		}
		return prixTotal;
	}

	public ArrayList<LigneCommandePanierProduit> findAll() {
		return panierDao.findAll();

	}
}