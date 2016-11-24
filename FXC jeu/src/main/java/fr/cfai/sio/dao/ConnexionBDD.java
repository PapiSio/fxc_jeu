package fr.cfai.sio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Commentaire OK
 * 
 * Renommage des constantes ==> En MAJUSCULE
 * 
 * @author mathieu
 *
 */
public class ConnexionBDD
{

	/**
	 * Déclaration des constantes de ConnexionBDD
	 */
	private static final String URL = "jdbc:postgresql://localhost:5432/app_jeu";
	private static final String UTILISATEUR = "postgres";
	private static final String MOT_DE_PASSE = "postgres";

	/**
	 * Méthode qui initialise le 'statement' de la connexion
	 * 
	 * @return Statement
	 */
	public Statement getStatement()
	{
		Connection connexion = null;
		Statement statement = null;

		try
		{
			Class.forName("org.postgresql.Driver");
			connexion = DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE);
			statement = connexion.createStatement();
		}
		catch (SQLException | ClassNotFoundException e)
		{
			System.out.println("Erreur");
		}
		return statement;
	}

	/**
	 * Méthode qui initialise la connexion
	 * 
	 * @return Connection
	 */
	public Connection getConnection()
	{
		Connection connexion = null;

		try
		{
			Class.forName("org.postgresql.Driver");
			connexion = DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE);
		}
		catch (SQLException | ClassNotFoundException e)
		{
			System.out.println("Erreur");
		}
		return connexion;
	}
}
