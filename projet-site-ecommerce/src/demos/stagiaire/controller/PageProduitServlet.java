package demos.stagiaire.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import demos.stagiaire.model.LigneCommande;
import demos.stagiaire.model.LigneCommandePanierProduit;
import demos.stagiaire.model.Panier;
import demos.stagiaire.model.Produit;
import demos.stagiaire.model.Purchasser;

import demos.stagiaire.service.ServiceProduit;


/**
 * Servlet implementation class PageProduitServlet
 */
@WebServlet("/pageProduit")
public class PageProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
private ServiceProduit serviceProduit = new ServiceProduit();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PageProduitServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		HttpSession session = request.getSession();
		int idProduit = Integer.parseInt((String) request.getParameter("idObject"));
		ServiceProduit serviceProduit = (ServiceProduit) session.getAttribute("serviceProduit");
		Produit produit = serviceProduit.findById(idProduit);
		session.setAttribute("produit", produit);
		this.getServletContext().getRequestDispatcher("/WEB-INF/produit/pageProduit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		System.out.println(request.getAttribute("test"));
		HttpSession session = request.getSession();
		Produit produit = (Produit) session.getAttribute("produit");
		Panier panier = (Panier) session.getAttribute("panier");
		int quantiteCommandee = Integer.parseInt(request.getParameter("quantite"));
		LigneCommandePanierProduit ligneCommandePanierProduit = new LigneCommandePanierProduit(1, quantiteCommandee,
				produit);
		panier.addInCart(ligneCommandePanierProduit);
		response.sendRedirect("panier");
	}

}
