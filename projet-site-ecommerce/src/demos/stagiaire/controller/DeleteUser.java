package demos.stagiaire.controller;

import java.io.IOException;
import java.nio.file.attribute.UserPrincipalLookupService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import demos.stagiaire.model.Purchasser;
import demos.stagiaire.model.Seller;
import demos.stagiaire.service.ServiceUtilisateur;


/**
 * Servlet implementation class DeleteUser
 */
@WebServlet("/deleteUser")
public class DeleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteUser() {
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
		ServiceUtilisateur serviceUtilisateur = (ServiceUtilisateur) session.getAttribute("serviceUser");
		int id = (Integer) session.getAttribute("id");
		Purchasser acheteur = (Purchasser) session.getAttribute("acheteur");
		Seller vendeur = (Seller) session.getAttribute("vendeur");
		if (serviceUtilisateur.findByIdPourchasser(id) != null) {
			serviceUtilisateur.removePurchaser(acheteur);
			session.invalidate();
		}
		if (serviceUtilisateur.findByIdSeller(id) != null) {
			serviceUtilisateur.removeSeller(vendeur);
			session.invalidate();
		 
		}
		response.sendRedirect("/auth");
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
