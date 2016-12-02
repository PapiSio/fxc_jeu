package fr.cfai.sio.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import fr.cfai.sio.business.Utilisateur;
import fr.cfai.sio.dao.ConnexionBDD;
import fr.cfai.sio.dao.UtilisateurDao;
import fr.cfai.sio.dao.requete.UtilisateurRequete;

public class UtilisateurDaoImpl implements UtilisateurDao
{
	private ConnexionBDD connexion;
	private int statut = 0;
	private Statement createObjReq;
	private Connection objConnect;

	public UtilisateurDaoImpl() throws Exception
	{
		super();
		this.connexion = new ConnexionBDD();
		this.createObjReq = connexion.getStatement();
		this.objConnect = connexion.getConnection();
	}

	@Override
	public int addUtilisateur(String login, String mdp)
	{
		int idMax = 0;

		try
		{
			ResultSet resultat = createObjReq.executeQuery(UtilisateurRequete.ID_MAX_UTILISATEUR);

			if (resultat != null)
			{
				while (resultat.next())
				{
					idMax = resultat.getInt(1) + 1;
				}
			}
			else
			{
				idMax = 1;
			}

			PreparedStatement resultatAjout = objConnect.prepareStatement(UtilisateurRequete.AJOUT_UTILISATEUR);
			resultatAjout.setInt(1, idMax);
			resultatAjout.setString(2, login);
			resultatAjout.setString(3, mdp);
			statut = resultatAjout.executeUpdate();

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql" + e.getMessage());
		}
		return statut;
	}

	@Override
	public Utilisateur findUtilisateurById(int idUtilisateur)
	{
		String login;
		String mdp;
		Utilisateur utilisateur = null;

		try
		{
			PreparedStatement resultatPrepa = objConnect.prepareStatement(UtilisateurRequete.FIND_UTILISATEUR_BY_ID);
			resultatPrepa.setInt(1, idUtilisateur);
			ResultSet resultat = resultatPrepa.executeQuery();

			if (resultat != null)
			{
				while (resultat.next())
				{
					login = resultat.getString(1);
					mdp = resultat.getString(2);

					utilisateur = new Utilisateur(login, mdp);
				}
			}
			else
			{
				utilisateur = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql : " + e.getMessage());
		}
		return utilisateur;
	}

	@Override
	public List<Utilisateur> findAllUtilisateurs()
	{
		List<Utilisateur> listeUtilisateurs = new ArrayList<Utilisateur>();

		int idUtilisateur;
		String login;
		String mdp;
		int nbCom;
		Utilisateur utilisateur = null;

		try
		{
			ResultSet resultat = createObjReq.executeQuery(UtilisateurRequete.FIND_ALL_UTILISATEURS);

			if (resultat != null)
			{
				while (resultat.next())
				{
					idUtilisateur = resultat.getInt(1);
					login = resultat.getString(2);
					mdp = resultat.getString(3);
					nbCom = resultat.getInt(5);
					utilisateur = new Utilisateur(idUtilisateur, login, mdp, nbCom);
					listeUtilisateurs.add(utilisateur);
				}
			}
			else
			{
				listeUtilisateurs = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql" + e.getMessage());
		}
		return listeUtilisateurs;
	}
}
