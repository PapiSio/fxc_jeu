package fr.cfai.sio.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import fr.cfai.sio.dao.requete.JeuRequete;
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
		byte noteJeu;
		int nbCom;
		String avantageJeu;
		String inconvenientJeu;
		Jeu jeu;
		Utilisateur user;
		Test test = null;

		try
		{
			// TODO VMELE : faire la requête

			PreparedStatement resultatPrepa = objConnect.prepareStatement(JeuRequete.FIND_TEST_BY_ID);
			resultatPrepa.setInt(1, idTest);
			ResultSet resultat = resultatPrepa.executeQuery();

			if (resultat != null)
			{
				while (resultat.next())
				{
					id_Test = resultat.getInt(1);
					titreTest = resultat.getString(2);
					dateTest= resultat.getDate(3);
					noteJeu = resultat.getByte(4);
					nbCom = resultat.getInt(5);
					avantageJeu = resultat.getString(6);
					inconvenientJeu = resultat.getString(7);
					classification = new Classification(resultat.getInt(10), resultat.getString(11));
					developpeur = new Developpeur(resultat.getInt(12), resultat.getString(13));
					editeur = new Editeur(resultat.getInt(14), resultat.getString(15));
					genre = new Genre(resultat.getInt(16), resultat.getString(17));

					jeu = new Jeu(id_Jeu, titre_Jeu, date_Sortie_Jeu, description, imgJeu, classification, editeur, genre, developpeur);
				}
			}
			else
			{
				test = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql" + e.getMessage());
		}
		return test;
	}

	@Override
	public List<Test> findAllTest() {
		// TODO Auto-generated method stub
		return null;
	}

}
