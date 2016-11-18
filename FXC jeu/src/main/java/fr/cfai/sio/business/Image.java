package fr.cfai.sio.business;

public class Image
{
	/**
	 * Déclaration des variables d'Image
	 */
	private int idImage;
	private String cheminImage;
	private String descriptionImae;
	private String titreImage;
	private Test test;
	private Jeu jeu;
	private Utilisateur user;

	/**
	 * Constructeur d'Image
	 * 
	 * @param idImage
	 * @param cheminImage
	 * @param descriptionImae
	 * @param titreImage
	 * @param test
	 * @param jeu
	 * @param user
	 */
	public Image(int idImage, String cheminImage, String descriptionImae, String titreImage, Test test, Jeu jeu, Utilisateur user)
	{
		super();
		this.idImage = idImage;
		this.cheminImage = cheminImage;
		this.descriptionImae = descriptionImae;
		this.titreImage = titreImage;
		this.test = test;
		this.jeu = jeu;
		this.user = user;
	}

	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public int getIdImage()
	{
		return idImage;
	}

	public void setIdImage(int idImage)
	{
		this.idImage = idImage;
	}

	public String getCheminImage()
	{
		return cheminImage;
	}

	public void setCheminImage(String cheminImage)
	{
		this.cheminImage = cheminImage;
	}

	public String getDescriptionImae()
	{
		return descriptionImae;
	}

	public void setDescriptionImae(String descriptionImae)
	{
		this.descriptionImae = descriptionImae;
	}

	public String getTitreImage()
	{
		return titreImage;
	}

	public void setTitreImage(String titreImage)
	{
		this.titreImage = titreImage;
	}

	public Test getTest()
	{
		return test;
	}

	public void setTest(Test test)
	{
		this.test = test;
	}

	public Jeu getJeu()
	{
		return jeu;
	}

	public void setJeu(Jeu jeu)
	{
		this.jeu = jeu;
	}

	public Utilisateur getUser()
	{
		return user;
	}

	public void setUser(Utilisateur user)
	{
		this.user = user;
	}

}
