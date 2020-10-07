package demos.stagiaire.model;

public class Vendeur extends User {
	private String nomCompagnie;
	private String siret;
	private String description;

	public Vendeur(int id, String email, String passeword, String nomCompagnie, String siret, String description) {
		super(id, email, passeword);
		this.nomCompagnie = nomCompagnie;
		this.siret = siret;
		this.description = description;
	}

	public Vendeur() {
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
		return "Vendeur [nomCompagnie=" + nomCompagnie + ", siret=" + siret + ", description=" + description + "]";
	}

	

}
