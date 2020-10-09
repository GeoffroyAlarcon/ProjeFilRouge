package demos.stagiaire.model;

public class Panier {
	private int id;
	private Produit produit;
	private Purchasser acheteur;

	public Panier(int id, Produit produit, Purchasser acheteur) {
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

	public Purchasser getAcheteur() {
		return acheteur;
	}

	public void setAcheteur(Purchasser acheteur) {
		this.acheteur = acheteur;
	}
	@Override
	public String toString() {
		return "Panier [id=" + id + ", produit=" + produit + ", acheteur=" + acheteur + "]";
	}

}
