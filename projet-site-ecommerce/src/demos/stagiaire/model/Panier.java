package demos.stagiaire.model;

public class Panier {
	private int id;
	private Produit produit;
	private Acheteur acheteur;

	public Panier(int id, Produit produit, Acheteur acheteur) {
		super();
		this.id = id;
		this.produit = produit;
		this.acheteur = acheteur;
	}
	public Panier() {
		super();
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Acheteur getAcheteur() {
		return acheteur;
	}

	public void setAcheteur(Acheteur acheteur) {
		this.acheteur = acheteur;
	}
	@Override
	public String toString() {
		return "Panier [id=" + id + ", produit=" + produit + ", acheteur=" + acheteur + "]";
	}

}
