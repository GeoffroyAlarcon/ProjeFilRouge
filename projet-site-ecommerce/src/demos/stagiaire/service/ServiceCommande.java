package demos.stagiaire.service;

import java.util.ArrayList;

import demos.stagiaire.model.Product;
import demos.stagiaire.model.Purchasser;
import demos.stagiaire.dao.LigneCommandeDAO;
import demos.stagiaire.model.LigneCommande;

public class ServiceCommande {
	private LigneCommandeDAO ligneCommandeDAO = new LigneCommandeDAO();

	public ServiceCommande(LigneCommandeDAO ligneCommandeDAO) {
		super();
		this.ligneCommandeDAO = ligneCommandeDAO;
	}

	public ServiceCommande() {
		super();
	}

	public LigneCommandeDAO getLigneCommandeDAO() {
		return ligneCommandeDAO;
	}

	public void setLigneCommandeDAO(LigneCommandeDAO ligneCommandeDAO) {
		this.ligneCommandeDAO = ligneCommandeDAO;
	}

	public LigneCommande add(LigneCommande ligne) {
		return ligneCommandeDAO.save(ligne);
	}

	public ArrayList<LigneCommande> findall() {
		return ligneCommandeDAO.findAll();
	}
	public ArrayList<LigneCommande> findbyPurchasser(Purchasser purchasser) {
		return ligneCommandeDAO.findbyPurchasser(purchasser);
	}

	@Override
	public String toString() {
		return "ServiceCommande [ligneCommandeDAO=" + ligneCommandeDAO + "]";
	}

}
