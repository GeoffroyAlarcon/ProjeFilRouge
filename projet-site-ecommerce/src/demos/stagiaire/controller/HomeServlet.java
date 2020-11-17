package demos.stagiaire.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import demos.stagiaire.service.ServiceProduit;
import demos.stagiaire.service.ServiceUtilisateur;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ServiceProduit serviceProduit = new ServiceProduit();

	/**
	 * Default constructor.
	 */
	public HomeServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		ServiceUtilisateur serviceUtilisateur = (ServiceUtilisateur) session.getAttribute("serviceUser");
		session.setAttribute("serviceProduit", serviceProduit);
		session.setAttribute("users", serviceUtilisateur);
		request.setAttribute("produits", serviceProduit.findAll());
		getServletContext().getRequestDispatcher("/WEB-INF/acheteur/home.jsp").forward(request, response);

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
