package demos.stagiaire.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import demos.stagiaire.model.Product;
import demos.stagiaire.model.Seller;
import fr.demos.config.MyConnection;

public class ProductDao implements Dao<Product> {

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement(
						"insert into produit (designation,quantiteStock,prixUnitaire,imageURL,vendeurID,description) values (?,?,?,?,?,?); ",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, product.getDesignation());
				ps.setInt(2, product.getQuantiteStock());
				ps.setFloat(3, product.getPrixUnitaire());
				ps.setString(4, product.getImageURL());
				ps.setInt(5, product.getVendeur().getId());
				ps.setString(6, product.getDescription());
				ps.executeUpdate();
				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					product.setId(resultat.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void remove(Product product) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				String request = "DELETE FROM produit WHERE produitID = ?;";
				PreparedStatement ps = c.prepareStatement(request);
				ps.setInt(1, product.getId());
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findById(int id){
	Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				SellerDao sellerDao = new SellerDao();
				String request = " Select * FROM produit WHERE produitID = ?;";
				PreparedStatement ps = c.prepareStatement(request);
				ps.setInt(1, id);
				ResultSet result = ps.executeQuery();
				if (result.next()) {
					String designation = result.getString("designation");
					float prixUnitaire = result.getFloat("prixUnitaire");
					int quantiteStock = result.getInt("quantiteStock");
					int idVendeur = result.getInt("vendeurID");
					String description = result.getString("description");
					String imageURL = result.getString("imageURL");
					Seller vendeur = sellerDao.findById(idVendeur);
					Product produit = new Product(id, designation, prixUnitaire, quantiteStock, vendeur, imageURL,
							description);
					return produit;	
				}
					 else {
							return null;
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				return null;

			}

	@Override
	public ArrayList<Product> findAll() {
		ArrayList<Product> products = new ArrayList<Product>();
		Connection c = MyConnection.getConnection();
		SellerDao sellerDao = new SellerDao();
		if (c != null) {
			try {
				String request = "select * from  produit;";
				PreparedStatement ps = c.prepareStatement(request);
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					int id = result.getInt("produitID");
					String designation = result.getString("designation");
					float prixUnitaire = result.getFloat("prixUnitaire");
					int quantiteStock = result.getInt("quantiteStock");
					int idVendeur = result.getInt("vendeurID");
					String description = result.getString("description");
					String imageURL = result.getString("imageURL");
					Seller vendeur = sellerDao.findById(idVendeur);
					Product produit = new Product(id, designation, prixUnitaire, quantiteStock, vendeur, imageURL,
							description);
					products.add(produit);
				}
				return products;

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public ArrayList<Product> findProductBySeller(Seller seller) {
		ArrayList<Product> productSeller = new ArrayList<Product>();
		ArrayList<Product> products = new ArrayList<Product>();
		Connection c = MyConnection.getConnection();
		SellerDao sellerDao = new SellerDao();
		if (c != null) {
			try {
				String request = "select * from  produit where vendeurID = ?;";
				PreparedStatement ps = c.prepareStatement(request);
				ps.setInt(1, seller.getId());
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					int id = result.getInt("produitID");
					String designation = result.getString("designation");
					float prixUnitaire = result.getFloat("prixUnitaire");
					int quantiteStock = result.getInt("quantiteStock");
					int idVendeur = result.getInt("vendeurID");
					String description = result.getString("description");
					String imageURL = result.getString("imageURL");
					Seller vendeur = sellerDao.findById(idVendeur);
					Product produit = new Product(id, designation, prixUnitaire, quantiteStock, vendeur, imageURL,
							description);
					products.add(produit);
				}
				return products;

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;

	}

}
