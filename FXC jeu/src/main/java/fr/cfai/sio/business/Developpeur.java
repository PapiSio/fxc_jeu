package fr.cfai.sio.business;

import java.util.List;

public class Developpeur
{

	/**
	 * Déclaration des variables de Developpeur
	 */
	private int idDeveloppeur;
	private String raisonSociale;
	private List<Jeu> listeJeux;

	/**
	 * Constructeur de Developpeur
	 * 
	 * @param idDeveloppeur
	 * @param raisonSociale
	 */
	public Developpeur(int idDeveloppeur, String raisonSociale)
	{
		super();
		this.idDeveloppeur = idDeveloppeur;
		this.raisonSociale = raisonSociale;
	}

	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public int getIdDeveloppeur()
	{
		return idDeveloppeur;
	}

	public void setIdDeveloppeur(int idDeveloppeur)
	{
		this.idDeveloppeur = idDeveloppeur;
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
