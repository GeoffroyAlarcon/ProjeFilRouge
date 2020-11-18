package demos.stagiaire.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import demos.stagiaire.model.Panier;
import demos.stagiaire.model.Purchasser;
import demos.stagiaire.model.Seller;
import demos.stagiaire.service.ServiceProduit;
import demos.stagiaire.service.ServiceUtilisateur;

/**
 * Servlet implementation class AuthServlet
 */
@WebServlet({ "/auth", "/authPurchasser", "/authSeller" })
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServiceUtilisateur serviceUtilisateur = new ServiceUtilisateur();
	private ServiceProduit serviceProduit = new ServiceProduit();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AuthServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getServletPath().contains("authSeller")) {
			this.getServletContext().getRequestDispatcher("/WEB-INF/vendeur/auth.jsp").forward(request, response);
		}
		this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Purchasser acheteur = serviceUtilisateur.findByLoginPurchasser(email, password);
		Seller vendeur = serviceUtilisateur.findByLoginSeller(email, password);
		session.setAttribute("serviceProduit", serviceProduit);
		if (request.getServletPath().contains("authPurchasser") && acheteur != null) {
			Panier panier = new Panier(acheteur);
			session.setAttribute("acheteur", acheteur);
			session.setAttribute("panier", panier);
			session.setAttribute("serviceUser", serviceUtilisateur);
			response.sendRedirect("home");
		} else if (vendeur != null) {
			session.setAttribute("serviceUser", serviceUtilisateur);
			session.setAttribute("vendeur", vendeur);
			System.out.println("hello world !");
			response.sendRedirect("home");
		}

		else {
			this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}

	}

}
