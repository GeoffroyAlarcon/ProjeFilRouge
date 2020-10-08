package demos.stagiaire.model;

public class Produit {
	private int id;
	private String designation;
	private float prixUnitaire;
	private int quantiteStock;
	private Vendeur vendeur;
	private String imageURL;
	private String description;
	private String caract�ristique;

	public Produit(int id, String designation, float prixUnitaire, int quantiteStock, Vendeur vendeur, String imageURL,
			String description, String caract�ristique) {
		super();
		this.id = id;
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
		this.quantiteStock = quantiteStock;
		this.vendeur = vendeur;
		this.imageURL = imageURL;
		this.description = description;
		caract�ristique = caract�ristique;
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

	public Vendeur getVendeur() {
		return vendeur;
	}

	public void setProduit(Vendeur vendeur) {
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

	public String getCaract�ristique() {
		return caract�ristique;
	}

	public void setCaract�ristique(String caract�ristique) {
		caract�ristique = caract�ristique;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", designation=" + designation + ", prixUnitaire=" + prixUnitaire
				+ ", quantiteStock=" + quantiteStock + ", vendeur=" + vendeur + ", imageURL=" + imageURL
				+ ", description=" + description + ", Caract�ristique=" + caract�ristique + "]";
	}

}
