package fr.cfai.sio.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import fr.cfai.sio.business.Classification;
import fr.cfai.sio.business.Developpeur;
import fr.cfai.sio.business.Editeur;
import fr.cfai.sio.business.Genre;
import fr.cfai.sio.business.Jeu;
import fr.cfai.sio.dao.ConnexionBDD;
import fr.cfai.sio.dao.JeuDao;
import fr.cfai.sio.dao.requete.JeuRequete;

public class JeuDaoImpl implements JeuDao
{
	private ConnexionBDD connexion;
	private Statement createObjReq;
	private Connection objConnect;

	public JeuDaoImpl() throws Exception
	{
		super();
		this.connexion = new ConnexionBDD();
		this.createObjReq = connexion.getStatement();
		this.objConnect = connexion.getConnection();
	}

	@Override
	public Jeu findJeuById(int idJeu)
	{
		int id_Jeu;
		String titre_Jeu;
		Date date_Sortie_Jeu;
		String description;
		String imgJeu;
		Classification classification;
		Editeur editeur;
		Genre genre;
		Developpeur developpeur;
		Jeu jeu = null;

		try
		{
			PreparedStatement resultatPrepa = objConnect.prepareStatement(JeuRequete.FIND_JEUX_BY_ID);
			resultatPrepa.setInt(1, idJeu);
			ResultSet resultat = resultatPrepa.executeQuery();

			if (resultat != null)
			{
				while (resultat.next())
				{
					id_Jeu = resultat.getInt(1);
					titre_Jeu = resultat.getString(2);
					date_Sortie_Jeu = resultat.getDate(3);
					description = resultat.getString(4);
					imgJeu = resultat.getString(9);
					classification = new Classification(resultat.getInt(10), resultat.getString(11));
					developpeur = new Developpeur(resultat.getInt(12), resultat.getString(13));
					editeur = new Editeur(resultat.getInt(14), resultat.getString(15));
					genre = new Genre(resultat.getInt(16), resultat.getString(17));

					jeu = new Jeu(id_Jeu, titre_Jeu, date_Sortie_Jeu, description, imgJeu, classification, editeur, genre, developpeur);
				}
			}
			else
			{
				jeu = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql" + e.getMessage());
		}
		return jeu;
	}

	@Override
	public List<Jeu> findAllJeux()
	{
		List<Jeu> listeJeux = new ArrayList<Jeu>();
		int id_Jeu;
		String titre_Jeu;
		Date date_Sortie_Jeu;
		String description;
		String imgJeu;
		Classification classification;
		Editeur editeur;
		Genre genre;
		Developpeur developpeur;
		Jeu jeu = null;

		try
		{
			ResultSet resultat = createObjReq.executeQuery(JeuRequete.FIND_ALL_JEUX);

			if (resultat != null)
			{
				while (resultat.next())
				{
					id_Jeu = resultat.getInt(1);
					titre_Jeu = resultat.getString(2);
					date_Sortie_Jeu = resultat.getDate(3);
					description = resultat.getString(4);
					imgJeu = resultat.getString(9);
					classification = new Classification(resultat.getInt(10), resultat.getString(11));
					developpeur = new Developpeur(resultat.getInt(12), resultat.getString(13));
					editeur = new Editeur(resultat.getInt(14), resultat.getString(15));
					genre = new Genre(resultat.getInt(16), resultat.getString(17));

					jeu = new Jeu(id_Jeu, titre_Jeu, date_Sortie_Jeu, description, imgJeu, classification, editeur, genre, developpeur);
					listeJeux.add(jeu);
				}
			}
			else
			{
				listeJeux = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql" + e.getMessage());
		}
		return listeJeux;
	}
}
