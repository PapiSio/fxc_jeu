package fr.cfai.sio.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.cfai.sio.business.Jeu;
import fr.cfai.sio.business.Support;
import fr.cfai.sio.service.impl.JeuServiceImpl;

/**
 * Servlet implementation class JeuServlet
 */
public class JeuServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private JeuServiceImpl jeuServiceImpl;

	/**
	 * @throws Exception
	 * @see HttpServlet#HttpServlet()
	 */
	public JeuServlet() throws Exception
	{
		super();
		this.jeuServiceImpl = new JeuServiceImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("jeuServlet : passe par DoGET");
		int idJeu = Integer.parseInt(request.getParameter("idJeu"));

		Jeu jeu = jeuServiceImpl.recupereJeuParID(idJeu);

		request.setAttribute("JEU", jeu);

		if (jeu.getListeSupports() == null)
		{
			System.out.println("Liste support null");
		}
		else
		{
			System.out.println("Liste support NON null");
			System.out.println(jeu.getListeSupports());
			
			List<Support> ListeSupp = jeu.getListeSupports();

			if (ListeSupp == null)
			{
				System.out.println("ListeSupp null");
			}
			else
			{
				System.out.println("ListeSupp NON null");
				System.out.println(ListeSupp);
				for (Support support : ListeSupp)
				{
					System.out.println("Passe ds foreach liste support");
					System.out.println(support.getLibelleSupport() + " ; ");
				}
			}
		}

		request.getRequestDispatcher("/jeu.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
