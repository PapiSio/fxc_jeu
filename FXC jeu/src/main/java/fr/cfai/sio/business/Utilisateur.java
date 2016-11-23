package fr.cfai.sio.business;

import java.util.List;

/**
 * Commentaire OK
 * 
 * ID com meme remarque que dans test
 * 
 * @author mathieu
 *
 */
public class Utilisateur
{
	/**
	 * Déclaration des variables de User
	 */
	private int idUtilisateur;
	private String login;
	private String password;
	private int nbCom;
	private String imgUtilisateur;
	private List<Test> ListeTests;
	private List<Image> ListeImages;
	private List<Commentaire> ListeCommentaires;

	/**
	 * Constructeur de User
	 * 
	 * @param idUtilisateur
	 *            ID de l'utilisateur
	 * @param login
	 *            Login de l'utilisateur
	 * @param password
	 *            Mot de passe de l'utilisateur
	 * @param nbCom
	 *            Nombre de commentaire de l'utilisateur
	 * @param imgUser
	 *            Image de l'utilisateur
	 */
	public Utilisateur(int idUtilisateur, String login, String password, int nbCom, String imgUtilisateur)
	{
		super();
		this.idUtilisateur = idUtilisateur;
		this.login = login;
		this.password = password;
		this.nbCom = nbCom;
		this.imgUtilisateur = imgUtilisateur;
	}

	/**
	 * Constructeur pour l'ajout
	 * 
	 * @param login
	 *            Login de l'utilisateur
	 * @param password
	 *            Mot de passe de l'utilisateur
	 */
	public Utilisateur(String login, String password)
	{
		this.login = login;
		this.password = password;
	}

	public Utilisateur(int idUtilisateur, String login, String mdp, int nbCom)
	{
		this.idUtilisateur = idUtilisateur;
		this.login = login;
		this.password = mdp;
		this.nbCom = nbCom;
	}

	// Test VMELE
	public Utilisateur(int idUtilisateur)
	{
		this.idUtilisateur = idUtilisateur;
	}

	/**
	 * Getteur ID de l'utilisateur
	 * 
	 * @return ID de l'utilisateur
	 */
	public int getIdUtilisateur()
	{
		return idUtilisateur;
	}

	/**
	 * Setteur ID de l'utilisateur
	 * 
	 * @param idUtilisateur
	 *            ID de l'utilisateur
	 */
	public void setIdUtilisateur(int idUtilisateur)
	{
		this.idUtilisateur = idUtilisateur;
	}

	/**
	 * Getteur Login de l'utilisateur
	 * 
	 * @return Login de l'utilisateur
	 */
	public String getLogin()
	{
		return login;
	}

	/**
	 * Setteur Login de l'utilisateur
	 * 
	 * @param login
	 *            Login de l'utilisateur
	 */
	public void setLogin(String login)
	{
		this.login = login;
	}

	/**
	 * Getteur Mot de passe de l'utilisateur
	 * 
	 * @return Mot de passe de l'utilisateur
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Setteur Mot de passe de l'utilisateur
	 * 
	 * @param password
	 *            Mot de passe de l'utilisateur
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * Getteur Nombre de commentaire de l'utilisateur
	 * 
	 * @return Nombre de commentaire de l'utilisateur
	 */
	public int getNbCom()
	{
		return nbCom;
	}

	/**
	 * Setteur Nombre de commentaire de l'utilisateur
	 * 
	 * @param nbCom
	 *            Nombre de commentaire de l'utilisateur
	 */
	public void setNbCom(int nbCom)
	{
		this.nbCom = nbCom;
	}

	/**
	 * Getteur Image de l'utilisateur
	 * 
	 * @return Image de l'utilisateur
	 */
	public String getImgUtilisateur()
	{
		return imgUtilisateur;
	}

	/**
	 * Setteur Image de l'utilisateur
	 * 
	 * @param imgUtilisateur
	 *            Image de l'utilisateur
	 */
	public void setImgUtilisateur(String imgUtilisateur)
	{
		this.imgUtilisateur = imgUtilisateur;
	}

	/**
	 * Getteur Liste des tests de l'utilisateur
	 * 
	 * @return Liste des tests de l'utilisateur
	 */
	public List<Test> getListeTests()
	{
		return ListeTests;
	}

	/**
	 * Setteur Liste des tests de l'utilisateur
	 * 
	 * @param listeTests
	 *            Liste des tests de l'utilisateur
	 */
	public void setListeTests(List<Test> listeTests)
	{
		ListeTests = listeTests;
	}

	/**
	 * Getteur Liste des images de l'utilisateur
	 * 
	 * @return Liste des images de l'utilisateur
	 */
	public List<Image> getListeImages()
	{
		return ListeImages;
	}

	/**
	 * Setteur Liste des images de l'utilisateur
	 * 
	 * @param listeImages
	 *            Liste des images de l'utilisateur
	 */
	public void setListeImages(List<Image> listeImages)
	{
		ListeImages = listeImages;
	}

	/**
	 * Getteur Liste des commentaires de l'utilisateur
	 * 
	 * @return Liste des commentaires de l'utilisateur
	 */
	public List<Commentaire> getListeCommentaires()
	{
		return ListeCommentaires;
	}

	/**
	 * Setteur Liste des commentaires de l'utilisateur
	 * 
	 * @param listeCommentaires
	 *            Liste des commentaires de l'utilisateur
	 */
	public void setListeCommentaires(List<Commentaire> listeCommentaires)
	{
		ListeCommentaires = listeCommentaires;
	}

	/**
	 * Permet d'ajouter un objet Test à la liste des tests
	 * 
	 * @param test
	 *            un objet Test
	 */
	public void addTest(Test test)
	{
		this.ListeTests.add(test);
	}

	/**
	 * Permet d'ajouter un objet Image à la liste des images
	 * 
	 * @param image
	 *            un objet Image
	 */
	public void addImage(Image image)
	{
		this.ListeImages.add(image);
	}

	/**
	 * Permet d'ajouter un objet Commentaire à la liste des commentaires
	 * 
	 * @param commentaire
	 *            un objet Commentaire
	 */
	public void addCommentaire(Commentaire commentaire)
	{
		this.ListeCommentaires.add(commentaire);
	}
}
