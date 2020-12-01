package demos.stagiaire.model;

public class Seller extends User {
	private String nomCompagnie;
	private String siret;
	private String description;

	public Seller(int id, String email, String password, String nomCompagnie, String siret, String description) {
		super(id, email, password);
		this.nomCompagnie = nomCompagnie;
		this.siret = siret;
		this.description = description;
	}
	

	/**
	 * @param email
	 * @param password
	 * @param nomCompagnie
	 * @param siret
	 * @param description
	 */
	public Seller(String email, String password, String nomCompagnie, String siret, String description) {
		super(email, password);
		this.nomCompagnie = nomCompagnie;
		this.siret = siret;
		this.description = description;
	}


	public Seller(String email, String password, String nomCompagnie, String siret) {
		super(email, password);
		this.nomCompagnie = nomCompagnie;
		this.siret = siret;
	}


	public Seller(int id) {
		super(id);
	}


	public Seller(int id, String email, String password, String nomCompagnie, String siret) {
		super(id, email, password);
		this.nomCompagnie = nomCompagnie;
		this.siret = siret;
	}


	public Seller() {
		super();
	}

	public String getNomCompagnie() {
		return nomCompagnie;
	}

	public void setNomCompagnie(String nomCompagnie) {
		this.nomCompagnie = nomCompagnie;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Seller [nomCompagnie=" + nomCompagnie + ", siret=" + siret + ", description=" + description
				+ ", toString()=" + super.toString() + "]";
	}

}
