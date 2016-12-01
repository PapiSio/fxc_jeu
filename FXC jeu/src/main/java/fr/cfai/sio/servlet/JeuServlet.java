package fr.cfai.sio.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.cfai.sio.business.Jeu;
import fr.cfai.sio.business.ModeleEconomique;
import fr.cfai.sio.business.Plateforme;
import fr.cfai.sio.business.Support;
import fr.cfai.sio.service.JeuService;
import fr.cfai.sio.service.ModeleEconomiqueService;
import fr.cfai.sio.service.PlateformeService;
import fr.cfai.sio.service.SupportService;
import fr.cfai.sio.service.impl.JeuServiceImpl;
import fr.cfai.sio.service.impl.ModeleEconomiqueServiceImpl;
import fr.cfai.sio.service.impl.PlateformeServiceImpl;
import fr.cfai.sio.service.impl.SupportServiceImpl;

/**
 * Servlet implementation class JeuServlet
 */
public class JeuServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	private JeuService jeuServiceImpl;
	private SupportService supportServiceImpl;
	private PlateformeService plateformeServiceImpl;
	private ModeleEconomiqueService modeleEconomiqueServiceImpl;

	/**
	 * @throws Exception
	 * @see HttpServlet#HttpServlet()
	 */
	public JeuServlet() throws Exception
	{
		super();
		this.jeuServiceImpl = new JeuServiceImpl();
		this.supportServiceImpl = new SupportServiceImpl();
		this.plateformeServiceImpl = new PlateformeServiceImpl();
		this.modeleEconomiqueServiceImpl = new ModeleEconomiqueServiceImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int idJeu;
		Jeu jeu = null;

		List<Support> listeSupports = new ArrayList<Support>();
		List<Plateforme> listePlateformes = new ArrayList<Plateforme>();
		List<ModeleEconomique> listeModeleEconomiques = new ArrayList<ModeleEconomique>();

		idJeu = Integer.parseInt(request.getParameter("idJeu"));

		jeu = jeuServiceImpl.recupereJeuParID(idJeu);

		listeSupports = supportServiceImpl.recupererListeSupportsParJeu(idJeu);
		listePlateformes = plateformeServiceImpl.recupererListePlateformesParJeu(idJeu);
		listeModeleEconomiques = modeleEconomiqueServiceImpl.recupererListeModeleEconomiquesParJeu(idJeu);

		jeu.setListeSupports(listeSupports);
		jeu.setListePlateformes(listePlateformes);
		jeu.setListeModeleEconomiques(listeModeleEconomiques);

		request.setAttribute("JEU", jeu);

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
