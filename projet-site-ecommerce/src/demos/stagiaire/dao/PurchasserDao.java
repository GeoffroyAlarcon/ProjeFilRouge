package demos.stagiaire.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import demos.stagiaire.model.Adresse;
import demos.stagiaire.model.Purchasser;

import fr.demos.config.MyConnection;

public class PurchasserDao implements Dao<Purchasser> {

	@Override
	public Purchasser save(Purchasser purchasser) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("insert into utilisateur (email,password) values (?,?); ",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, purchasser.getEmail());
				ps.setString(2, purchasser.getPassword());
				ps.executeUpdate();

				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					purchasser.setId(resultat.getInt(1));
				}
				ps = c.prepareStatement("insert into adresse (adresse,ville,codePostale) values (?,?,?); ",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, purchasser.getAdresse().getNomRue());
				ps.setString(2, purchasser.getAdresse().getVille());
				ps.setString(3, purchasser.getAdresse().getCodePostal());
				ps.executeUpdate();
				resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					purchasser.getAdresse().setId(resultat.getInt(1));
				}

				ps = c.prepareStatement(
						"insert into acheteur (carteBancaire,nom,prenom,utilisateurID,AdresseID,numeroTel,acheteurID)  value (?,?,?,?,?,?,?);",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, purchasser.getCarteBancaire());
				ps.setString(2, purchasser.getNom());
				ps.setString(3, purchasser.getPrenom());
				ps.setInt(4, purchasser.getId());
				ps.setInt(5, purchasser.getAdresse().getId());
				ps.setString(6, purchasser.getNumeroTel());
				ps.setInt(7, purchasser.getId());
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void remove(Purchasser acheteur) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				String request = "DELETE FROM acheteur WHERE utilisateurID = ?;";
				PreparedStatement ps = c.prepareStatement(request);
				ps.setInt(1, acheteur.getId());
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public Purchasser update(Purchasser purchasser) {
		// TODO Auto-generated method stub
		return purchasser;
	}

	@Override
	public Purchasser findById(int idSaisie) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				String request = "select * from acheteur where acheteurID = ?";
				PreparedStatement ps = c.prepareStatement(request);
				ps.setInt(1, idSaisie);
				ResultSet result = ps.executeQuery();
				if (result.next()) {
					int id = result.getInt("acheteurID");
					String carteBancaire = result.getString("carteBancaire");
					String nom = result.getString("nom");
					String prenom = result.getString("prenom");
					String numeroTel = result.getString("numeroTel");
					String nomRue = result.getString("adresse");
					String codePostal = result.getString("codePostale");
					String ville = result.getString("ville");
					String email = result.getString("email");
					String password = result.getString("password");
					Adresse adresse = new Adresse(nomRue, codePostal, ville);
					Purchasser acheteur = new Purchasser(id, email, password, carteBancaire, numeroTel, nom, prenom,
							adresse);
					return acheteur;
				} else {
					return null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;

	}

	public Purchasser findByloginAndPasseword(String email, String password) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				String request = "select * from acheteur inner join adresse on acheteur.adresseID = adresse.adresseID inner join  utilisateur on utilisateur.utilisateurID = acheteur.utilisateurID where  email  = ? and password = ?;";
				PreparedStatement ps = c.prepareStatement(request);
				System.out.println("hello world !");
				ps.setString(1, email);
				ps.setString(2, password);
				ResultSet result = ps.executeQuery();
				if (result.next()) {
					int id = result.getInt("acheteurID");
					String carteBancaire = result.getString("carteBancaire");
					String nom = result.getString("nom");
					String prenom = result.getString("prenom");
					String numeroTel = result.getString("numeroTel");
					String nomRue = result.getString("adresse");
					String codePostal = result.getString("codePostale");
					String ville = result.getString("ville");
					Adresse adresse = new Adresse(nomRue, codePostal, ville);
					Purchasser acheteur = new Purchasser(id, email, password, carteBancaire, numeroTel, nom, prenom,
							adresse);
					return acheteur;
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
	public ArrayList<Purchasser> findAll() {
		ArrayList<Purchasser> purchassers = new ArrayList<Purchasser>();
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				String request = "select * from acheteur inner join adresse on acheteur.adresseID = adresse.adresseID inner join  utilisateur on utilisateur.utilisateurID = acheteur.utilisateurID;";
				PreparedStatement ps = c.prepareStatement(request);
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					int id = result.getInt("acheteurID");
					String email = result.getString("email");
					String password = result.getString("password");
					String carteBancaire = result.getString("carteBancaire");
					String nom = result.getString("nom");
					String prenom = result.getString("prenom");
					String numeroTel = result.getString("numeroTel");
					String nomRue = result.getString("adresse");
					String codePostal = result.getString("codePostale");
					String ville = result.getString("ville");
					Adresse adresse = new Adresse(nomRue, codePostal, ville);
					Purchasser acheteur = new Purchasser(id, email, password, carteBancaire, numeroTel, nom, prenom,
							adresse);
					purchassers.add(acheteur);
				}
				return purchassers;

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
