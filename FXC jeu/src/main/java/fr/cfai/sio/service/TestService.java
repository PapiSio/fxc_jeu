package fr.cfai.sio.service;

import java.util.List;
import fr.cfai.sio.business.Test;

/**
 * Commentaire OK
 * 
 * @author mathieu
 *
 */
public interface TestService
{
	/**
	 * Permet de récupérer objet Test en fonction de son ID en redirigeant vers
	 * la dao
	 * 
	 * @param idTest
	 *            ID du test
	 * @return Objet Test
	 */
	public Test recupereTestParID(int idTest);

	/**
	 * Permet de récupérer une liste de tests en redirigeant vers la dao
	 * 
	 * @return Liste de tests
	 */
	public List<Test> recupererListeTests();

	// Test MM
	public List<Test> recupererListeTestsMM();
}
