package demos.stagiaire.model;

import java.util.ArrayList;


import demos.stagiaire.dao.PanierDao;

public class Panier {
	private PanierDao panierDao = new PanierDao();

	public LignePanier add(LignePanier lignePanier) {
		return panierDao.save(lignePanier);
	}

	public ArrayList<LignePanier> findAll() {
		return panierDao.findAll();

	}
}