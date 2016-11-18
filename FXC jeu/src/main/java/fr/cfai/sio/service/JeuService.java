package fr.cfai.sio.service;

import java.util.List;
import fr.cfai.sio.business.Jeu;

public interface JeuService
{
	public Jeu recupereJeuParID(int idJeu);

	public List<Jeu> recupererListeJeux();
}
