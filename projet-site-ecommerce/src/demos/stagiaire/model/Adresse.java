package demos.stagiaire.model;

public class Adresse {
	private int id;
	private String nomRue;
	private String codePostal;
	private String ville;

	public Adresse(int id, String nomRue, String codePostal, String ville) {
		super();
		this.id = id;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public Adresse(String nomRue, String codePostal, String ville) {
		super();

		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public Adresse() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomRue() {
		return nomRue;
	}

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [id=" + id + ", nomRue=" + nomRue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}

}
