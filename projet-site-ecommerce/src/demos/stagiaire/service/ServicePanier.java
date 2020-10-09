package demos.stagiaire.service;

import java.util.ArrayList;

import demos.stagiaire.model.LigneCommandePanierProduit;

import demos.stagiaire.model.Panier;
import demos.stagiaire.model.LigneCommandePanierProduit;

public class ServicePanier {
	ArrayList<LigneCommandePanierProduit> panierclient = new ArrayList();

	public ServicePanier(ArrayList<LigneCommandePanierProduit> panier) {
		super();
		this.panierclient = panier;
	}

	public ServicePanier() {
		super();

	}

	public ArrayList<LigneCommandePanierProduit> getPanier() {
		return panierclient;
	}

	public void setPanier(ArrayList<LigneCommandePanierProduit> panier) {
		this.panierclient = panier;
	}

	public void addInCart(LigneCommandePanierProduit panier) {
		panierclient.add(panier);
	}

	public void removeInCart(LigneCommandePanierProduit panier) {
		panierclient.remove(panier);
	}

	public LigneCommandePanierProduit findById(int id) {
		for (int i = 0; i < panierclient.size(); i++) {
			LigneCommandePanierProduit findlignedeCommandePanierProduit = panierclient.get(i);
			if (id == findlignedeCommandePanierProduit.getId()) {
				return panierclient.get(i);
			}

		}
		return null;
	}

	public void updateOne(int id, LigneCommandePanierProduit ligneCommandePanierProduit) {
		for (int i = 0; i < panierclient.size(); i++) {
			LigneCommandePanierProduit findCommandePanierProduit = panierclient.get(i);
			if (id == findCommandePanierProduit.getId()) {
				panierclient.remove(findCommandePanierProduit);
				panierclient.add(ligneCommandePanierProduit);
			}
		}
	}

	public LigneCommandePanierProduit findAll() {
		for (int i = 0; i < panierclient.size(); i++) {
			return panierclient.get(i);
		}
		return null;
	}
}
