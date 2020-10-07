package demos.stagiaire.model;

public class Adresse {
	private int id;
	private String nomRue;
	private String codePostal;

	public Adresse(int id, String nomRue, String codePostal) {
		super();
		this.id = id;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
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

	@Override
	public String toString() {
		return "Adresse [id=" + id + ", nomRue=" + nomRue + ", codePostal=" + codePostal + "]";
	}

}
