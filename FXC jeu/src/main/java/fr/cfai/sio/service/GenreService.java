package fr.cfai.sio.service;

import java.util.List;
import fr.cfai.sio.business.Genre;

public interface GenreService
{
	public Genre recupererGenreParID(int idGenre);

	public List<Genre> recupererListeGenres();
}
