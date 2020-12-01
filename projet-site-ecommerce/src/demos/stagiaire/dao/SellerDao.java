package demos.stagiaire.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import demos.stagiaire.model.Adresse;
import demos.stagiaire.model.Purchasser;
import demos.stagiaire.model.Seller;
import fr.demos.config.MyConnection;

public class SellerDao implements Dao<Seller> {

	@Override
	public Seller save(Seller seller) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("insert into utilisateur (email,password) values (?,?); ",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, seller.getEmail());
				ps.setString(2, seller.getPassword());
				ps.executeUpdate();
				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					seller.setId(resultat.getInt(1));
				}

				ps = c.prepareStatement("insert into vendeur ( nomCompagnie,siret,utilisateurID,vendeurID)  value (?,?,?,?);",
						PreparedStatement.RETURN_GENERATED_KEYS);
				
				ps.setString(1, seller.getNomCompagnie());
				ps.setString(2, seller.getSiret());
				ps.setInt(3, seller.getId());
				ps.setInt(4, seller.getId());
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void remove(Seller vendeur) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				String request = "DELETE FROM vendeur WHERE utilisateurID = ?;";
				PreparedStatement ps = c.prepareStatement(request);
				ps.setInt(1, vendeur.getId());
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public Seller update(Seller t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seller findById(int id) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				String request = "select * from vendeur inner join  utilisateur on utilisateur.utilisateurID = vendeur.utilisateurID where vendeurID = ?;";
				PreparedStatement ps = c.prepareStatement(request);
				ps.setInt(1, id);

				ResultSet result = ps.executeQuery();
				if (result.next()) {
			
					String email = result.getString("email");
					String password = result.getString("password");
					String nomCompagnie = result.getString("nomCompagnie");
					String siret = result.getString("siret");
					Seller vendeur = new Seller(email, password, nomCompagnie, siret);
					return vendeur;
				} else {
					return null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public Seller findByloginAndPasseword(String email, String password) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				String request = "select * from vendeur inner join  utilisateur on utilisateur.utilisateurID = vendeur.utilisateurID where  email  = ?  and password = ?;";
				PreparedStatement ps = c.prepareStatement(request);
				ps.setString(1, email);
				ps.setString(2, password);
				ResultSet result = ps.executeQuery();
				if (result.next()) {
					int id = result.getInt("utilisateurID");
					String nomCompagnie = result.getString("nomCompagnie");
					String siret = result.getString("siret");
					Seller vendeur = new Seller(id, email, password, nomCompagnie, siret);
					return vendeur;
				} else {
					return null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public ArrayList<Seller> findAll() {
		// TODO Auto-generated method stub
		ArrayList<Seller> sellers = new ArrayList<Seller>();
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				String request = "select * from vendeur inner join join  utilisateur on utilisateur.utilisateurID = vendeur.utilisateurID;";
				PreparedStatement ps = c.prepareStatement(request);
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					int id = result.getInt("utilisateurID");
					String email = result.getString("email");
					String password = result.getString("password");
					String nomCompagnie = result.getString("nomCompagnie");
					String siret = result.getString("siret");
					Seller vendeur = new Seller(id, email, password, nomCompagnie, siret);
					sellers.add(vendeur);
				}
				return sellers;

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
