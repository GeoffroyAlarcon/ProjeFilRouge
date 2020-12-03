package demos.stagiaire.model;

import java.util.ArrayList;

import org.apache.jasper.tagplugins.jstl.core.Remove;

import demos.stagiaire.dao.PanierDao;
import demos.stagiaire.dao.PanierProduitDao;

public class Panier {
	private PanierProduitDao panierProduitDao = new PanierProduitDao();
	private PanierDao panierDao = new PanierDao();
	public LignePanier add(LignePanier lignePanier) {
		return panierDao.save(lignePanier);
	}

	public void removeall(Purchasser purchasser) {
		panierDao.removeAllProductInCart(purchasser);
		panierProduitDao.removeAllProductInCart(purchasser);
	}

	public ArrayList<LigneCommandePanierProduit> findByPurchasser(Purchasser purchasser) {
		return panierProduitDao.findByPurchasser(purchasser);

	}
}