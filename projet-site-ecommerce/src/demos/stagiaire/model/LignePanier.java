package demos.stagiaire.model;


public class LignePanier {
private int id;
	private LigneCommandePanierProduit ligneCommandePanierProduit = new LigneCommandePanierProduit();
	private Purchasser acheteur = new Purchasser();
	/**
	 * @param ligneCommandePanierProduit
	 * @param acheteur
	 */
	
	public LignePanier(LigneCommandePanierProduit ligneCommandePanierProduit, Purchasser acheteur) {
		super();
		this.ligneCommandePanierProduit = ligneCommandePanierProduit;
		this.acheteur = acheteur;
	}
/**
 * @param ligneCommandePanierProduit
 * @param acheteur
 */
	/**
	 * @param id
	 * @param ligneCommandePanierProduit
	 * @param acheteur
	 */
	public LignePanier(int id, LigneCommandePanierProduit ligneCommandePanierProduit, Purchasser acheteur) {
		super();
		this.id = id;
		this.ligneCommandePanierProduit = ligneCommandePanierProduit;
		this.acheteur = acheteur;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LigneCommandePanierProduit getLigneCommandePanierProduit() {
		return ligneCommandePanierProduit;
	}
	public void setLigneCommandePanierProduit(LigneCommandePanierProduit ligneCommandePanierProduit) {
		this.ligneCommandePanierProduit = ligneCommandePanierProduit;
	}
	public Purchasser getAcheteur() {
		return acheteur;
	}
	public void setAcheteur(Purchasser acheteur) {
		this.acheteur = acheteur;
	}


}
