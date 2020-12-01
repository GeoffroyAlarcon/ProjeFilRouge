package demos.stagiaire.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import demos.stagiaire.model.LigneCommandePanierProduit;
import demos.stagiaire.model.Product;
import fr.demos.config.MyConnection;

public class PanierProduitDao implements Dao<LigneCommandePanierProduit> {

	@Override
	public LigneCommandePanierProduit save(LigneCommandePanierProduit ligne) {
		// TODO Auto-generated method stub
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement(
						"insert into produitPanier (quantiteCommandee,produitID,) values (?,?); ",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setInt(1, ligne.getQuantiteCommandee());
				ps.setInt(2, ligne.getProduit().getId());
				ps.executeUpdate();
				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					ligne.setId(resultat.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void remove(LigneCommandePanierProduit ligne) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("DELETE FROM acheteur WHERE produitPanierID = ?");
				ps.setInt(1, ligne.getId());
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public LigneCommandePanierProduit update(LigneCommandePanierProduit t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LigneCommandePanierProduit findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<LigneCommandePanierProduit> findAll() {
		ProductDao productDao = new ProductDao();
		ArrayList<LigneCommandePanierProduit> lignes = new ArrayList<LigneCommandePanierProduit>();
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("select * from produitPanier ;");
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					int id = result.getInt("produitPanierID");
					int idProduct = result.getInt("produitID");
					int quantiteCommandee = result.getInt("quantiteCommandee");
					Product produit = productDao.findById(idProduct);
					LigneCommandePanierProduit ligne = new LigneCommandePanierProduit(id, quantiteCommandee, produit);
					lignes.add(ligne);
					return lignes;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
