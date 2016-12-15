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

	private Connection connexion = ConnexionBDD.getConnection();

	public PlateformeDaoImpl()
	{
		super();
		// System.out.println("Constructeur PlateformeDaoImpl");
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
		List<Plateforme> listePlateformes = new ArrayList<>();
		int id_Plateforme;
		String libelle_Plateforme;
		Plateforme plateforme = null;

		try
		{
			Statement statement = connexion.createStatement();
			ResultSet resultat = statement.executeQuery(PlateformeRequete.FIND_ALL_PLATEFORMES);

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
		List<Plateforme> listePlateformes = new ArrayList<>();
		int id_Plateforme;
		String libelle_Plateforme;
		Plateforme plateforme = null;

		try
		{
			PreparedStatement preparedStatement = connexion.prepareStatement(PlateformeRequete.FIND_ALL_PLATEFORMES_BY_JEU);
			preparedStatement.setInt(1, idJeu);
			preparedStatement.executeQuery();
			try
			{
				ResultSet resultat = preparedStatement.executeQuery();

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
