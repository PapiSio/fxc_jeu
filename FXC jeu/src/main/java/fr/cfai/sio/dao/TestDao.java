package fr.cfai.sio.dao;

import java.util.List;
import fr.cfai.sio.business.Test;

/**
 * Commentaire OK
 * 
 * @author mathieu
 *
 */
public interface TestDao
{
	/**
	 * Permet de récupérer un Objet Test en fonction de son ID
	 * 
	 * @param idTest
	 *            ID du test
	 * @return L'objet Test
	 */
	public Test findTestById(int idTest);

	/**
	 * Permet de récupérer la liste des tests
	 * 
	 * @return Liste des tests
	 */
	public List<Test> findAllTest();

	/**
	 * Permet d'ajouter un objet Test en BDD
	 * 
	 * @return l'objet Test ajouté
	 */
	public Test addTest();
}
