package demos.stagiaire.model;

public class Product {
	private int id;
	private String designation;
	private float prixUnitaire;
	private int quantiteStock;
	private Seller vendeur;
	private String imageURL;
	private String description;



	/**
	 * @param id
	 * @param designation
	 * @param prixUnitaire
	 * @param quantiteStock
	 * @param vendeur
	 * @param imageURL
	 * @param description
	 */
	public Product(int id, String designation, float prixUnitaire, int quantiteStock, Seller vendeur, String imageURL,
			String description) {
		super();
		this.id = id;
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
		this.quantiteStock = quantiteStock;
		this.vendeur = vendeur;
		this.imageURL = imageURL;
		this.description = description;
	}

	/**
	 * @param designation
	 * @param prixUnitaire
	 * @param quantiteStock
	 * @param vendeur
	 * @param imageURL
	 * @param description
	 */
	public Product(String designation, float prixUnitaire, int quantiteStock, Seller vendeur, String imageURL,
			String description) {
		super();
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
		this.quantiteStock = quantiteStock;
		this.vendeur = vendeur;
		this.imageURL = imageURL;
		this.description = description;
	}

	public Product(int id) {
		super();
		this.id = id;
	}

	public Product() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public int getQuantiteStock() {
		return quantiteStock;
	}

	public void setQuantiteStock(int quantiteStock) {
		this.quantiteStock = quantiteStock;
	}

	public Seller getVendeur() {
		return vendeur;
	}

	public void setProduit(Seller vendeur) {
		this.vendeur = vendeur;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	


	@Override
	public String toString() {
		return "Produit [id=" + id + ", designation=" + designation + ", prixUnitaire=" + prixUnitaire
				+ ", quantiteStock=" + quantiteStock + ", vendeur=" + vendeur + ", imageURL=" + imageURL
				+ ", description=" + description ;
	}

}
