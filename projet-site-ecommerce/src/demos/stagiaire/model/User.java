package demos.stagiaire.model;

public class User {
	private int id;
	private String email;
	private String passeword;

	public User(int id, String email, String passeword) {
		super();
		this.id = id;
		this.email = email;
		this.passeword = passeword;
	}

	public User() {
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasseword() {
		return passeword;
	}

	public void setPasseword(String passeword) {
		this.passeword = passeword;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", Passeword=" + passeword + "]";
	}

}
