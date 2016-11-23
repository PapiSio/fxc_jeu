package fr.cfai.sio.business;

import java.util.Date;
import java.util.List;

/**
 * Commentaire OK
 * 
 * @author mathieu
 *
 */
public class Jeu
{
	/**
	 * Déclaration des variables de Jeu
	 */
	private int idJeu;
	private String titreJeu;
	private Date dateSortieJeu;
	private String description;
	private String imgJeu;
	private Classification classification;
	private Editeur editeur;
	private Genre genre;
	private Developpeur developpeur;
	private List<Test> listeTests;

	/**
	 * Constructeur de Jeu
	 * 
	 * @param id_Jeu
	 *            ID du jeu
	 * @param titre_Jeu
	 *            Titre du jeu
	 * @param date_Sortie_Jeu
	 *            Date de sortie du jeu
	 * @param description
	 *            Description du jeu
	 * @param imgJeu
	 *            Image du jeu
	 * @param classification
	 *            Classification du jeu
	 * @param editeur
	 *            Editeur du jeu
	 * @param genre
	 *            Genre du jeu
	 * @param developpeur
	 *            Developpeur du jeu
	 */
	public Jeu(int id_Jeu, String titre_Jeu, Date date_Sortie_Jeu, String description, String imgJeu, Classification classification, Editeur editeur,
			Genre genre, Developpeur developpeur)
	{
		this.idJeu = id_Jeu;
		this.titreJeu = titre_Jeu;
		this.dateSortieJeu = date_Sortie_Jeu;
		this.description = description;
		this.imgJeu = imgJeu;
		this.classification = classification;
		this.editeur = editeur;
		this.genre = genre;
		this.developpeur = developpeur;
	}

	// Test VMELE
	public Jeu(int id_Jeu)
	{
		this.idJeu = id_Jeu;
	}

	/**
	 * Getteur ID du jeu
	 * 
	 * @return ID du jeu
	 */
	public int getIdJeu()
	{
		return idJeu;
	}

	/**
	 * Setteur ID du jeu
	 * 
	 * @param idJeu
	 *            ID du jeu
	 */
	public void setIdJeu(int idJeu)
	{
		this.idJeu = idJeu;
	}

	/**
	 * Getteur Titre du jeu
	 * 
	 * @return Titre du jeu
	 */
	public String getTitreJeu()
	{
		return titreJeu;
	}

	/**
	 * Setteur Titre du jeu
	 * 
	 * @param titreJeu
	 *            Titre du jeu
	 */
	public void setTitreJeu(String titreJeu)
	{
		this.titreJeu = titreJeu;
	}

	/**
	 * Getteur Date de sortie du jeu
	 * 
	 * @return Date de sortie du jeu
	 */
	public Date getDateSortieJeu()
	{
		return dateSortieJeu;
	}

	/**
	 * Setteur Date de sortie du jeu
	 * 
	 * @param dateSortieJeu
	 *            Date de sortie du jeu
	 */
	public void setDateSortieJeu(Date dateSortieJeu)
	{
		this.dateSortieJeu = dateSortieJeu;
	}

	/**
	 * Getteur Description du jeu
	 * 
	 * @return Description du jeu
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Setteur Description du jeu
	 * 
	 * @param description
	 *            Description du jeu
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}

	/**
	 * Getteur Image du jeu
	 * 
	 * @return Image du jeu
	 */
	public String getImgJeu()
	{
		return imgJeu;
	}

	/**
	 * Setteur Image du jeu
	 * 
	 * @param imgJeu
	 *            Image du jeu
	 */
	public void setImgJeu(String imgJeu)
	{
		this.imgJeu = imgJeu;
	}

	/**
	 * Getteur Classification du jeu
	 * 
	 * @return Classification du jeu
	 */
	public Classification getClassification()
	{
		return classification;
	}

	/**
	 * Setteur Classification du jeu
	 * 
	 * @param classification
	 *            Classification du jeu
	 */
	public void setClassification(Classification classification)
	{
		this.classification = classification;
	}

	/**
	 * Getteur Editeur du jeu
	 * 
	 * @return Editeur du jeu
	 */
	public Editeur getEditeur()
	{
		return editeur;
	}

	/**
	 * Setteur Editeur du jeu
	 * 
	 * @param editeur
	 *            Editeur du jeu
	 */
	public void setEditeur(Editeur editeur)
	{
		this.editeur = editeur;
	}

	/**
	 * Getteur Genre du jeu
	 * 
	 * @return Genre du jeu
	 */
	public Genre getGenre()
	{
		return genre;
	}

	/**
	 * Setteur Genre du jeu
	 * 
	 * @param genre
	 *            Genre du jeu
	 */
	public void setGenre(Genre genre)
	{
		this.genre = genre;
	}

	/**
	 * Getteur Developpeur du jeu
	 * 
	 * @return Developpeur du jeu
	 */
	public Developpeur getDeveloppeur()
	{
		return developpeur;
	}

	/**
	 * Setteur Developpeur du jeu
	 * 
	 * @param developpeur
	 *            Developpeur du jeu
	 */
	public void setDeveloppeur(Developpeur developpeur)
	{
		this.developpeur = developpeur;
	}

	/**
	 * Getteur Liste des tests du jeu
	 * 
	 * @return Liste des tests du jeu
	 */
	public List<Test> getListeTests()
	{
		return listeTests;
	}

	/**
	 * Setteur Liste des tests du jeu
	 * 
	 * @param listeTests
	 *            Liste des tests du jeu
	 */
	public void setListeTests(List<Test> listeTests)
	{
		this.listeTests = listeTests;
	}

	/**
	 * Permet d'ajouter un objet Test à la liste des tests
	 * 
	 * @param test
	 *            un objet Test
	 */
	public void addTest(Test test)
	{
		this.listeTests.add(test);
	}
}
