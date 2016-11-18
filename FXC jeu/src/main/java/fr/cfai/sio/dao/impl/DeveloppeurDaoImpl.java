package fr.cfai.sio.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import fr.cfai.sio.business.Developpeur;
import fr.cfai.sio.dao.ConnexionBDD;
import fr.cfai.sio.dao.DeveloppeurDao;
import fr.cfai.sio.dao.requete.DeveloppeurRequete;

public class DeveloppeurDaoImpl implements DeveloppeurDao
{

	private ConnexionBDD connexion;
	private Statement createObjReq;
	// private Connection objConnect;
	// private int statut = 0;

	public DeveloppeurDaoImpl()
	{
		super();
		this.connexion = new ConnexionBDD();
		this.createObjReq = connexion.getStatement();
		// this.objConnect = connexion.getConnection();
	}

	@Override

	public List<Developpeur> findAllDeveloppeurs()
	{
		List<Developpeur> listeDeveloppeurs = new ArrayList<Developpeur>();
		int id_developpeur;
		String libelle_developpeur;
		Developpeur developpeur = null;

		try
		{
			ResultSet resultat = createObjReq.executeQuery(DeveloppeurRequete.FIND_ALL_DEVELOPPEURS);

			if (resultat != null)
			{
				while (resultat.next())
				{
					id_developpeur = resultat.getInt(1);
					libelle_developpeur = resultat.getString(2);
					developpeur = new Developpeur(id_developpeur, libelle_developpeur);
					listeDeveloppeurs.add(developpeur);
				}
			}
			else
			{
				listeDeveloppeurs = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql" + e.getMessage());
		}
		return listeDeveloppeurs;
	}

	public Developpeur findDeveloppeurById(int idDeveloppeur)
	{
		return null;
	}

}
