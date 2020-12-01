package demos.stagiaire.model;

public class LigneCommandePanierProduit {
	private int id;
	private int quantiteCommandee;
	private Product produit;

	public LigneCommandePanierProduit(int id, int quantiteCommandee, Product produit) {
		super();
		this.id = id;
		this.quantiteCommandee = quantiteCommandee;
		this.produit = produit;

	}

	public LigneCommandePanierProduit() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantiteCommandee() {
		return quantiteCommandee;
	}

	public void setQuantiteCommandee(int quantiteCommandee) {
		this.quantiteCommandee = quantiteCommandee;
	}

	public Product getProduit() {
		return produit;
	}

	public void setProduit(Product produit) {
		this.produit = produit;
	}

	public float montant() {
		float montant = this.quantiteCommandee * this.produit.getPrixUnitaire();
		return montant;

	}

	@Override
	public String toString() {
		return "LigneCommandePanierProduit [id=" + id + ", quantiteCommandee=" + quantiteCommandee + ", produit="
				+ produit + "]";
	}

}
