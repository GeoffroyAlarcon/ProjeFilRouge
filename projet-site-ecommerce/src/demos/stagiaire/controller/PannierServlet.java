package demos.stagiaire.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import demos.stagiaire.model.Panier;

/**
 * Servlet implementation class PannierServlet
 */
@WebServlet("/panier")
public class PannierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PannierServlet() {
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
		request.setAttribute("cart", panier.findAll());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/produit/panier.jsp").forward(request, response);
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
