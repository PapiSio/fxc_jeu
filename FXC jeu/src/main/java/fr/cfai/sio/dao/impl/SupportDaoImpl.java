package fr.cfai.sio.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import fr.cfai.sio.business.Support;
import fr.cfai.sio.dao.ConnexionBDD;
import fr.cfai.sio.dao.SupportDao;
import fr.cfai.sio.dao.requete.SupportRequete;

public class SupportDaoImpl implements SupportDao
{

	private ConnexionBDD connexion;
	private Statement createObjReq;
	private Connection objConnect;
	// private int statut = 0;

	public SupportDaoImpl()
	{
		super();
		this.connexion = new ConnexionBDD();
		this.createObjReq = connexion.getStatement();
		this.objConnect = connexion.getConnection();
	}

	@Override

	public List<Support> findAllSupports()
	{

		List<Support> listeSupports = new ArrayList<Support>();
		int id_support;
		String libelle_support;
		Support support = null;

		try
		{
			ResultSet resultat = createObjReq.executeQuery(SupportRequete.FIND_ALL_SUPPORTS);

			if (resultat != null)
			{
				while (resultat.next())
				{
					id_support = resultat.getInt(1);
					libelle_support = resultat.getString(2);
					support = new Support(id_support, libelle_support);
					listeSupports.add(support);
				}
			}
			else
			{
				listeSupports = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql" + e.getMessage());
		}
		return listeSupports;
	}

	@Override
	public Support findSupportById(int idSupport)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Support> findAllSupportsByJeu(int idJeu)
	{
		List<Support> listeSupports = new ArrayList<Support>();
		int id_support;
		String libelle_support;
		Support support = null;

		try
		{
			PreparedStatement resultatPrepared = objConnect.prepareStatement(SupportRequete.FIND_ALL_SUPPORTS_BY_JEU);
			resultatPrepared.setInt(1, idJeu);
			resultatPrepared.executeQuery();
			try
			{
				ResultSet resultat = resultatPrepared.executeQuery();

				if (resultat != null)
				{
					while (resultat.next())
					{
						id_support = resultat.getInt(1);
						libelle_support = resultat.getString(2);
						support = new Support(id_support, libelle_support);
						listeSupports.add(support);
					}
				}
				else
				{
					listeSupports = null;
				}

			}
			catch (SQLException e)
			{
				System.out.println("Erreur sql" + e.getMessage());
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql" + e.getMessage());
		}
		return listeSupports;
	}
}
