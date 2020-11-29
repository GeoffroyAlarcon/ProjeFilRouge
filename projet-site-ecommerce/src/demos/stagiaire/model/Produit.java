package demos.stagiaire.model;

public class Produit {
	private int id;
	private String designation;
	private float prixUnitaire;
	private int quantiteStock;
	private Seller vendeur;
	private String imageURL;
	private String description;
	private String [] couleur;

	public Produit(int id, String designation, float prixUnitaire, int quantiteStock, Seller vendeur, String imageURL,
			String description, String [] couleur) {
		super();
		this.id = id;
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
		this.quantiteStock = quantiteStock;
		this.vendeur = vendeur;
		this.imageURL = imageURL;
		this.description = description;
		this.couleur = couleur;
	}

	public Produit(int id, String designation, float prixUnitaire, int quantiteStock, Seller vendeur, String imageURL,
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

	public Produit(int id) {
		super();
		this.id = id;
	}

	public Produit() {
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

	

	public String[] getCouleur() {
		return couleur;
	}

	public void setCouleur(String[] couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", designation=" + designation + ", prixUnitaire=" + prixUnitaire
				+ ", quantiteStock=" + quantiteStock + ", vendeur=" + vendeur + ", imageURL=" + imageURL
				+ ", description=" + description + ", Couleur=" + couleur + "]";
	}

}
