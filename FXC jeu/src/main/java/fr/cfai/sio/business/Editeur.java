package fr.cfai.sio.business;

import java.util.List;

public class Editeur
{
	/**
	 * Déclaration des variables d'Editeur
	 */
	private int idEditeur;
	private String raisonSociale;
	private List<Jeu> listeJeux;

	/**
	 * Constructeur d'Editeur
	 * 
	 * @param idEditeur
	 * @param raisonSociale
	 */
	public Editeur(int idEditeur, String raisonSociale)
	{
		super();
		this.idEditeur = idEditeur;
		this.raisonSociale = raisonSociale;
	}

	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public int getIdEditeur()
	{
		return idEditeur;
	}

	public void setIdEditeur(int idEditeur)
	{
		this.idEditeur = idEditeur;
	}

	public String getRaisonSociale()
	{
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale)
	{
		this.raisonSociale = raisonSociale;
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
