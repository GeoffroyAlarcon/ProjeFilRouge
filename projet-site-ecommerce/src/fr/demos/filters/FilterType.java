package fr.demos.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import demos.stagiaire.dao.PurchasserDao;
import demos.stagiaire.dao.SellerDao;
import demos.stagiaire.model.Purchasser;
import demos.stagiaire.model.Seller;


/**
 * Servlet Filter implementation class FilterType
 */
@WebFilter({ "/home", "/addProduct", "/deleteProduct" })
public class FilterType implements Filter {
	private PurchasserDao purchasserDao = new PurchasserDao();
	private SellerDao sellerDao = new SellerDao();

	/**
	 * Default constructor.
	 */
	public FilterType() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		Seller seller = (Seller) session.getAttribute("vendeur");
		Purchasser purchasser = (Purchasser) session.getAttribute("acheteur");
		String chemin = req.getServletPath();
		String methode = req.getMethod();
		if (purchasserDao.findById(purchasser.getId()) != null && (chemin.equals("/pizza/delete")
				|| chemin.equals("/pizza/confirmation") || chemin.equals("/pizza/delete") && methode.equals("POST"))) {
			chain.doFilter(request, response);
		} else if (sellerDao.findById(seller.getId()) != null && (chemin.equals("/pizza/add")
				|| chemin.equals("/pizza/confirmation") || chemin.equals("/pizza/add") && methode.equals("POST"))) {
			chain.doFilter(request, response);
		}

		else {
			res.sendRedirect(req.getContextPath());
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
