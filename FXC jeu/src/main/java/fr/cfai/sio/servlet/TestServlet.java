package fr.cfai.sio.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.cfai.sio.business.Test;
import fr.cfai.sio.service.TestService;
import fr.cfai.sio.service.impl.TestServiceImpl;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;
	private TestService testServiceImpl;
	

	/**
	 * @throws Exception
	 * @see HttpServlet#HttpServlet()
	 */
	public TestServlet() throws Exception
	{
		super();
		System.out.println("Constructeur TestServlet");

		this.testServiceImpl = new TestServiceImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession(true);
		int idUtilisateur = (int) session.getAttribute("ID");

		int idTest;
		Test test = null;

		idTest = Integer.parseInt(request.getParameter("idTest"));

		test = testServiceImpl.recupereTestParID(idTest);
		
	

		request.setAttribute("TEST", test);
		request.setAttribute("idUtilisateur", idUtilisateur);

		request.getRequestDispatcher("/test.jsp").forward(request, response);
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
