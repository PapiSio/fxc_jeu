package fr.cfai.sio.dao.impl;

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
import fr.cfai.sio.dao.TestDao;
import fr.cfai.sio.dao.requete.TestRequete;
import java.sql.Connection;


public class TestDaoImpl implements TestDao {
	
	
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
	public Test findTestById(int idTest) {

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
					dateTest= resultat.getDate(3);
					nbCom = resultat.getInt(4);
					avantageJeu = resultat.getString(5);
					inconvenientJeu = resultat.getString(6);
					descriptionTest = resultat.getString(7);
					jeu = new Jeu(resultat.getInt(8));
					user = new Utilisateur(resultat.getInt(9));
					noteJeu = resultat.getShort(10);

					test = new Test( id_Test, titreTest, dateTest, noteJeu, nbCom, avantageJeu, inconvenientJeu, descriptionTest, jeu, user);
					System.out.println("LOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOL");
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
	public List<Test> findAllTest() {
		
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
					dateTest= resultat.getDate(3);
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

}
