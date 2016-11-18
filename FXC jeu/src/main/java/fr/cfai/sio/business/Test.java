package fr.cfai.sio.business;

import java.util.Date;
import java.util.List;

public class Test
{
	/**
	 * Déclaration des variables de Test
	 */
	private int idTest;
	private String titreTest;
	private Date dateTest;
	private byte noteJeu;
	private int nbCom;
	private String avantageJeu;
	private String inconvenientJeu;
	private Jeu jeu;
	private Utilisateur user;
	private List<Image> listeImages;
	private List<Note> listeNotes;

	/**
	 * Constructeur de Test
	 * 
	 * @param idTest
	 * @param titreTest
	 * @param dateTest
	 * @param noteJeu
	 * @param moyTest
	 * @param nbCom
	 * @param avantageJeu
	 * @param inconvenientJeu
	 * @param imgTest
	 * @param jeu
	 * @param user
	 * @param listeImages
	 * @param listeNotes
	 */
	public Test(int idTest, String titreTest, Date dateTest, byte noteJeu, int nbCom, String avantageJeu, String inconvenientJeu, Jeu jeu,
			Utilisateur user)
	{
		super();
		this.idTest = idTest;
		this.titreTest = titreTest;
		this.dateTest = dateTest;
		this.noteJeu = noteJeu;
		this.nbCom = nbCom;
		this.avantageJeu = avantageJeu;
		this.inconvenientJeu = inconvenientJeu;
		this.jeu = jeu;
		this.user = user;
	}

	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public int getIdTest()
	{
		return idTest;
	}

	public void setIdTest(int idTest)
	{
		this.idTest = idTest;
	}

	public String getTitreTest()
	{
		return titreTest;
	}

	public void setTitreTest(String titreTest)
	{
		this.titreTest = titreTest;
	}

	public Date getDateTest()
	{
		return dateTest;
	}

	public void setDateTest(Date dateTest)
	{
		this.dateTest = dateTest;
	}

	public byte getNoteJeu()
	{
		return noteJeu;
	}

	public void setNoteJeu(byte noteJeu)
	{
		this.noteJeu = noteJeu;
	}

	public int getNbCom()
	{
		return nbCom;
	}

	public void setNbCom(int nbCom)
	{
		this.nbCom = nbCom;
	}

	public String getAvantageJeu()
	{
		return avantageJeu;
	}

	public void setAvantageJeu(String avantageJeu)
	{
		this.avantageJeu = avantageJeu;
	}

	public String getInconvenientJeu()
	{
		return inconvenientJeu;
	}

	public void setInconvenientJeu(String inconvenientJeu)
	{
		this.inconvenientJeu = inconvenientJeu;
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

	public List<Image> getListeImages()
	{
		return listeImages;
	}

	public void setListeImages(List<Image> listeImages)
	{
		this.listeImages = listeImages;
	}

	public List<Note> getListeNotes()
	{
		return listeNotes;
	}

	public void setListeNotes(List<Note> listeNotes)
	{
		this.listeNotes = listeNotes;
	}

	public void addImage(Image image)
	{
		this.listeImages.add(image);
	}

	public void addNote(Note note)
	{
		this.listeNotes.add(note);
	}

}
