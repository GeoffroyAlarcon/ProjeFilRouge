package demos.stagiaire.model;

public class LigneCommandePanierProduit {
	private int id;
	private int quantiteCommandee;
	private Panier panier;

	public LigneCommandePanierProduit(int id, int quantiteCommandee, Panier panier) {
		super();
		this.id = id;
		this.quantiteCommandee = quantiteCommandee;
		this.panier = panier;
	
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

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}


	@Override
	public String toString() {
		return "LigneCommandePanierProduit [id=" + id + ", quantiteCommandee=" + quantiteCommandee + ", panier="
				+ panier;
	}

}
