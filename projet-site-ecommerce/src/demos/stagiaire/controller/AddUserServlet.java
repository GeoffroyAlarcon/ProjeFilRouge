package demos.stagiaire.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import demos.stagiaire.model.Adresse;
import demos.stagiaire.model.Purchasser;
import demos.stagiaire.model.Seller;
import demos.stagiaire.service.ServiceProduit;
import demos.stagiaire.service.ServiceUtilisateur;

/**
 * Servlet implementation class AddUserServlet
 */
@WebServlet("/addUser")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServiceUtilisateur serviceUtilisateur = new ServiceUtilisateur();
	private ServiceProduit serviceProduit = new ServiceProduit();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddUserServlet() {
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
		this.getServletContext().getRequestDispatcher("/WEB-INF/user/addUser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String type = request.getParameter("type");
		if (type.contains("purchasser")) {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String carteBancaire = request.getParameter("cb");
			String numeroTel = request.getParameter("tel");
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String nomRue = request.getParameter("rue");
			String codePostal = request.getParameter("codePostal");
			String ville = request.getParameter("ville");
			Adresse adresse = new Adresse(nomRue, codePostal, ville);
			Purchasser acheteur = new Purchasser(email, password, carteBancaire, numeroTel, nom, prenom, adresse);
			serviceUtilisateur.addPurchaser(acheteur);
			HttpSession session = request.getSession();
			session.setAttribute("acheteur", acheteur);
			session.setAttribute("serviceProduit", serviceProduit);
			session.setAttribute("serviceUser", serviceUtilisateur);
			response.sendRedirect("home");
		}
		if (type.contains("seller")) {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String nomCompagnie = request.getParameter("compagnie");
			String siret = request.getParameter("siret");
			Seller vendeur = new Seller( email, password, nomCompagnie, siret);
			HttpSession session = request.getSession();
			serviceUtilisateur.addSeller(vendeur);
			session.setAttribute("serviceUser", serviceUtilisateur);
			session.setAttribute("serviceProduit", serviceProduit);
			session.setAttribute("vendeur", vendeur);
			response.sendRedirect("home");

		}
	}

}
