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
 * Servlet implementation class PannierServlet
 */
@WebServlet("/panier")
public class PanierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServiceCommande serviceCommande = new ServiceCommande();

	public PanierServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Panier panier = (Panier) session.getAttribute("panier");
		request.setAttribute("prixTotalPanier", panier.prixTotalPanier());
		request.setAttribute("cart", panier.findAll());

		getServletContext().getRequestDispatcher("/WEB-INF/produit/panier.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Purchasser acheteur = (Purchasser) session.getAttribute("acheteur");
		Date datescommande = new Date();
		ServiceProduit serviceProduit = (ServiceProduit) session.getAttribute("serviceProduit");
		Panier panier = (Panier) session.getAttribute("panier");
		ArrayList<LigneCommandePanierProduit> allProduct = panier.findAll();
		for (LigneCommandePanierProduit ligne : allProduct) {
			Product produit = ligne.getProduit();
			int quantitecommandee = ligne.getQuantiteCommandee();
			produit.setQuantiteStock(produit.getQuantiteStock() - quantitecommandee);
			int id = produit.getId();
			serviceProduit.updateOne(id, produit);
		}
		Commande commande = new Commande(22, datescommande, acheteur);
		session.setAttribute("serviceProduit", serviceProduit);
		session.setAttribute("commande", commande);
		session.setAttribute("serviceCommande", serviceCommande);

	}

}
