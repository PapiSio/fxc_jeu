package fr.cfai.sio.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import fr.cfai.sio.business.Commentaire;
import fr.cfai.sio.business.Test;
import fr.cfai.sio.business.Utilisateur;
import fr.cfai.sio.dao.CommentaireDao;
import fr.cfai.sio.dao.ConnexionBDD;
import fr.cfai.sio.dao.TestDao;
import fr.cfai.sio.dao.UtilisateurDao;
import fr.cfai.sio.dao.requete.CommentaireRequete;

public class CommentaireDaoImpl implements CommentaireDao {
	

	private ConnexionBDD connexion;
	private Statement createObjReq;
	private Connection objConnect;
	private List<Commentaire> listeCommentaire;	
	private UtilisateurDao utilisateurDaoImpl;
	private List<Utilisateur> listeUtilisateur;
	private List<Test> listeTest;
	private Commentaire commentaire;
	private TestDao testDaoImpl;

	
	public CommentaireDaoImpl() throws Exception {
		super();
		this.connexion = new ConnexionBDD();
		this.createObjReq = connexion.getStatement();
		this.objConnect = connexion.getConnection();
		this.listeCommentaire = new ArrayList<>();
		this.utilisateurDaoImpl = new UtilisateurDaoImpl();
		this.testDaoImpl = new TestDaoImpl();
	}
	
	
	
	@Override
	public Commentaire findCommentaireById(int idCommentaire) {
		// TODO Auto-generated method stub
		int id_Commentaire;
		String contenu_Com;
		Date date_Commentaire;
		Test test = null;
		Utilisateur utilisateur = null;
		Commentaire commentaireFK=null;
		
		try
		{
			PreparedStatement resultatPrepa = objConnect.prepareStatement(CommentaireRequete.FIND_COMMENTAIRE_BY_ID);
			resultatPrepa.setInt(1, idCommentaire);
			ResultSet resultat = resultatPrepa.executeQuery();

			if (resultat != null)
			{
				while (resultat.next())
				{
					id_Commentaire = resultat.getInt(1);
					contenu_Com = resultat.getString(2);
					date_Commentaire = resultat.getDate(4);
					test = getTestByID(resultat.getInt(5));
					utilisateur = getUtilisateurByID(resultat.getInt(6));

					commentaire = new Commentaire(id_Commentaire, contenu_Com,date_Commentaire, test, utilisateur);
				}
			}
			else
			{
				commentaire = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql : " + e.getMessage());
		}
		return commentaire;
		
	}

	@Override
	public List<Commentaire> findAllCommentaire() {
		// TODO Auto-generated method stub
		int id_Commentaire;
		Commentaire commentaire = null;

		try
		{
			ResultSet resultat = createObjReq.executeQuery(CommentaireRequete.FIND_ALL_COMMENTAIRE);

			if (resultat != null)
			{
				while (resultat.next())
				{
					id_Commentaire = resultat.getInt(1);

					commentaire = new Commentaire(id_Commentaire);
					listeCommentaire.add(commentaire);
				}
			}
			else
			{
				listeCommentaire = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql" + e.getMessage());
		}
		return listeCommentaire;
	}
	
	
	public Utilisateur getUtilisateurByID(int id)
	{
		if (listeUtilisateur == null)
		{
			listeUtilisateur = utilisateurDaoImpl.findAllUtilisateurs();
		}

		for (Utilisateur utilisateur : listeUtilisateur)
		{
			// System.out.println("JeuServlet - getGenre : " +
			// genre.getLibelleGenre());
			if (utilisateur.getIdUtilisateur() == id)
			{
				return utilisateur;
			}
		}
		return null;
	}
	
	
	public Test getTestByID(int id)
	{
		if (listeTest == null)
		{
			listeTest = testDaoImpl.findAllTest();
		}

		for (Test test : listeTest)
		{
			// System.out.println("JeuServlet - getEditeur : " +
			// editeur.getRaisonSociale());

			if (test.getIdTest() == id)
			{
				return test;
			}
		}
		return null;
	}



	@Override
	public Commentaire findCommentaireByTest(int idTest) {
		
		int id_Commentaire;
		String contenu_Com;
		Date date_Commentaire;
		Test test = null;
		Utilisateur utilisateur = null;
		try
		{
			PreparedStatement resultatPrepa = objConnect.prepareStatement(CommentaireRequete.FIND_COMMENTAIRE_BY_TEST);
			resultatPrepa.setInt(1, idTest);
			ResultSet resultat = resultatPrepa.executeQuery();

			if (resultat != null)
			{
				while (resultat.next())
				{
					id_Commentaire = resultat.getInt(1);
					contenu_Com = resultat.getString(2);
					date_Commentaire = resultat.getDate(4);
					test = getTestByID(resultat.getInt(5));
					utilisateur = getUtilisateurByID(resultat.getInt(6));

					commentaire = new Commentaire(id_Commentaire, contenu_Com,date_Commentaire, test, utilisateur);
				}
			}
			else
			{
				commentaire = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql : " + e.getMessage());
		}
		return commentaire;
		
	}
	

		
		

}
