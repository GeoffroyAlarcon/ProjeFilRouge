package demos.stagiaire.model;

import java.util.ArrayList;

public class Panier {
	ArrayList<LigneCommandePanierProduit> panierProduits = new ArrayList<LigneCommandePanierProduit>();
	Purchasser acheteur = new Purchasser();

	public Panier(ArrayList<LigneCommandePanierProduit> panierProduits, Purchasser acheteur) {
		super();
		this.panierProduits = panierProduits;
		this.acheteur = acheteur;
	}

	public Panier(Purchasser acheteur) {
		super();
		this.acheteur = acheteur;
	}

	public Panier() {
		super();

	}

	public ArrayList<LigneCommandePanierProduit> getPanier() {
		return panierProduits;
	}

	public void setPanier(ArrayList<LigneCommandePanierProduit> panier) {
		this.panierProduits = panier;
	}

	public Purchasser getAcheteur() {
		return acheteur;
	}

	public void setAcheteur(Purchasser acheteur) {
		this.acheteur = acheteur;
	}

	public void addInCart(LigneCommandePanierProduit panier) {
		panierProduits.add(panier);
	}

	public void removeInCart(LigneCommandePanierProduit panier) {
		panierProduits.remove(panier);
	}

	public LigneCommandePanierProduit findById(int id) {
		for (int i = 0; i < panierProduits.size(); i++) {
			LigneCommandePanierProduit findlignedeCommandePanierProduit = panierProduits.get(i);
			if (id == findlignedeCommandePanierProduit.getId()) {
				return panierProduits.get(i);
			}

		}
		return null;
	}

	public void updateOne(int id, LigneCommandePanierProduit ligneCommandePanierProduit) {
		for (int i = 0; i < panierProduits.size(); i++) {
			LigneCommandePanierProduit findCommandePanierProduit = panierProduits.get(i);
			if (id == findCommandePanierProduit.getId()) {
				panierProduits.remove(findCommandePanierProduit);
				panierProduits.add(ligneCommandePanierProduit);
			}
		}
	}

	public float prixTotalPanier() {
		float prixTotal = 0;
		for (LigneCommandePanierProduit produit : panierProduits) {
			prixTotal = prixTotal + produit.montant();

		}
		return prixTotal;
	}

	public ArrayList<LigneCommandePanierProduit> findAll() {
		return panierProduits;

	}
}