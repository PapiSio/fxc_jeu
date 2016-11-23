package fr.cfai.sio.business;

/**
 * Commentaire OK
 * 
 * @author mathieu
 *
 */
public class Image
{
	/**
	 * Déclaration des variables d'Image
	 */
	private int idImage;
	private String cheminImage;
	private String descriptionImage;
	private String titreImage;
	private Test test;
	private Utilisateur utilisateur;

	/**
	 * Constructeur d'Image
	 * 
	 * @param idImage
	 *            ID de l'image
	 * @param cheminImage
	 *            Chemin de l'image
	 * @param descriptionImage
	 *            Description de l'image de l'image
	 * @param titreImage
	 *            Titre de l'image
	 * @param test
	 *            Test de l'image
	 * @param utilisateur
	 *            Utilisteur de l'image
	 */
	public Image(int idImage, String cheminImage, String descriptionImage, String titreImage, Test test, Utilisateur utilisateur)
	{
		super();
		this.idImage = idImage;
		this.cheminImage = cheminImage;
		this.descriptionImage = descriptionImage;
		this.titreImage = titreImage;
		this.test = test;
		this.utilisateur = utilisateur;
	}

	/**
	 * Getteur ID de l'image
	 * 
	 * @return ID de l'image
	 */
	public int getIdImage()
	{
		return idImage;
	}

	/**
	 * Setteur ID de l'image
	 * 
	 * @param idImage
	 *            ID de l'image
	 */
	public void setIdImage(int idImage)
	{
		this.idImage = idImage;
	}

	/**
	 * Getteur Chemin de l'image
	 * 
	 * @return Chemin de l'image
	 */
	public String getCheminImage()
	{
		return cheminImage;
	}

	/**
	 * Setteur Chemin de l'image
	 * 
	 * @param cheminImage
	 *            Chemin de l'image
	 */
	public void setCheminImage(String cheminImage)
	{
		this.cheminImage = cheminImage;
	}

	/**
	 * Getteur Descripton de l'image
	 * 
	 * @return Description de l'image
	 */
	public String getDescriptionImage()
	{
		return descriptionImage;
	}

	/**
	 * Setteur Description de l'image
	 * 
	 * @param descriptionImage
	 *            Description de l'image
	 */
	public void setDescriptionImage(String descriptionImage)
	{
		this.descriptionImage = descriptionImage;
	}

	/**
	 * Getteur Titre de l'image
	 * 
	 * @return Titre de l'image
	 */
	public String getTitreImage()
	{
		return titreImage;
	}

	/**
	 * Setteur Titre de l'image
	 * 
	 * @param titreImage
	 *            Titre de l'image
	 */
	public void setTitreImage(String titreImage)
	{
		this.titreImage = titreImage;
	}

	/**
	 * Getteur Test de l'image
	 * 
	 * @return Test de l'image
	 */
	public Test getTest()
	{
		return test;
	}

	/**
	 * Setteur Test de l'image
	 * 
	 * @param test
	 *            Test de l'image
	 */
	public void setTest(Test test)
	{
		this.test = test;
	}

	/**
	 * Getteur Utilisateur de l'image
	 * 
	 * @return Utilisateur de l'image
	 */
	public Utilisateur getUtilisateur()
	{
		return utilisateur;
	}

	/**
	 * Setteur Utilisateur de l'image
	 * 
	 * @param utilisateur
	 *            Utilisateur de l'image
	 */
	public void setUtilisateur(Utilisateur utilisateur)
	{
		this.utilisateur = utilisateur;
	}
}
