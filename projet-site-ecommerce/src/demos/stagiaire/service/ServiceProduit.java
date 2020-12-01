package demos.stagiaire.service;

import java.util.ArrayList;

import demos.stagiaire.dao.ProductDao;
import demos.stagiaire.model.Product;
import demos.stagiaire.model.Seller;

public class ServiceProduit {
	private ProductDao tableauDeProduit = new ProductDao() ;

	public ServiceProduit() {
	}

	
	
	public ProductDao getTableauDeProduit() {
		return tableauDeProduit;
	}



	public void setTableauDeProduit(ProductDao tableauDeProduit) {
		this.tableauDeProduit = tableauDeProduit;
	}



	public Product addProcduct(Product product) {
	return	tableauDeProduit.save(product);

	}

	public void remove(Product produit) {
		tableauDeProduit.remove(produit);
	}

	public Product findById(int id) {
		return tableauDeProduit.findById(id);

	}

	public Product updateOne(int id, Product product) {
		return tableauDeProduit.update(product);
	}

	public ArrayList<Product> findAll() {
		return tableauDeProduit.findAll();
	}

	public ArrayList<Product> findProductBySeller(Seller seller) {
		return tableauDeProduit.findProductBySeller(seller);

	}

	@Override
	public String toString() {
		return "TableauDeProduit [tableauDeProduit=" + tableauDeProduit + "]";
	}

}
