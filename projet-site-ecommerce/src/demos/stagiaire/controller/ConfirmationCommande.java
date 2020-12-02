package demos.stagiaire.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import demos.stagiaire.model.Commande;
import demos.stagiaire.model.LigneCommande;
import demos.stagiaire.model.LigneCommandePanierProduit;
import demos.stagiaire.model.Panier;
import demos.stagiaire.model.Product;
import demos.stagiaire.model.Purchasser;
import demos.stagiaire.service.ServiceCommande;
import demos.stagiaire.service.ServiceProduit;

/**
 * Servlet implementation class ConfirmationCommande
 */
@WebServlet("/confirmationCommande")
public class ConfirmationCommande extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConfirmationCommande() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServiceCommande serviceCommande = new ServiceCommande();
		HttpSession session = request.getSession();
		Purchasser acheteur = (Purchasser) session.getAttribute("acheteur");
		Date datescommande = new Date();
		Panier panier = (Panier) session.getAttribute("panier");
		ArrayList<LigneCommandePanierProduit> allProducts = panier.findByPurchasser(purchasser);
		ServiceProduit serviceProduit = (ServiceProduit) session.getAttribute("serviceProduit");
		// boucle pour stocker les commandes qui ont abouti
		for (LigneCommandePanierProduit ligne : allProducts) {
			Product produit = ligne.getProduit();
			int quantiteCommandee = ligne.getQuantiteCommandee();
Commande	commande =(Commande) session.getAttribute("commande");
			LigneCommande ligneCommande = new LigneCommande(2, quantiteCommandee, commande, produit);
			serviceCommande.add(ligneCommande);
		}
		session.setAttribute("serviceCommande", serviceCommande);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
