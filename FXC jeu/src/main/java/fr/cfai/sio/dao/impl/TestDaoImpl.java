package fr.cfai.sio.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import fr.cfai.sio.business.Jeu;
import fr.cfai.sio.business.Note;
import fr.cfai.sio.business.Test;
import fr.cfai.sio.business.Utilisateur;
import fr.cfai.sio.dao.ConnexionBDD;
import fr.cfai.sio.dao.JeuDao;
import fr.cfai.sio.dao.NoteDao;
import fr.cfai.sio.dao.TestDao;
import fr.cfai.sio.dao.UtilisateurDao;
import fr.cfai.sio.dao.requete.TestRequete;

public class TestDaoImpl implements TestDao
{

	private ConnexionBDD connexion;
	private Statement createObjReq;
	private Connection objConnect;
	private List<Test> listeTests;

	private JeuDao jeuDaoImpl;
	private UtilisateurDao utilisateurDaoImpl;
	private NoteDao noteDaoImpl;
	// private CommentaireDao commentaireDaoImpl;

	public TestDaoImpl() throws Exception
	{
		super();
		this.connexion = new ConnexionBDD();
		this.createObjReq = connexion.getStatement();
		this.objConnect = connexion.getConnection();
		this.listeTests = new ArrayList<>();
		this.jeuDaoImpl = new JeuDaoImpl();
		this.utilisateurDaoImpl = new UtilisateurDaoImpl();
		this.noteDaoImpl = new NoteDaoImpl();
		// this.commentaireDaoImpl = new CommentaireDaoImpl();
	}

	@Override
	public Test findTestById(int idTest)
	{

		int id_Test;
		String titreTest;
		Date dateTest;
		short noteJeu;
		String avantageJeu;
		String inconvenientJeu;
		String descriptionTest;
		String contenuTest;
		String imgTest;
		Jeu jeu;
		Utilisateur utilisateur;
		Test test = null;
		List<Note> listeNotes = new ArrayList<>();
		// List<Commentaire> listeCommentaires = new ArrayList<>();

		try
		{
			PreparedStatement resultatPrepa = objConnect.prepareStatement(TestRequete.FIND_TEST_BY_ID);
			resultatPrepa.setInt(1, idTest);
			ResultSet resultat = resultatPrepa.executeQuery();

			if (resultat != null)
			{
				while (resultat.next())
				{
					id_Test = resultat.getInt(1);
					titreTest = resultat.getString(2);
					dateTest = resultat.getDate(3);
					avantageJeu = resultat.getString(4);
					inconvenientJeu = resultat.getString(5);
					descriptionTest = resultat.getString(6);
					jeu = getJeuByID(resultat.getInt(7));
					utilisateur = getUtilisateurByID(resultat.getInt(8));
					noteJeu = resultat.getShort(9);
					contenuTest = resultat.getString(10);
					imgTest = resultat.getString(11);

					test = new Test(id_Test, titreTest, dateTest, noteJeu, avantageJeu, inconvenientJeu, descriptionTest, contenuTest, imgTest, jeu,
							utilisateur);

					listeNotes = noteDaoImpl.findAllNotesByTest(id_Test);
					test.setListeNotes(listeNotes);

				}
			}
			else
			{
				test = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql : " + e.getMessage());
		}
		return test;
	}

	@Override
	public List<Test> findAllTest()
	{

		int id_Test;
		String titreTest;
		Date dateTest;
		short noteJeu;
		String avantageJeu;
		String inconvenientJeu;
		String descriptionTest;
		String contenuTest;
		String imgTest;
		Jeu jeu;
		Utilisateur utilisateur;
		Test test = null;

		// List<Commentaire> listeCommentaires = new ArrayList<>();

		try
		{
			ResultSet resultat = createObjReq.executeQuery(TestRequete.FIND_ALL_TESTS);

			if (resultat != null)
			{
				while (resultat.next())
				{
					id_Test = resultat.getInt(1);
					titreTest = resultat.getString(2);
					dateTest = resultat.getDate(3);
					avantageJeu = resultat.getString(4);
					inconvenientJeu = resultat.getString(5);
					descriptionTest = resultat.getString(6);
					jeu = getJeuByID(resultat.getInt(7));
					utilisateur = getUtilisateurByID(resultat.getInt(8));
					noteJeu = resultat.getShort(9);
					contenuTest = resultat.getString(10);
					imgTest = resultat.getString(11);

					test = new Test(id_Test, titreTest, dateTest, noteJeu, avantageJeu, inconvenientJeu, descriptionTest, contenuTest, imgTest, jeu,
							utilisateur);

					List<Note> listeNotes = new ArrayList<>();
					listeNotes = noteDaoImpl.findAllNotesByTest(id_Test);

					test.setListeNotes(listeNotes);
					System.out.println("TestDaoImpl - Pour le test = " + id_Test);
					for (Note note : test.getListeNotes())
					{
						System.out.println("Note = " + note.getNote());
					}

					listeTests.add(test);

				}
			}
			else
			{
				listeTests = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql" + e.getMessage());
		}
		return listeTests;
	}

	@Override
	public List<Test> findAllTestByJeu(int idJeu)
	{
		int id_Test;
		String titreTest;
		Date dateTest;
		short noteJeu;
		String avantageJeu;
		String inconvenientJeu;
		String descriptionTest;
		String contenuTest;
		String imgTest;
		Jeu jeu;
		Utilisateur utilisateur;
		Test test = null;
		List<Test> listeTests = new ArrayList<>();
		List<Note> listeNotes = new ArrayList<>();
		// List<Commentaire> listeCommentaires = new ArrayList<>();

		try
		{
			PreparedStatement resultatPrepa = objConnect.prepareStatement(TestRequete.FIND_ALL_TESTS_BY_JEU);
			resultatPrepa.setInt(1, idJeu);
			ResultSet resultat = resultatPrepa.executeQuery();

			if (resultat != null)
			{
				while (resultat.next())
				{
					id_Test = resultat.getInt(1);
					titreTest = resultat.getString(2);
					dateTest = resultat.getDate(3);
					avantageJeu = resultat.getString(4);
					inconvenientJeu = resultat.getString(5);
					descriptionTest = resultat.getString(6);
					jeu = getJeuByID(resultat.getInt(7));
					utilisateur = getUtilisateurByID(resultat.getInt(8));
					noteJeu = resultat.getShort(9);
					contenuTest = resultat.getString(10);
					imgTest = resultat.getString(11);

					test = new Test(id_Test, titreTest, dateTest, noteJeu, avantageJeu, inconvenientJeu, descriptionTest, contenuTest, imgTest, jeu,
							utilisateur);

					listeNotes = noteDaoImpl.findAllNotesByTest(id_Test);
					test.setListeNotes(listeNotes);

					// listeCommentaires =
					// commentaireDaoImpl.findCommentaireByTest(id_Test);
					// test.setListeCommentaires(listeCommentaires);

					listeTests.add(test);
				}
			}
			else
			{
				listeTests = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql : " + e.getMessage());
		}
		return listeTests;
	}

	@Override
	public Test addTest(String titre, Date date, int nb_Com, String avantage, String inconvenient, String description, short note, int id_Jeu,
			int id_Utilisateur)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Jeu getJeuByID(int id)
	{
		Jeu jeu = null;

		jeu = jeuDaoImpl.findJeuById(id);

		return jeu;
	}

	public Utilisateur getUtilisateurByID(int id)
	{
		Utilisateur utilisateur = null;

		utilisateur = utilisateurDaoImpl.findUtilisateurById(id);

		return utilisateur;
	}

}
