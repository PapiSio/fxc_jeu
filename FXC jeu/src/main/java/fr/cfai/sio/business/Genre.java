package fr.cfai.sio.business;

import java.util.List;

public class Genre
{
	/**
	 * Déclaration des variables de Genre
	 */
	private int idGenre;
	private String libelleGenre;
	private List<Jeu> listeJeux;

	/**
	 * Constructeur de Genre
	 * 
	 * @param idGenre
	 * @param libelleGenre
	 */
	public Genre(int idGenre, String libelleGenre)
	{
		super();
		this.idGenre = idGenre;
		this.libelleGenre = libelleGenre;
	}

	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public int getIdGenre()
	{
		return idGenre;
	}

	public void setIdGenre(int idGenre)
	{
		this.idGenre = idGenre;
	}

	public String getLibelleGenre()
	{
		return libelleGenre;
	}

	public void setLibelleGenre(String libelleGenre)
	{
		this.libelleGenre = libelleGenre;
	}

	public List<Jeu> getListeJeux()
	{
		return listeJeux;
	}

	public void setListeJeux(List<Jeu> listeJeux)
	{
		this.listeJeux = listeJeux;
	}

	public void addJeu(Jeu jeu)
	{
		this.listeJeux.add(jeu);
	}

}
