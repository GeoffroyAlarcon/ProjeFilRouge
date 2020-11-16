package demos.stagiaire.model;

public class User {
	private int id;
	private String email;
	private String password;

	public User(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String passeword) {
		this.password = passeword;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", Password=" + password + "]";
	}

}
