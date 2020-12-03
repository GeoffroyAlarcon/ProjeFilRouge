package demos.stagiaire.model;

import java.sql.Date;

public class Commande {
	private int id;
	private Date datescommande;
	private Purchasser acheteur;

	public Commande(int id, Date datescommande, Purchasser acheteur) {
		super();
		this.id = id;
		this.datescommande = datescommande;
		this.acheteur = acheteur;
	}

	public Commande(Purchasser acheteur) {
		super();
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

	public Purchasser getAcheteur() {
		return acheteur;
	}

	public void setAcheteur(Purchasser acheteur) {
		this.acheteur = acheteur;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", datescommande=" + datescommande + ", acheteur=" + acheteur + "]";
	}

}
