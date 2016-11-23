package fr.cfai.sio.business;

import java.util.Date;
import java.util.List;

/**
 * Commentaire OK
 * 
 * Suppression nbCom ==> CHamps calculé ???
 * 
 * @author mathieu
 *
 */
public class Test
{
	/**
	 * Déclaration des variables de Test
	 */
	private int idTest;
	private String titreTest;
	private Date dateTest;
	private short noteJeu;
	private int nbCom;
	private String avantageJeu;
	private String inconvenientJeu;
	private String descriptionTest;
	private Jeu jeu;
	private Utilisateur utilisateur;
	private List<Image> listeImages;
	private List<Note> listeNotes;

	/**
	 * Constructeur de Test
	 * 
	 * @param idTest
	 *            ID du test
	 * @param titreTest
	 *            Titre du test
	 * @param dateTest
	 *            Date du test
	 * @param noteJeu
	 *            Note du jeu du test
	 * @param nbCom
	 *            Nombre de commentaire du test
	 * @param avantageJeu
	 *            Avantage du Jeu du test
	 * @param inconvenientJeu
	 *            Inconvénient du jeu du test
	 * @param jeu
	 *            Jeu du test
	 * @param utilisateur
	 *            Utilisateur du test
	 */
	public Test(int idTest, String titreTest, Date dateTest, short noteJeu, int nbCom, String avantageJeu, String inconvenientJeu,
			String descriptionTest, Jeu jeu, Utilisateur utilisateur)
	{
		super();
		this.idTest = idTest;
		this.titreTest = titreTest;
		this.dateTest = dateTest;
		this.noteJeu = noteJeu;
		this.nbCom = nbCom;
		this.avantageJeu = avantageJeu;
		this.inconvenientJeu = inconvenientJeu;
		this.descriptionTest = descriptionTest;
		this.jeu = jeu;
		this.utilisateur = utilisateur;
	}

	/**
	 * Getteur Description du test
	 * 
	 * @return Description du test
	 */
	public String getDescriptionTest()
	{
		return descriptionTest;
	}

	/**
	 * Setteur Description du test
	 * 
	 * @param descriptionTest
	 *            Description du test
	 */
	public void setDescriptionTest(String descriptionTest)
	{
		this.descriptionTest = descriptionTest;
	}

	/**
	 * Getteur ID du test
	 * 
	 * @return ID du test
	 */
	public int getIdTest()
	{
		return idTest;
	}

	/**
	 * Setteur ID du test
	 * 
	 * @param idTest
	 *            ID du test
	 */
	public void setIdTest(int idTest)
	{
		this.idTest = idTest;
	}

	/**
	 * Getteur Titre du test
	 * 
	 * @return
	 */
	public String getTitreTest()
	{
		return titreTest;
	}

	/**
	 * Setteur Titre du test
	 * 
	 * @param titreTest
	 */
	public void setTitreTest(String titreTest)
	{
		this.titreTest = titreTest;
	}

	/**
	 * Getteur Date du test
	 * 
	 * @return
	 */
	public Date getDateTest()
	{
		return dateTest;
	}

	/**
	 * Setteur Date du test
	 * 
	 * @param dateTest
	 *            Date du test
	 */
	public void setDateTest(Date dateTest)
	{
		this.dateTest = dateTest;
	}

	/**
	 * Getteur Note du jeu du test
	 * 
	 * @return Note du jeu du test
	 */
	public short getNoteJeu()
	{
		return noteJeu;
	}

	/**
	 * Setteur Note du jeu du test
	 * 
	 * @param noteJeu
	 *            Note du jeu du test
	 */
	public void setNoteJeu(short noteJeu)
	{
		this.noteJeu = noteJeu;
	}

	/**
	 * Getteur Nombre de commentaire du test
	 * 
	 * @return Nombre de commentaire du test
	 */
	public int getNbCom()
	{
		return nbCom;
	}

	/**
	 * Setteur Nombre de commentaire du test
	 * 
	 * @param nbCom
	 *            Nombre de commentaire du test
	 */
	public void setNbCom(int nbCom)
	{
		this.nbCom = nbCom;
	}

	/**
	 * Getteur Avantage du jeu du test
	 * 
	 * @return Avantage du jeu du test
	 */
	public String getAvantageJeu()
	{
		return avantageJeu;
	}

	/**
	 * Setteur Avantage du jeu du test
	 * 
	 * @param avantageJeu
	 *            Avantage du jeu du test
	 */
	public void setAvantageJeu(String avantageJeu)
	{
		this.avantageJeu = avantageJeu;
	}

	/**
	 * Getteur Inconvénient du jeu du test
	 * 
	 * @return Inconvénient du jeu du test
	 */
	public String getInconvenientJeu()
	{
		return inconvenientJeu;
	}

	/**
	 * Setteur Inconvénient du jeu du test
	 * 
	 * @param inconvenientJeu
	 *            Inconvénient du jeu du test
	 */
	public void setInconvenientJeu(String inconvenientJeu)
	{
		this.inconvenientJeu = inconvenientJeu;
	}

	/**
	 * Getteur Jeu du test
	 * 
	 * @return Jeu du test
	 */
	public Jeu getJeu()
	{
		return jeu;
	}

	/**
	 * Setteur Jeu du test
	 * 
	 * @param jeu
	 *            Jeu du test
	 */
	public void setJeu(Jeu jeu)
	{
		this.jeu = jeu;
	}

	/**
	 * Getteur Utilisateur du test
	 * 
	 * @return Utilisateur du test
	 */
	public Utilisateur getUtilisateur()
	{
		return utilisateur;
	}

	/**
	 * Setteur Utilisateur du test
	 * 
	 * @param utilisateur
	 *            Utilisateur du test
	 */
	public void setUtilisateur(Utilisateur utilisateur)
	{
		this.utilisateur = utilisateur;
	}

	/**
	 * Getteur Liste des images du test
	 * 
	 * @return Liste des images du test
	 */
	public List<Image> getListeImages()
	{
		return listeImages;
	}

	/**
	 * Setteur Liste des images du test
	 * 
	 * @param listeImages
	 *            Liste des images du test
	 */
	public void setListeImages(List<Image> listeImages)
	{
		this.listeImages = listeImages;
	}

	/**
	 * Getteur Liste des notes du test
	 * 
	 * @return Liste des notes du test
	 */
	public List<Note> getListeNotes()
	{
		return listeNotes;
	}

	/**
	 * Setteur Liste des notes du test
	 * 
	 * @param listeNotes
	 *            Liste des notes du test
	 */
	public void setListeNotes(List<Note> listeNotes)
	{
		this.listeNotes = listeNotes;
	}

	/**
	 * Permet d'ajouter un objet Image à la liste des images
	 * 
	 * @param image
	 *            un objet Image
	 */
	public void addImage(Image image)
	{
		this.listeImages.add(image);
	}

	/**
	 * Permet d'ajouter un objet Note à la liste des notes
	 * 
	 * @param note
	 *            un objet Note
	 */
	public void addNote(Note note)
	{
		this.listeNotes.add(note);
	}
}
