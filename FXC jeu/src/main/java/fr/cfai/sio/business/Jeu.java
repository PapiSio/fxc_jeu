package fr.cfai.sio.business;

import java.util.Date;
import java.util.List;

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
	private List<Image> listeImages;
	private List<Test> listeTests;

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
	public Jeu(int id_Jeu) {
		this.idJeu = id_Jeu;
	}

	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public int getIdJeu()
	{
		return idJeu;
	}

	public void setIdJeu(int idJeu)
	{
		this.idJeu = idJeu;
	}

	public String getTitreJeu()
	{
		return titreJeu;
	}

	public void setTitreJeu(String titreJeu)
	{
		this.titreJeu = titreJeu;
	}

	public Date getDateSortieJeu()
	{
		return dateSortieJeu;
	}

	public void setDateSortieJeu(Date dateSortieJeu)
	{
		this.dateSortieJeu = dateSortieJeu;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getImgJeu()
	{
		return imgJeu;
	}

	public void setImgJeu(String imgJeu)
	{
		this.imgJeu = imgJeu;
	}

	public Classification getClassification()
	{
		return classification;
	}

	public void setClassification(Classification classification)
	{
		this.classification = classification;
	}

	public Editeur getEditeur()
	{
		return editeur;
	}

	public void setEditeur(Editeur editeur)
	{
		this.editeur = editeur;
	}

	public Genre getGenre()
	{
		return genre;
	}

	public void setGenre(Genre genre)
	{
		this.genre = genre;
	}

	public Developpeur getDeveloppeur()
	{
		return developpeur;
	}

	public void setDeveloppeur(Developpeur developpeur)
	{
		this.developpeur = developpeur;
	}

	public List<Image> getListeImages()
	{
		return listeImages;
	}

	public void setListeImages(List<Image> listeImages)
	{
		this.listeImages = listeImages;
	}

	public List<Test> getListeTests()
	{
		return listeTests;
	}

	public void setListeTests(List<Test> listeTests)
	{
		this.listeTests = listeTests;
	}

	public void addImage(Image image)
	{
		this.listeImages.add(image);
	}

	public void addTest(Test test)
	{
		this.listeTests.add(test);
	}

}
