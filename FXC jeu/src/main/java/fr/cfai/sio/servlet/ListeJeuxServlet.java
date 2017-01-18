package fr.cfai.sio.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.cfai.sio.business.Jeu;
import fr.cfai.sio.service.JeuService;
import fr.cfai.sio.service.TestService;
import fr.cfai.sio.service.impl.JeuServiceImpl;
import fr.cfai.sio.service.impl.TestServiceImpl;

/**
 * Servlet implementation class ListeJeuxServlet
 */
public class ListeJeuxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private JeuService jeuServiceImpl;
	private List<Jeu> listeJeux;
	private TestService testServiceImpl;

	/**
	 * @throws Exception
	 * @see HttpServlet#HttpServlet()
	 */
	public ListeJeuxServlet() throws Exception {
		System.out.println("Constructeur ListeJeuxServlet");

		this.jeuServiceImpl = new JeuServiceImpl();
		this.testServiceImpl = new TestServiceImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		if (request.getParameter("action") != null) {
			
			

			listeJeux = jeuServiceImpl.recupererListeJeux();
			request.setAttribute("ListeJeu", listeJeux);
			request.getRequestDispatcher("/ajoutTest.jsp").forward(request, response);

		}
		
		else{
			
		}

		if (listeJeux == null) {
			// System.out.println("Servlet : Passe par le if, liste null");
			listeJeux = jeuServiceImpl.recupererListeJeux();
			request.setAttribute("LISTE_JEUX", listeJeux);
			request.getRequestDispatcher("/listeJeux.jsp").forward(request, response);
		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
