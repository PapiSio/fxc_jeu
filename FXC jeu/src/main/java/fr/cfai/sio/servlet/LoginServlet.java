package fr.cfai.sio.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import fr.cfai.sio.business.Jeu;
import fr.cfai.sio.business.Utilisateur;
import fr.cfai.sio.service.JeuService;
import fr.cfai.sio.service.UtilisateurService;
import fr.cfai.sio.service.impl.JeuServiceImpl;
import fr.cfai.sio.service.impl.UtilisateurServiceImpl;

/**
 * Servlet implementation class ConnexionServlet
 */
public class LoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	public static final int COOKIE_MAX_AGE = 60 * 60 * 24 * 365; // 1 an
	private UtilisateurService utilisateurServiceImpl;
	private JeuService jeuServiceImpl;
	//private TestService testServiceImpl;
	
	
	/**
	 * Default constructor.
	 * @throws Exception 
	 */
	public LoginServlet() throws Exception
	{
		super();
		this.utilisateurServiceImpl=new UtilisateurServiceImpl();
		this.jeuServiceImpl=new JeuServiceImpl();
		//this.testServiceImpl = new TestServiceImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		HttpSession session = request.getSession(true);

		List<Utilisateur> listeUtilisateurs = new ArrayList<Utilisateur>();
		listeUtilisateurs=utilisateurServiceImpl.recupererListeUtilisateurs();

		Boolean existe = false;
		String login = request.getParameter("LOGIN");
		String mdp = request.getParameter("PASSWORD");
		String memoire;
		String loginBase;
		String mdpBase;

		if (request.getParameter("MEMOIRE") != null)
		{
			memoire = "OK";
		}
		else
		{
			memoire = "NOK";
		}

		for (Utilisateur utilisateur : listeUtilisateurs)
		{
			loginBase = utilisateur.getLogin();

			if (login.equals(loginBase))
			{
				mdpBase = utilisateur.getPassword();

				if (mdp.equals(mdpBase))
				{
					existe = true;
					session.setAttribute("ID", utilisateur.getIdUtilisateur());
					session.setAttribute("LOGIN", login);
					session.setAttribute("PASSWORD", mdp);

					setCookie(response, "LOGIN", memoire + "-" + login + "/" + mdp, COOKIE_MAX_AGE);
				}
			}

		}

		if (existe == true)
		{
			session.setAttribute("CONTROLE_CONNEXION", "OK");
			
			//TODO : NE PAS INSTANCIER LES LISTES ICI : Il faut sinon obligatoirement passer par l'index pour y qu'elles se rechargent en m�moire.
			List<Jeu> listeJeux = null;
			listeJeux = jeuServiceImpl.recupererListeJeux();
			request.setAttribute("LISTE_JEUX", listeJeux);
			
			//List<Test> listeTests = null;
		//	listeTests = testServiceImpl.recupererListeTests();
		//	request.setAttribute("LISTE_TESTS", listeTests);
			
			
			request.getRequestDispatcher("/accueil.jsp").forward(request, response);

		}
		else
		{
			session.setAttribute("CONTROLE_CONNEXION", "NOK");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}

	}

	private static void setCookie(HttpServletResponse response, String login, String valeur, int maxAge)
	{
		Cookie cookie = new Cookie(login, valeur);

		cookie.setMaxAge(maxAge);

		response.addCookie(cookie);
	}
}
