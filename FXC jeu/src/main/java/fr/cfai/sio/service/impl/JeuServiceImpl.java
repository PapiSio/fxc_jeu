package fr.cfai.sio.service.impl;

import java.util.ArrayList;
import java.util.List;
import fr.cfai.sio.business.Jeu;
import fr.cfai.sio.dao.JeuDao;
import fr.cfai.sio.dao.impl.JeuDaoImpl;
import fr.cfai.sio.service.JeuService;

public class JeuServiceImpl implements JeuService
{

	private JeuDao jeuDaoImpl;

	public JeuServiceImpl() throws Exception
	{
		super();
		this.jeuDaoImpl = new JeuDaoImpl();
	}

	@Override
	public Jeu recupereJeuParID(int idJeu)
	{
		Jeu jeu = null;
		
		jeu=jeuDaoImpl.findJeuById(idJeu);
		
		return jeu;
	}

	@Override
	public List<Jeu> recupererListeJeux()
	{
		List<Jeu> listeJeux = new ArrayList<>();
		
		listeJeux = jeuDaoImpl.findAllJeux();

		return listeJeux;
	}

}
