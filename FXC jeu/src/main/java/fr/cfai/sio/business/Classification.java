package fr.cfai.sio.business;

import java.util.List;

public class Classification
{

	/**
	 * Déclaration des variables Classification
	 */
	private int idClassification;
	private String libelleClassification;
	private List<Jeu> listeJeux;

	/**
	 * Conctructeur de Classification
	 * 
	 * @param idClassification
	 * @param libelleClassification
	 */

	public Classification(int id_classification, String libelle_classification)
	{
		this.idClassification = id_classification;
		this.libelleClassification = libelle_classification;
	}

	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public int getIdClassification()
	{
		return idClassification;
	}

	public void setIdClassification(int idClassification)
	{
		this.idClassification = idClassification;
	}

	public String getLibelleClassification()
	{
		return libelleClassification;
	}

	public void setLibelleClassification(String libelleClassification)
	{
		this.libelleClassification = libelleClassification;
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
