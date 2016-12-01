package fr.cfai.sio.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import fr.cfai.sio.business.Classification;
import fr.cfai.sio.business.Developpeur;
import fr.cfai.sio.business.Editeur;
import fr.cfai.sio.business.Genre;
import fr.cfai.sio.business.Jeu;
import fr.cfai.sio.dao.ClassificationDao;
import fr.cfai.sio.dao.ConnexionBDD;
import fr.cfai.sio.dao.DeveloppeurDao;
import fr.cfai.sio.dao.EditeurDao;
import fr.cfai.sio.dao.GenreDao;
import fr.cfai.sio.dao.JeuDao;
import fr.cfai.sio.dao.requete.JeuRequete;

public class JeuDaoImpl implements JeuDao
{
	private ConnexionBDD connexion;
	private Statement createObjReq;
	private Connection objConnect;
	private List<Jeu> listeJeux;

	private ClassificationDao classificationDaoImpl;
	private List<Classification> listeClassifications;

	private DeveloppeurDao developpeurDaoImpl;
	private List<Developpeur> listeDeveloppeurs;

	private GenreDao genreDaoImpl;
	private List<Genre> listeGenres;

	private EditeurDao editeurDaoImpl;
	private List<Editeur> listeEditeurs;

	public JeuDaoImpl() throws Exception
	{
		super();
		this.connexion = new ConnexionBDD();
		this.createObjReq = connexion.getStatement();
		this.objConnect = connexion.getConnection();
		this.listeJeux = new ArrayList<>();

		this.classificationDaoImpl = new ClassificationDaoImpl();
		this.developpeurDaoImpl = new DeveloppeurDaoImpl();
		this.genreDaoImpl = new GenreDaoImpl();
		this.editeurDaoImpl = new EditeurDaoImpl();
	}

	@Override
	public Jeu findJeuById(int idJeu)
	{
		int id_Jeu;
		String titre_Jeu;
		Date date_Sortie_Jeu;
		String description;
		String imgJeu;
		Classification classification = null;
		Editeur editeur = null;
		Genre genre = null;
		Developpeur developpeur = null;
		Jeu jeu = null;

		try
		{
			PreparedStatement resultatPrepa = objConnect.prepareStatement(JeuRequete.FIND_JEUX_BY_ID);
			resultatPrepa.setInt(1, idJeu);
			ResultSet resultat = resultatPrepa.executeQuery();

			if (resultat != null)
			{
				while (resultat.next())
				{
					id_Jeu = resultat.getInt(1);
					titre_Jeu = resultat.getString(2);
					date_Sortie_Jeu = resultat.getDate(3);
					description = resultat.getString(4);
					imgJeu = resultat.getString(9);
					editeur = getEditeurByID(resultat.getInt(5));
					genre = getGenreByID(resultat.getInt(6));
					developpeur = getDeveloppeurByID(resultat.getInt(7));
					classification = getClassificationByID(resultat.getInt(8));

					jeu = new Jeu(id_Jeu, titre_Jeu, date_Sortie_Jeu, description, imgJeu, classification, editeur, genre, developpeur);
				}
			}
			else
			{
				jeu = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql : " + e.getMessage());
		}
		return jeu;
	}

	@Override
	public List<Jeu> findAllJeux()
	{
		int id_Jeu;
		String imgJeu;
		Jeu jeu = null;

		try
		{
			ResultSet resultat = createObjReq.executeQuery(JeuRequete.FIND_ALL_JEUX);

			if (resultat != null)
			{
				while (resultat.next())
				{
					id_Jeu = resultat.getInt(1);
					imgJeu = resultat.getString(2);

					jeu = new Jeu(id_Jeu, imgJeu);
					listeJeux.add(jeu);
				}
			}
			else
			{
				listeJeux = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql" + e.getMessage());
		}
		return listeJeux;
	}

	public Classification getClassificationByID(int id)
	{
		if (listeClassifications == null)
		{
			// System.out.println("jeuDAO - getClassi ==> Liste Null");
			listeClassifications = classificationDaoImpl.findAllClassifications();
		}

		for (Classification classification : listeClassifications)
		{
			// System.out.println("JeuServlet - getClassi : " +
			// classification.getLibelleClassification());
			if (classification.getIdClassification() == id)
			{
				return classification;
			}
		}
		return null;
	}

	public Developpeur getDeveloppeurByID(int id)
	{
		if (listeDeveloppeurs == null)
		{
			listeDeveloppeurs = developpeurDaoImpl.findAllDeveloppeurs();
		}

		for (Developpeur developpeur : listeDeveloppeurs)
		{
			// System.out.println("JeuServlet - getDeveloppeur : " +
			// developpeur.getRaisonSociale());
			if (developpeur.getIdDeveloppeur() == id)
			{
				return developpeur;
			}
		}
		return null;
	}

	public Genre getGenreByID(int id)
	{
		if (listeGenres == null)
		{
			listeGenres = genreDaoImpl.findAllGenres();
		}

		for (Genre genre : listeGenres)
		{
			// System.out.println("JeuServlet - getGenre : " +
			// genre.getLibelleGenre());
			if (genre.getIdGenre() == id)
			{
				return genre;
			}
		}
		return null;
	}

	public Editeur getEditeurByID(int id)
	{
		if (listeEditeurs == null)
		{
			listeEditeurs = editeurDaoImpl.findAllEditeurs();
		}

		for (Editeur editeur : listeEditeurs)
		{
			// System.out.println("JeuServlet - getEditeur : " +
			// editeur.getRaisonSociale());

			if (editeur.getIdEditeur() == id)
			{
				return editeur;
			}
		}
		return null;
	}
}
