package demos.stagiaire.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import demos.stagiaire.model.Commande;
import demos.stagiaire.model.Purchasser;
import fr.demos.config.MyConnection;

public class CommandeDao implements Dao<Commande> {

	@Override
	public Commande save(Commande commande) {
		// TODO Auto-generated method stub
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement(
						"insert into commande (dateCommande,produitID) values (?,?); ",
						PreparedStatement.RETURN_GENERATED_KEYS);
				// ps.setDate(1, commande.getDatescommande());
				ps.setInt(2, commande.getAcheteur().getId());
				ps.executeUpdate();
				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					commande.setId(resultat.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void remove(Commande commande) {
		// TODO Auto-generated method stub
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("DELETE FROM commande WHERE commandeID = ?");
				ps.setInt(1, commande.getId());
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Commande update(Commande t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commande findById(int id) {
		Connection c = MyConnection.getConnection();
		PurchasserDao purchasserDao = new PurchasserDao();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("select * from commande ;");
				ps.setInt(1, id);
				ResultSet result = ps.executeQuery();
				if (result.next()) {
					Date datecommande = result.getDate("datecommande");
					Purchasser acheteur = purchasserDao.findById(result.getInt("acheteurID"));
					Commande commande = new Commande(id, datecommande, acheteur);
					return commande;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public ArrayList<Commande> findAll() {
		Connection c = MyConnection.getConnection();
		PurchasserDao purchasserDao = new PurchasserDao();
		ArrayList<Commande> commandes = new ArrayList<Commande>();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("select * from commande ;");
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					int id = result.getInt("commande");
					Date datecommande = result.getDate("datecommande");
					Purchasser acheteur = purchasserDao.findById(result.getInt("acheteurID"));
					Commande commande = new Commande(id, datecommande, acheteur);
					commandes.add(commande);
				}
				return commandes;

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
