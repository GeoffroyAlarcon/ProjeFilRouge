package demos.stagiaire.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import demos.stagiaire.model.LigneCommandePanierProduit;
import demos.stagiaire.model.LignePanier;
import demos.stagiaire.model.Panier;
import demos.stagiaire.model.Purchasser;
import fr.demos.config.MyConnection;

public class PanierDao implements Dao<LignePanier> {

	@Override
	public LignePanier save(LignePanier lignePanier) {
		// TODO Auto-generated method stub
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement(
						"insert into panier (produitPanierID,acheteurID) values (?,?); ",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setInt(1, lignePanier.getLigneCommandePanierProduit().getId());
				ps.setInt(2, lignePanier.getAcheteur().getId());
				ps.executeUpdate();
				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					lignePanier.setId(resultat.getInt(1));

					return lignePanier;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void remove(LignePanier lignePanier) {

	}

	@Override
	public LignePanier findById(int id) {
		// TODO Auto-generated method stub
		Connection c = MyConnection.getConnection();
		PurchasserDao purchasserDao = new PurchasserDao();
		PanierProduitDao panierProduitDao = new PanierProduitDao();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("select * from Panier ");
				;
				ResultSet result = ps.executeQuery();
				if (result.next()) {
					LigneCommandePanierProduit lignePP = panierProduitDao.findById(result.getInt("produitPanierID"));
					Purchasser acheteur = purchasserDao.findById(result.getInt("acheteurID"));
					LignePanier ligne = new LignePanier(lignePP, acheteur);
					return ligne;

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public ArrayList<LignePanier> findAll() {
		Connection c = MyConnection.getConnection();
		ArrayList<LignePanier> lignePaniers = new ArrayList<LignePanier>();
		PurchasserDao purchasserDao = new PurchasserDao();
		PanierProduitDao panierProduitDao = new PanierProduitDao();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("select * from Panier ");
				;
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					LigneCommandePanierProduit lignePP = panierProduitDao.findById(result.getInt("produitPanierID"));
					Purchasser acheteur = purchasserDao.findById(result.getInt("acheteurID"));
					LignePanier ligne = new LignePanier(lignePP, acheteur);
					lignePaniers.add(ligne);
					return lignePaniers;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public LignePanier update(LignePanier t) {
		// TODO Auto-generated method stub
		return null;
	}

}
