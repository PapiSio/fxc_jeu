package fr.cfai.sio.dao;

import java.util.List;
import fr.cfai.sio.business.Genre;

public interface GenreDao
{

	public Genre findGenreById(int idGenre);

	public List<Genre> findAllGenres();

}
