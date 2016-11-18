package fr.cfai.sio.dao;

import java.util.List;
import fr.cfai.sio.business.Editeur;

public interface EditeurDao
{

	public Editeur findEditeurById(int idEditeur);

	public List<Editeur> findAllEditeurs();

}
