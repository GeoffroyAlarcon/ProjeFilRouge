package demos.stagiaire.model;

public class Purchasser extends User {
	private String carteBancaire;
	private String numeroTel;
	private String identite;
	private Adresse adresse;

	public Purchasser(int id, String email, String passeword, String carteBancaire, String numeroTel, String identite,
			Adresse adresse) {
		super(id, email, passeword);
		this.carteBancaire = carteBancaire;
		this.numeroTel = numeroTel;
		this.identite = identite;
		this.adresse = adresse;
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

	public String getIdentite() {
		return identite;
	}

	public void setIdentite(String identite) {
		this.identite = identite;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Acheteur [carteBancaire=" + carteBancaire + ", numeroTel=" + numeroTel + ", identite=" + identite
				+ ", adresse=" + adresse + ", toString()=" + super.toString() + "]";
	}



}
