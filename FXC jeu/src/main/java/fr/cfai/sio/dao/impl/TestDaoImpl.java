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
import fr.cfai.sio.business.Test;
import fr.cfai.sio.business.Utilisateur;
import fr.cfai.sio.dao.ConnexionBDD;
import fr.cfai.sio.dao.JeuDao;
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

	public TestDaoImpl() throws Exception
	{
		super();
		this.connexion = new ConnexionBDD();
		this.createObjReq = connexion.getStatement();
		this.objConnect = connexion.getConnection();
		this.listeTests = new ArrayList<>();
		this.jeuDaoImpl = new JeuDaoImpl();
		this.utilisateurDaoImpl = new UtilisateurDaoImpl();
	}

	@Override
	public Test findTestById(int idTest)
	{

		int id_Test;
		String titreTest;
		Date dateTest;
		short noteJeu;
		int nbCom;
		String avantageJeu;
		String inconvenientJeu;
		String descriptionTest;
		Jeu jeu;
		Utilisateur utilisateur;
		Test test = null;

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
					nbCom = resultat.getInt(4);
					avantageJeu = resultat.getString(5);
					inconvenientJeu = resultat.getString(6);
					descriptionTest = resultat.getString(7);
					jeu = getJeuByID(resultat.getInt(8));
					utilisateur = getUtilisateurByID(resultat.getInt(9));
					noteJeu = resultat.getShort(10);

					test = new Test(id_Test, titreTest, dateTest, noteJeu, nbCom, avantageJeu, inconvenientJeu, descriptionTest, jeu, utilisateur);
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
		String descriptionTest;
		int nb_Com;
		short note_Jeu;
		Utilisateur utilisateur;
		Test test = null;

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
					descriptionTest = resultat.getString(4);
					nb_Com=resultat.getInt(5);
					note_Jeu=resultat.getShort(6);
					utilisateur = getUtilisateurByID(resultat.getInt(7));
					

					test = new Test(id_Test, titreTest, dateTest, descriptionTest,nb_Com,note_Jeu,utilisateur);
					
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
