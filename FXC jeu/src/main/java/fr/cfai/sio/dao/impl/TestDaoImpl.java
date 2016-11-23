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
import fr.cfai.sio.business.Test;
import fr.cfai.sio.business.Utilisateur;
import fr.cfai.sio.dao.ConnexionBDD;
import fr.cfai.sio.dao.TestDao;
import fr.cfai.sio.dao.requete.TestRequete;

public class TestDaoImpl implements TestDao
{

	private ConnexionBDD connexion;
	private Statement createObjReq;
	private Connection objConnect;

	public TestDaoImpl() throws Exception
	{
		super();
		this.connexion = new ConnexionBDD();
		this.createObjReq = connexion.getStatement();
		this.objConnect = connexion.getConnection();
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
		Utilisateur user;
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
					jeu = new Jeu(resultat.getInt(8));
					user = new Utilisateur(resultat.getInt(9));
					noteJeu = resultat.getShort(10);

					test = new Test(id_Test, titreTest, dateTest, noteJeu, nbCom, avantageJeu, inconvenientJeu, descriptionTest, jeu, user);
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

		List<Test> listeTests = new ArrayList<Test>();
		int id_Test;
		String titreTest;
		Date dateTest;
		short noteJeu;
		int nbCom;
		String avantageJeu;
		String inconvenientJeu;
		String descriptionTest;
		Jeu jeu;
		Utilisateur user;
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
					nbCom = resultat.getInt(4);
					avantageJeu = resultat.getString(5);
					inconvenientJeu = resultat.getString(6);
					descriptionTest = resultat.getString(7);
					jeu = new Jeu(resultat.getInt(8));
					user = new Utilisateur(resultat.getInt(9));
					noteJeu = resultat.getShort(10);

					test = new Test(id_Test, titreTest, dateTest, noteJeu, nbCom, avantageJeu, inconvenientJeu, descriptionTest, jeu, user);
					listeTests.add(test);

				}
			}
			else
			{
				listeTests = null;
				System.out.println("dzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql" + e.getMessage());
		}
		return listeTests;
	}

	// Test MM
	@Override
	public List<Test> findAllTestMM()
	{
		List<Test> listeTestsMM = new ArrayList<Test>();
		int id_Test;
		String titreTest;
		Date dateTest;
		short noteJeu;
		int nbCom;
		String avantageJeu;
		String inconvenientJeu;
		String descriptionTest;
		Jeu jeu;
		Utilisateur user;
		int id_Jeu;
		String titre_Jeu;
		Date date_Sortie_Jeu;
		String description;
		String imgJeu;
		Classification classification;
		Editeur editeur;
		Genre genre;
		Developpeur developpeur;
		Test test = null;

		try
		{
			ResultSet resultat = createObjReq.executeQuery(TestRequete.FIND_ALL_TESTS_MM);

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
					noteJeu = resultat.getShort(10);
					id_Jeu = resultat.getInt(11);
					titre_Jeu = resultat.getString(12);
					date_Sortie_Jeu = resultat.getDate(13);
					description = resultat.getString(14);
					imgJeu = resultat.getString(19);
					classification = new Classification(resultat.getInt(20), resultat.getString(21));
					developpeur = new Developpeur(resultat.getInt(22), resultat.getString(23));
					editeur = new Editeur(resultat.getInt(24), resultat.getString(25));
					genre = new Genre(resultat.getInt(26), resultat.getString(27));
					jeu = new Jeu(id_Jeu, titre_Jeu, date_Sortie_Jeu, description, imgJeu, classification, editeur, genre, developpeur);
					user = new Utilisateur(1);

					test = new Test(id_Test, titreTest, dateTest, noteJeu, nbCom, avantageJeu, inconvenientJeu, descriptionTest, jeu, user);
					listeTestsMM.add(test);

				}
			}
			else
			{
				listeTestsMM = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql MM" + e.getMessage());
		}
		return listeTestsMM;
	}

	@Override
	public Test addTest() {
		// TODO Auto-generated method stub
		return null;
	}

}
