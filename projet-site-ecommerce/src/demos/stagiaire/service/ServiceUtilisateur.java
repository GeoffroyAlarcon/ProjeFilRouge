package demos.stagiaire.service;

import java.util.ArrayList;

import demos.stagiaire.model.User;

public class ServiceUtilisateur {
	private ArrayList<User> tableauDeUser = new ArrayList();

	public ServiceUtilisateur(ArrayList<User> tableauDeUser) {
		super();
		this.tableauDeUser = tableauDeUser;
	}

	public ServiceUtilisateur() {
		super();
	}

	public ArrayList<User> getTableauDeUser() {
		return tableauDeUser;
	}

	public void setTableauDeUser(ArrayList<User> tableauDeUser) {
		this.tableauDeUser = tableauDeUser;
	}

	public void addUser(User user) {
		tableauDeUser.add(user);

	}

	public void remove(User user) {
		tableauDeUser.remove(user);
	}

	public User findUser(String email, String passeword) {
		for (int i = 0; i < tableauDeUser.size(); i++) {
			User findUserById = tableauDeUser.get(i);
			if (passeword.equals(findUserById.getPasseword()) && email.equals(findUserById.getEmail())) {
				return tableauDeUser.get(i);
			}

		}
		return null;

	}

	public void updateOne(String email, User user) {
		for (int i = 0; i < tableauDeUser.size(); i++) {
			User findUserById = tableauDeUser.get(i);
			if (email.equals(findUserById.getEmail())) {
				tableauDeUser.remove(findUserById);
				tableauDeUser.add(user);
			}

		}
	}

	public void findAll() {
		for (int i = 0; i < tableauDeUser.size(); i++) {
			System.out.println(tableauDeUser.get(i));
		}
	}

	@Override
	public String toString() {
		return "ServiceUtilisateur [tableauDeUser=" + tableauDeUser + "]";
	}

}
