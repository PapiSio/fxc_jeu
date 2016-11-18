package fr.cfai.sio.business;

import java.util.List;

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
	 * @param login
	 * @param password
	 * @param moyNote
	 * @param nbCom
	 * @param imgUser
	 * @param listeTests
	 * @param listeImages
	 * @param listeCommentaires
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

	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public int getIdUser()
	{
		return idUtilisateur;
	}

	public void setIdUser(int idUser)
	{
		this.idUtilisateur = idUser;
	}

	public String getLogin()
	{
		return login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public int getNbCom()
	{
		return nbCom;
	}

	public void setNbCom(int nbCom)
	{
		this.nbCom = nbCom;
	}

	public String getImgUser()
	{
		return imgUtilisateur;
	}

	public void setImgUser(String imgUser)
	{
		this.imgUtilisateur = imgUser;
	}

	public List<Test> getListeTests()
	{
		return ListeTests;
	}

	public void setListeTests(List<Test> listeTests)
	{
		ListeTests = listeTests;
	}

	public List<Image> getListeImages()
	{
		return ListeImages;
	}

	public void setListeImages(List<Image> listeImages)
	{
		ListeImages = listeImages;
	}

	public List<Commentaire> getListeCommentaires()
	{
		return ListeCommentaires;
	}

	public void setListeCommentaires(List<Commentaire> listeCommentaires)
	{
		ListeCommentaires = listeCommentaires;
	}

	public void addTest(Test test)
	{
		this.ListeTests.add(test);
	}

	public void addImage(Image image)
	{
		this.ListeImages.add(image);
	}

	public void addCommentaire(Commentaire commentaire)
	{
		this.ListeCommentaires.add(commentaire);
	}

}
