package fr.cfai.sio.service;

import java.util.List;
import fr.cfai.sio.business.Developpeur;

public interface DeveloppeurService
{
	public Developpeur recupererDeveloppeurParID(int idDeveloppeur);

	public List<Developpeur> recupererListeDeveloppeurs();
}
