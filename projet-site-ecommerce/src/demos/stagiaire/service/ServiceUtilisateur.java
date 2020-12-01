package demos.stagiaire.service;

import java.util.ArrayList;

import demos.stagiaire.dao.PurchasserDao;
import demos.stagiaire.dao.SellerDao;
import demos.stagiaire.model.Adresse;
import demos.stagiaire.model.Purchasser;

import demos.stagiaire.model.Seller;

public class ServiceUtilisateur {

	private PurchasserDao tableauDAcheteur = new PurchasserDao();
	private SellerDao tableauDeVendeur = new SellerDao();

	public ServiceUtilisateur() {
	}

	public PurchasserDao getTableauDAcheteur() {
		return tableauDAcheteur;
	}

	public SellerDao getTableauDeVendeur() {
		return tableauDeVendeur;
	}

	public void setTableauDeVendeur(SellerDao tableauDeVendeur) {
		this.tableauDeVendeur = tableauDeVendeur;
	}

	public void setTableauDAcheteur(PurchasserDao tableauDAcheteur) {
		this.tableauDAcheteur = tableauDAcheteur;
	}

	public Purchasser addPurchaser(Purchasser acheteur) {
		return tableauDAcheteur.save(acheteur);
	}

	public void addSeller(Seller vendeur) {
		tableauDeVendeur.save(vendeur);
	}

	public void removePurchaser(Purchasser acheteur) {
		tableauDAcheteur.remove(acheteur);
	}

	public void removeSeller(Seller vendeur) {
		tableauDeVendeur.remove(vendeur);
	}

	public Purchasser findByIdPourchasser(int id) {
		return tableauDAcheteur.findById(id);
	}

	public Purchasser findByLoginPurchasser(String email, String password) {
		return tableauDAcheteur.findByloginAndPasseword(email, password);

	}

	public Seller findByLoginSeller(String email, String password) {
		return tableauDeVendeur.findByloginAndPasseword(email, password);
	}

	public Seller findByIdSeller(int id) {
		return tableauDeVendeur.findById(id);
	}

	public Purchasser update(Purchasser purchasser) {
		return tableauDAcheteur.update(purchasser);
	}

	public Seller updateOne(int id, Seller seller) {
	return tableauDeVendeur.update(seller);

	}

	public ArrayList<Purchasser> findAllPurchasser() {
		return tableauDAcheteur.findAll();

	}

	public ArrayList<Seller> findallSeller() {
		return tableauDeVendeur.findAll();
	}

	@Override
	public String toString() {
		return "ServiceUtilisateur [tableauDAcheteur=" + tableauDAcheteur + ", tableauDeVendeur=" + tableauDeVendeur
				+ "]";
	}

}// fin de la classe
