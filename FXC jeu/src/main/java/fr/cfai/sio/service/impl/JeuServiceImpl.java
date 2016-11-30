package fr.cfai.sio.service.impl;

import java.util.ArrayList;
import java.util.List;
import fr.cfai.sio.business.Classification;
import fr.cfai.sio.business.Developpeur;
import fr.cfai.sio.business.Editeur;
import fr.cfai.sio.business.Genre;
import fr.cfai.sio.business.Jeu;
import fr.cfai.sio.dao.JeuDao;
import fr.cfai.sio.dao.impl.JeuDaoImpl;
import fr.cfai.sio.service.ClassificationService;
import fr.cfai.sio.service.DeveloppeurService;
import fr.cfai.sio.service.EditeurService;
import fr.cfai.sio.service.GenreService;
import fr.cfai.sio.service.JeuService;

public class JeuServiceImpl implements JeuService
{

	private JeuDao jeuDaoImpl;
	private ClassificationService classificationServiceImpl;
	private DeveloppeurService developpeurServiceImpl;
	private EditeurService editeurServiceImpl;
	private GenreService genreServiceImpl;

	private List<Jeu> listeJeux;

	public JeuServiceImpl() throws Exception
	{
		super();
		this.jeuDaoImpl = new JeuDaoImpl();
		this.classificationServiceImpl = new ClassificationServiceImpl();
		this.developpeurServiceImpl = new DeveloppeurServiceImpl();
		this.editeurServiceImpl = new EditeurServiceImpl();
		this.genreServiceImpl = new GenreServiceImpl();
	}

	@Override
	public Jeu recupereJeuParID(int idJeu)
	{
		Jeu jeu = null;

		jeu = jeuDaoImpl.findJeuById(idJeu);

		return jeu;
	}

	@Override
	public List<Jeu> recupererListeJeux()
	{

		if (listeJeux == null)
		{
			List<Classification> listeClassifications = new ArrayList<>();
			listeClassifications = classificationServiceImpl.recupererListeClassifications();

			List<Developpeur> listeDeveloppeurs = new ArrayList<>();
			listeDeveloppeurs = developpeurServiceImpl.recupererListeDeveloppeurs();

			List<Editeur> listeEditeurs = new ArrayList<>();
			listeEditeurs = editeurServiceImpl.recupererListeEditeurs();

			List<Genre> listeGenres = new ArrayList<>();
			listeGenres = genreServiceImpl.recupererListeGenres();

			System.out.println("ServiceJEU : Passe par le if, liste null");
			listeJeux = jeuDaoImpl.findAllJeux(listeClassifications, listeDeveloppeurs, listeEditeurs, listeGenres);
			return listeJeux;
		}
		else
		{
			System.out.println("ServiceJEU : Passe par le else, liste not null");
			return listeJeux;
		}
	}
}
