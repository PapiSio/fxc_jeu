package fr.cfai.sio.service.impl;

import java.util.ArrayList;
import java.util.List;
import fr.cfai.sio.business.Editeur;
import fr.cfai.sio.dao.EditeurDao;
import fr.cfai.sio.dao.impl.EditeurDaoImpl;
import fr.cfai.sio.service.EditeurService;

public class EditeurServiceImpl implements EditeurService
{

	private EditeurDao editeurDaoImpl;

	public EditeurServiceImpl() throws Exception
	{
		super();
		this.editeurDaoImpl = new EditeurDaoImpl();
	}

	@Override
	public Editeur recupereEditeurParID(int idEditeur)
	{
		Editeur editeur;

		editeur = editeurDaoImpl.findEditeurById(idEditeur);

		return editeur;
	}

	public List<Editeur> recupererListeEditeurs()
	{
		List<Editeur> listeEditeurs = new ArrayList<Editeur>();

		listeEditeurs = editeurDaoImpl.findAllEditeurs();

		return listeEditeurs;
	}

}
