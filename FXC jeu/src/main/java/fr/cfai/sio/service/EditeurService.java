package fr.cfai.sio.service;

import java.util.List;
import fr.cfai.sio.business.Editeur;

public interface EditeurService
{
	public Editeur recupereEditeurParID(int idEditeur);

	public List<Editeur> recupererListeEditeurs();
}
