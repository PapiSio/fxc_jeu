package fr.cfai.sio.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class TeleversementServlet
 */
public class TeleversementServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TeleversementServlet()
	{
		super();
		System.out.println("Constructeur TeleversementServlet");
		// TODO Auto-generated constructor stub
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
		System.out.println("TeleversementServlet - DoPost");
		String cheminImages = "D:\\Cours\\GIT JAVA\\FXC jeu\\src\\main\\webapp\\images\\";

		// Création du format de la date pour le fichier, il sera donc renomer
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss_");
		String dateImg = dateFormat.format(new Date());

		java.io.File repository = new java.io.File(cheminImages);
		String nomImage = "Img_";
		DiskFileItemFactory factory = new DiskFileItemFactory();

		factory.setSizeThreshold(10);
		factory.setRepository(repository);
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setSizeMax(60000000);

		List<FileItem> items = null;

		try
		{
			items = (List<FileItem>) upload.parseRequest(request);
		}
		catch (FileUploadException e)
		{
			System.out.println("TeleversementServlet - 1er Try : " + e);
		}

		if (items != null)
		{
			System.out.println("TeleversementServlet - Liste Items non null");
			Iterator<FileItem> iter = (Iterator<FileItem>) items.iterator();
int i=0;
			while (iter.hasNext())
			{
				
				System.out.println("TeleversementServlet - Lecture Iterator");
				FileItem item = (FileItem) iter.next();

				if (item.isFormField())
				{
					System.out.println("TeleversementServlet - if item.isFormField");
					String nomChamp = item.getFieldName();
					String valeurChamp = item.getString();

					if (nomChamp.equals("NOM_IMAGE"))
					{
						System.out.println("TeleversementServlet - nomChamps=MON_IMAGE");
						nomImage = valeurChamp;
					}
				}
				else
				{
					i++;
					System.out.println("TeleversementServlet - else item.isFormField");
					String nomCompletImage = cheminImages + nomImage + dateImg+i + ".png";
					java.io.File fichierATeleverser = new java.io.File(nomCompletImage);

					try
					{
						item.write(fichierATeleverser);
					}
					catch (Exception e)
					{
						System.out.println("TeleversementServlet - Try Item.Write : " + e);
					}
				}

			} // End of while
			System.out.println("TeleversementServlet - Fin du while");
		}

	}

}
