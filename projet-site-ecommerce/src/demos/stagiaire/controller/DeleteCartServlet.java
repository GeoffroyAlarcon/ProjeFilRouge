package demos.stagiaire.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demos.stagiaire.dao.PanierProduitDao;
import demos.stagiaire.model.LigneCommandePanierProduit;

/**
 * Servlet implementation class DeleteCartServlet
 */
@WebServlet("/deleteCart")
public class DeleteCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PanierProduitDao panierProduitDao = new PanierProduitDao();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteCartServlet() {

		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idligne = Integer.parseInt(request.getParameter("idObject"));
		LigneCommandePanierProduit ligne = panierProduitDao.findById(idligne);
		panierProduitDao.remove(ligne);
response.sendRedirect("panier");
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
