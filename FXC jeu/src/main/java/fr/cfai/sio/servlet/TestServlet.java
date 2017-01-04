package fr.cfai.sio.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import fr.cfai.sio.business.Commentaire;
import fr.cfai.sio.business.Test;
import fr.cfai.sio.service.CommentaireService;
import fr.cfai.sio.service.JeuService;
import fr.cfai.sio.service.TestService;
import fr.cfai.sio.service.impl.CommentaireServiceImpl;
import fr.cfai.sio.service.impl.JeuServiceImpl;
import fr.cfai.sio.service.impl.TestServiceImpl;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private TestService testServiceImpl;
	private CommentaireService commentaireServiceImpl;
	private JeuService jeuServiceImpl;

	/**
	 * @throws Exception
	 * @see HttpServlet#HttpServlet()
	 */
	public TestServlet() throws Exception {
		super();
		System.out.println("Constructeur TestServlet");

		this.testServiceImpl = new TestServiceImpl();
		this.commentaireServiceImpl = new CommentaireServiceImpl();
		this.jeuServiceImpl = new JeuServiceImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		int idTest;
		Test test = null;
		int idUtilisateur = (int) session.getAttribute("ID");
		String loginUtilisateur = (String) session.getAttribute("LOGIN");
		List<Commentaire> listeCommentaire = new ArrayList<>();
		listeCommentaire.clear();

		idTest = Integer.parseInt(request.getParameter("idTest"));

		test = testServiceImpl.recupereTestParID(idTest);
		//listeCommentaire = commentaireServiceImpl.recupererCommentaireParTest(idTest);

		//request.setAttribute("ListeCOM", listeCommentaire);
		request.setAttribute("TEST", test);
		request.setAttribute("idUtilisateur", idUtilisateur);
		request.setAttribute("loginUtilisateur", loginUtilisateur);

		request.getRequestDispatcher("/test.jsp").forward(request, response);

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
