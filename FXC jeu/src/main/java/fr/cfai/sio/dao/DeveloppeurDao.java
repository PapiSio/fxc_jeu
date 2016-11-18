package fr.cfai.sio.dao;

import java.util.List;
import fr.cfai.sio.business.Developpeur;

public interface DeveloppeurDao
{

	public Developpeur findDeveloppeurById(int idDeveloppeur);

	public List<Developpeur> findAllDeveloppeurs();

}
