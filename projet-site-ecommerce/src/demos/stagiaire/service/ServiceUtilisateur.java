package demos.stagiaire.service;

import java.util.ArrayList;

import demos.stagiaire.dao.PurchasserDao;
import demos.stagiaire.model.Adresse;
import demos.stagiaire.model.Purchasser;

import demos.stagiaire.model.Seller;

public class ServiceUtilisateur {

	private PurchasserDao tableauDAcheteur = new PurchasserDao();
	private ArrayList<Seller> tableauDeVendeur = new ArrayList<Seller>();

	public ServiceUtilisateur() {
	}

	

	public PurchasserDao getTableauDAcheteur() {
		return tableauDAcheteur;
	}



	public void setTableauDAcheteur(PurchasserDao tableauDAcheteur) {
		this.tableauDAcheteur = tableauDAcheteur;
	}



	public ArrayList<Seller> getTableauDeVendeur() {
		return tableauDeVendeur;
	}

	public void setTableauDeVendeur(ArrayList<Seller> tableauDeVendeur) {
		this.tableauDeVendeur = tableauDeVendeur;
	}

	public Purchasser addPurchaser(Purchasser acheteur) {
		return tableauDAcheteur.save(acheteur);
	}

	public void addSeller(Seller vendeur) {
		tableauDeVendeur.add(vendeur);
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

	//public Purchasser findByLoginPurchasser(String email, String password) {
	//return tableauDAcheteur

	//}

	public Seller findByLoginSeller(String email, String password) {
		for (int i = 0; i < tableauDeVendeur.size(); i++) {
			Seller findSeller = tableauDeVendeur.get(i);
			if (email.equals(findSeller.getEmail()) && password.equals(findSeller.getPassword())) {
				return tableauDeVendeur.get(i);
			}

		}
		return null;

	}

	public Seller findByIdSeller(int id) {
		for (int i = 0; i < tableauDeVendeur.size(); i++) {
			Seller findDeVendeurById = tableauDeVendeur.get(i);
			if (id == findDeVendeurById.getId()) {
				return tableauDeVendeur.get(i);
			}

		}
		return null;

	}

	public Purchasser update( Purchasser purchasser) {
		return tableauDAcheteur.update(purchasser);
	}

	public void updateOne(int id, Seller seller) {
		for (int i = 0; i < tableauDeVendeur.size(); i++) {
			Seller findVendeurById = tableauDeVendeur.get(i);
			if (id == findVendeurById.getId()) {
				tableauDeVendeur.remove(findVendeurById);
				tableauDeVendeur.add(seller);
			}

		}

	}

	public ArrayList<Purchasser> findAllPurchasser() {
		return tableauDAcheteur.findAll();

	}

	public ArrayList<Seller> findallSeller() {
		return tableauDeVendeur;
	}

	@Override
	public String toString() {
		return "ServiceUtilisateur [tableauDAcheteur=" + tableauDAcheteur + ", tableauDeVendeur=" + tableauDeVendeur
				+ "]";
	}

}// fin de la classe
