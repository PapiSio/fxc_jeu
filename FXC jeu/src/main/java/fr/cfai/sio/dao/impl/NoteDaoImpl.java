package fr.cfai.sio.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import fr.cfai.sio.business.Note;
import fr.cfai.sio.dao.ConnexionBDD;
import fr.cfai.sio.dao.NoteDao;
import fr.cfai.sio.dao.requete.NoteRequete;

public class NoteDaoImpl implements NoteDao
{
	private ConnexionBDD connexion;
	private Statement createObjReq;
	private Connection objConnect;

	public NoteDaoImpl()
	{
		super();
		this.connexion = new ConnexionBDD();
		this.createObjReq = connexion.getStatement();
		this.objConnect = connexion.getConnection();
	}

	@Override
	public List<Note> findAllNotes()
	{
		List<Note> listeNotes = new ArrayList<>();

		int id_Note;
		short value_Note;
		Note note = null;

		try
		{
			ResultSet resultat = createObjReq.executeQuery(NoteRequete.FIND_ALL_NOTES);

			if (resultat != null)
			{
				while (resultat.next())
				{
					id_Note = resultat.getInt(1);
					value_Note = resultat.getShort(2);
					note = new Note(id_Note, value_Note);
					listeNotes.add(note);
				}
			}
			else
			{
				listeNotes = null;
			}

		}
		catch (SQLException e)
		{
			System.out.println("Erreur sql" + e.getMessage());
		}

		return listeNotes;
	}

	@Override
	public List<Note> findAllNotesByTest(int idTest)
	{
		List<Note> listeNotes = new ArrayList<>();
		int id_Note;
		short value_Note;
		Note note = null;

		try
		{
			PreparedStatement resultatPrepared = objConnect.prepareStatement(NoteRequete.FIND_ALL_NOTES_BY_TEST);
			resultatPrepared.setInt(1, idTest);
			resultatPrepared.executeQuery();
			try
			{
				ResultSet resultat = resultatPrepared.executeQuery();

				if (resultat != null)
				{
					System.out.println("NoteDaoImpl : Résultat NON null");
					
					while (resultat.next())
					{
						id_Note = resultat.getInt(1);
						value_Note = resultat.getShort(2);
						note = new Note(id_Note, value_Note);
						listeNotes.add(note);
					}
				}
				else
				{
					System.out.println("NoteDaoImpl : Résultat null");
					listeNotes = null;
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
		return listeNotes;
	}

}
