package fr.cfai.sio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnexionBDD
{

	private static final String url = "jdbc:postgresql://localhost:5432/app_jeu";
	private static final String utilisateur = "postgres";
	private static final String motDePasse = "postgres";

	public Statement getStatement()
	{
		Connection connexion = null;
		Statement statement = null;

		try
		{
			Class.forName("org.postgresql.Driver");
			connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
			statement = connexion.createStatement();
		}
		catch (SQLException | ClassNotFoundException e)
		{
			System.out.println("Erreur");
		}

		return statement;

	}

	public Connection getConnection()
	{
		Connection connexion = null;

		try
		{
			Class.forName("org.postgresql.Driver");
			connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
		}
		catch (SQLException | ClassNotFoundException e)
		{
			System.out.println("Erreur");
		}

		return connexion;

	}
}
