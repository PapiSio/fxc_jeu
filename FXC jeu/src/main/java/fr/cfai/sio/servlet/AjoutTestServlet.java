package fr.cfai.sio.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.cfai.sio.service.TestService;
import fr.cfai.sio.service.impl.TestServiceImpl;

/**
 * Servlet implementation class AjoutTestServlet
 */
@WebServlet("/AjoutTestServlet")
public class AjoutTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TestService testServiceImpl;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutTestServlet() throws Exception {
    	System.out.println("Constructeur AjoutTestServlet");
    	this.testServiceImpl = new TestServiceImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		short note;
		int id_Jeu;
		int id_Utilisateur;
		
		String titre = request.getParameter("titre");
		Date date = new Date();
		int nb_Com = 0;
		String avantage = request.getParameter("avantage");
		String inconvenient = request.getParameter("inconvenient");
		String description = request.getParameter("contenu");
		 note = Short.parseShort(request.getParameter("notes"));
		 id_Jeu = Integer.parseInt(request.getParameter("jeux"));
		id_Utilisateur = Integer.parseInt(request.getParameter("auteur"));

		
			testServiceImpl.ajouterTest(titre, date, nb_Com, avantage, inconvenient, description, note, id_Jeu, id_Utilisateur);
			
			response.sendRedirect("ListeTestsServlet");
	}

}
