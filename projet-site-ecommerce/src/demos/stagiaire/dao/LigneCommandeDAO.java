package demos.stagiaire.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import demos.stagiaire.model.Commande;
import demos.stagiaire.model.LigneCommande;
import demos.stagiaire.model.LigneCommandePanierProduit;
import demos.stagiaire.model.Product;
import demos.stagiaire.model.Purchasser;
import fr.demos.config.MyConnection;

public class LigneCommandeDAO implements Dao<LigneCommande> {

	@Override
	public LigneCommande save(LigneCommande ligne) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement(
						"insert into ligneCommande (stockCommandee,produitID,commandeID) values (?,?,?); ",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setInt(1, ligne.getQuantiteCommandee());
				ps.setInt(2, ligne.getProduit().getId());
				ps.setInt(3, ligne.getCommande().getId());
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
	public void remove(LigneCommande ligne) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("DELETE FROM ligneCommande WHERE ligneCommandeID= ?");
				ps.setInt(1, ligne.getId());
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public LigneCommande update(LigneCommande t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LigneCommande findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<LigneCommande> findAll() {

		ProductDao productDao = new ProductDao();
		CommandeDao commandeDao = new CommandeDao();
		ArrayList<LigneCommande> lignes = new ArrayList<LigneCommande>();
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("select * from ligneCommande ;");
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					int id = result.getInt("produitPanierID");
					int idProduct = result.getInt("produitID");
					int idCommande = result.getInt("commandeID");
					int quantiteCommandee = result.getInt("stockCommandee");
					Product produit = productDao.findById(idProduct);
					Commande commande = commandeDao.findById(idCommande);
					LigneCommande ligne = new LigneCommande(id, quantiteCommandee, commande, produit);
					lignes.add(ligne);
				}
				return lignes;

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public ArrayList<LigneCommande> findbyPurchasser(Purchasser purchasser) {

		ProductDao productDao = new ProductDao();
		CommandeDao commandeDao = new CommandeDao();
		ArrayList<LigneCommande> lignes = new ArrayList<LigneCommande>();
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("select * from ligneCommande inner join commande  on ligneCommande.commandeID = commande.commandeID where acheteurID =? ;");
				ps.setInt(1, purchasser.getId());
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					int id = result.getInt("ligneCommandeID");
					int idProduct = result.getInt("produitID");
					int idCommande = result.getInt("commandeID");
					int quantiteCommandee = result.getInt("stockCommandee");
					Product produit = productDao.findById(idProduct);
					Commande commande = commandeDao.findById(idCommande);
					LigneCommande ligne = new LigneCommande(id, quantiteCommandee, commande, produit);
					lignes.add(ligne);
				}
				return lignes;

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
