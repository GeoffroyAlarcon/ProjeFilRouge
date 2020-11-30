package demos.stagiaire.model;

public class Purchasser extends User {
	private String carteBancaire;
	private String numeroTel;
	private String nom;
	private String prenom;
	private Adresse adresse;


	/**
	 * @param id
	 * @param email
	 * @param password
	 * @param carteBancaire
	 * @param numeroTel
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	public Purchasser(int id, String email, String password, String carteBancaire, String numeroTel, String nom,
			String prenom, Adresse adresse) {
		super(id, email, password);
		this.carteBancaire = carteBancaire;
		this.numeroTel = numeroTel;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public Purchasser(String email, String password, String carteBancaire, String numeroTel, String nom, String prenom,
			Adresse adresse) {
		super(email, password);
		this.carteBancaire = carteBancaire;
		this.numeroTel = numeroTel;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	/**
	 * @param id
	 * @param email
	 * @param password
	 */
	public Purchasser(int id) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param email
	 * @param password
	 */
	public Purchasser(String email, String password) {
		super(email, password);
		// TODO Auto-generated constructor stub
	}

	public Purchasser() {
		super();
	}

	public String getCarteBancaire() {
		return carteBancaire;
	}

	public void setCarteBancaire(String carteBancaire) {
		this.carteBancaire = carteBancaire;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Purchasser [carteBancaire=" + carteBancaire + ", numeroTel=" + numeroTel + ", nom=" + nom + ", prenom="
				+ prenom + ", adresse=" + adresse + "]";
	}



}
