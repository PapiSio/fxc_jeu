package fr.cfai.sio.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import fr.cfai.sio.business.Plateforme;
import fr.cfai.sio.dao.ConnexionBDD;
import fr.cfai.sio.dao.PlateformeDao;
import fr.cfai.sio.dao.requete.PlateformeRequete;

public class PlateformeDaoImpl implements PlateformeDao
{

	private ConnexionBDD connexion;
	private Statement createObjReq;
	private Connection objConnect;
	// private int statut = 0;

	public PlateformeDaoImpl()
	{
		super();
		this.connexion = new ConnexionBDD();
		this.createObjReq = connexion.getStatement();
		this.objConnect = connexion.getConnection();
	}

	@Override
	public Plateforme findPlateformeById(int idPlateforme)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Plateforme> findAllPlateformes()
	{
		List<Plateforme> listePlateformes = new ArrayList<Plateforme>();
		int id_Plateforme;
		String libelle_Plateforme;
		Plateforme plateforme = null;

		try
		{
			ResultSet resultat = createObjReq.executeQuery(PlateformeRequete.FIND_ALL_PLATEFORMES);

			if (resultat != null)
			{
				while (resultat.next())
				{
					id_Plateforme = resultat.getInt(1);
					libelle_Plateforme = resultat.getString(2);
					plateforme = new Plateforme(id_Plateforme, libelle_Plateforme);
					listePlateformes.add(plateforme);
				}
			}
			else
			{
				listePlateformes = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql" + e.getMessage());
		}
		return listePlateformes;
	}

	@Override
	public List<Plateforme> findAllPlateformesByJeu(int idJeu)
	{
		List<Plateforme> listePlateformes = new ArrayList<Plateforme>();
		int id_Plateforme;
		String libelle_Plateforme;
		Plateforme plateforme = null;

		try
		{
			PreparedStatement resultatPrepared = objConnect.prepareStatement(PlateformeRequete.FIND_ALL_PLATEFORMES_BY_JEU);
			resultatPrepared.setInt(1, idJeu);
			resultatPrepared.executeQuery();
			try
			{
				ResultSet resultat = resultatPrepared.executeQuery();

				if (resultat != null)
				{
					while (resultat.next())
					{
						id_Plateforme = resultat.getInt(1);
						libelle_Plateforme = resultat.getString(2);
						plateforme = new Plateforme(id_Plateforme, libelle_Plateforme);
						listePlateformes.add(plateforme);
					}
				}
				else
				{
					listePlateformes = null;
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
		return listePlateformes;
	}

}
