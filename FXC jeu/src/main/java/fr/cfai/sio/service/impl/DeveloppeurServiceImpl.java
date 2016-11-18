package fr.cfai.sio.service.impl;

import java.util.ArrayList;
import java.util.List;
import fr.cfai.sio.business.Developpeur;
import fr.cfai.sio.dao.DeveloppeurDao;
import fr.cfai.sio.dao.impl.DeveloppeurDaoImpl;
import fr.cfai.sio.service.DeveloppeurService;

public class DeveloppeurServiceImpl implements DeveloppeurService
{

	private DeveloppeurDao developpeurDaoImpl;
	
	public DeveloppeurServiceImpl() throws Exception
	{
		super();
		this.developpeurDaoImpl = new DeveloppeurDaoImpl();
	}

	@Override
	public Developpeur recupererDeveloppeurParID(int idDeveloppeur)
	{
		Developpeur developpeur;
		
		developpeur = developpeurDaoImpl.findDeveloppeurById(idDeveloppeur);
		
		return developpeur;
	}

	@Override
	public List<Developpeur> recupererListeDeveloppeurs()
	{
		List<Developpeur> listeDeveloppeurs = new ArrayList<Developpeur>();

		listeDeveloppeurs = developpeurDaoImpl.findAllDeveloppeurs();

		return listeDeveloppeurs;
	}

}
