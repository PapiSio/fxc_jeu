package fr.cfai.sio.service.impl;

import java.util.ArrayList;
import java.util.List;
import fr.cfai.sio.business.Genre;
import fr.cfai.sio.dao.GenreDao;
import fr.cfai.sio.dao.impl.GenreDaoImpl;
import fr.cfai.sio.service.GenreService;

public class GenreServiceImpl implements GenreService
{

	private GenreDao genreDaoImpl;

	public GenreServiceImpl() throws Exception
	{
		super();
		this.genreDaoImpl = new GenreDaoImpl();
	}

	@Override
	public Genre recupererGenreParID(int idGenre)
	{
		Genre genre;

		genre = genreDaoImpl.findGenreById(idGenre);

		return genre;
	}

	@Override
	public List<Genre> recupererListeGenres()
	{
		List<Genre> listeGenres = new ArrayList<Genre>();

		listeGenres = genreDaoImpl.findAllGenres();

		return listeGenres;
	}

}
