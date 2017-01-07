package fr.cfai.sio.service.impl;

import java.util.List;
import fr.cfai.sio.business.Image;
import fr.cfai.sio.business.Utilisateur;
import fr.cfai.sio.dao.ImageDao;
import fr.cfai.sio.dao.impl.ImageDaoImpl;
import fr.cfai.sio.service.ImageService;

public class DaoServiceImpl implements ImageService
{

	private ImageDao imageDaoImpl;
	
	public DaoServiceImpl()
	{
		super();
		this.imageDaoImpl=new ImageDaoImpl();
	}

	@Override
	public int ajouterImage(String chemin, int idTest)
	{
		Image image = null;

		if (imageDaoImpl.addUtilisateur(login, mdp) != 0)
		{
			System.out.println("GG");
			image = new Utilisateur(login, mdp);
		}

		return utilisateur;
	}

	@Override
	public List<Image> recupererListeImages()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
