package demos.stagiaire.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import demos.stagiaire.model.Produit;
import demos.stagiaire.model.Seller;
import demos.stagiaire.service.ServiceProduit;

/**
 * Servlet implementation class AjoutProduitServlet
 */
@WebServlet("/ajoutProduit")
public class AjoutProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjoutProduitServlet() {
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
			getServletContext().getRequestDispatcher("/WEB-INF/vendeur/ajoutProduit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String designation = request.getParameter("designation");
		float prixUnitaire = Float.parseFloat(request.getParameter("prixUnitaire"));
		int quantiteStock = Integer.parseInt(request.getParameter("quantiteStock"));
		String imageURL = request.getParameter("imageUrl");
		String description = request.getParameter("description");
		Seller vendeur = (Seller) session.getAttribute("vendeur");
		ServiceProduit serviceProduit = (ServiceProduit) session.getAttribute("serviceProduit");
		String[] couleur = { "bleu", "blanc", "marron" };
		Produit produit = new Produit(1, designation, prixUnitaire, quantiteStock, vendeur, imageURL, description,
				couleur);
		serviceProduit.addProcduct(produit);
		session.removeAttribute("serviceProduit");
		session.setAttribute("serviceProduit", serviceProduit);
		response.sendRedirect("home");

	}

}
