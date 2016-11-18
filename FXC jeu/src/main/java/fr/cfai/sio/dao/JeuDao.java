package fr.cfai.sio.dao;

import java.util.List;
import fr.cfai.sio.business.Jeu;

public interface JeuDao
{
	public Jeu findJeuById(int idJeu);

	public List<Jeu> findAllJeux();
}
