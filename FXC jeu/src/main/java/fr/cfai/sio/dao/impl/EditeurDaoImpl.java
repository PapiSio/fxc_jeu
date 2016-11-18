package fr.cfai.sio.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import fr.cfai.sio.business.Editeur;
import fr.cfai.sio.dao.ConnexionBDD;
import fr.cfai.sio.dao.EditeurDao;
import fr.cfai.sio.dao.requete.GenreRequete;

public class EditeurDaoImpl implements EditeurDao
{

	private ConnexionBDD connexion;
	private Statement createObjReq;
	// private Connection objConnect;
	// private int statut = 0;

	public EditeurDaoImpl()
	{
		this.connexion = new ConnexionBDD();
		this.createObjReq = connexion.getStatement();
		// this.objConnect = connexion.getConnection();
	}

	@Override
	public Editeur findEditeurById(int idEditeur)
	{
		// TODO Auto-generated method stub
		return null;

	}

	@Override
	public List<Editeur> findAllEditeurs()
	{
		List<Editeur> listeEditeurs = new ArrayList<Editeur>();
		int id_editeur;
		String libelle_editeur;
		Editeur editeur = null;

		try
		{
			ResultSet resultat = createObjReq.executeQuery(GenreRequete.FIND_ALL_GENRES);

			if (resultat != null)
			{
				while (resultat.next())
				{
					id_editeur = resultat.getInt(1);
					libelle_editeur = resultat.getString(2);
					editeur = new Editeur(id_editeur, libelle_editeur);
					listeEditeurs.add(editeur);
				}
			}
			else
			{
				listeEditeurs = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql" + e.getMessage());
		}
		return listeEditeurs;
	}

}
