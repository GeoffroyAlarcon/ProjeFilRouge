package demos.stagiaire.service;

import java.util.ArrayList;

import demos.stagiaire.model.Purchasser;

import demos.stagiaire.model.Seller;

public class ServiceUtilisateur {

	private ArrayList<Purchasser> tableauDAcheteur = new ArrayList();
	private ArrayList<Seller> tableauDeVendeur = new ArrayList();

	public ServiceUtilisateur() {
	}

	public ArrayList<Purchasser> getTableauDAcheteur() {
		return tableauDAcheteur;
	}

	public void setTableauDAcheteur(ArrayList<Purchasser> tableauDAcheteur) {
		this.tableauDAcheteur = tableauDAcheteur;
	}

	public ArrayList<Seller> getTableauDeVendeur() {
		return tableauDeVendeur;
	}

	public void setTableauDeVendeur(ArrayList<Seller> tableauDeVendeur) {
		this.tableauDeVendeur = tableauDeVendeur;
	}

	public void addPurchaser(Purchasser acheteur) {
		tableauDAcheteur.add(acheteur);
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
		for (int i = 0; i < tableauDAcheteur.size(); i++) {
			Purchasser findDAcheteurById = tableauDAcheteur.get(i);
			if (id == findDAcheteurById.getId()) {
				return tableauDAcheteur.get(i);
			}

		}
		return null;

	}

	public Purchasser findByLoginPourchasser(String email, String passeword) {
		for (int i = 0; i < tableauDAcheteur.size(); i++) {
			Purchasser findPurchasser = tableauDAcheteur.get(i);
			if (email.equals(findPurchasser.getEmail()) && passeword.equals(findPurchasser.getPasseword())) {
				return tableauDAcheteur.get(i);
			}

		}
		return null;

	}

	public Seller findByLoginSeller(String email, String passeword) {
		for (int i = 0; i < tableauDeVendeur.size(); i++) {
			Seller findSeller = tableauDeVendeur.get(i);
			if (email.equals(findSeller.getEmail()) && passeword.equals(findSeller.getPasseword())) {
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

	public void updateOnePurchasser(int id, Purchasser purchasser) {
		for (int i = 0; i < tableauDAcheteur.size(); i++) {
			Purchasser findAcheteurById = tableauDAcheteur.get(i);
			if (id == findAcheteurById.getId()) {
				tableauDAcheteur.remove(findAcheteurById);
				tableauDAcheteur.add(purchasser);
			}

		}

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
		return tableauDAcheteur;

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
