package demos.stagiaire.model;

import java.util.Date;

public class Commande {
	private int id;
	private Date datescommande;
	private Acheteur acheteur;

	public Commande(int id, Date datescommande, Acheteur acheteur) {
		super();
		this.id = id;
		this.datescommande = datescommande;
		this.acheteur = acheteur;
	}

	public Commande() {
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDatescommande() {
		return datescommande;
	}

	public void setDatescommande(Date datescommande) {
		this.datescommande = datescommande;
	}

	public Acheteur getAcheteur() {
		return acheteur;
	}

	public void setAcheteur(Acheteur acheteur) {
		this.acheteur = acheteur;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", datescommande=" + datescommande + ", acheteur=" + acheteur + "]";
	}

}
