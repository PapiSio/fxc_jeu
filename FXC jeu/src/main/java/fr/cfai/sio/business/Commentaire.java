package fr.cfai.sio.business;

import java.util.Date;

/**
 * Commentaire OK
 * 
 * @author mathieu
 *
 */
public class Commentaire
{
	/**
	 * Déclaration des variables de Commentaire
	 */
	private int idCom;
	private String titreCom;
	private String description;
	private Date dateCom;
	private Test test;
	private Utilisateur utilisateur;

	/**
	 * Constructeur de Commentaire
	 * 
	 * @param idCom
	 *            ID du commentaire
	 * @param titreCom
	 *            Titre du commentaire
	 * @param description
	 *            Description du commentaire
	 * @param dateCom
	 *            Date du commentaire
	 * @param test
	 *            Objet Test lié au commentaire
	 * @param utilisateur
	 *            Objet Utilisateur lié au commentaire
	 */
	public Commentaire(int idCom, String titreCom, String description, Date dateCom, Test test, Utilisateur utilisateur)
	{
		super();
		this.idCom = idCom;
		this.titreCom = titreCom;
		this.description = description;
		this.dateCom = dateCom;
		this.test = test;
		this.utilisateur = utilisateur;
	}

	public Commentaire(int id_Commentaire) {
		// TODO Auto-generated constructor stub
		this.idCom = idCom;
	}

	/**
	 * Getteur ID du commentaire
	 * 
	 * @return ID du commentaire
	 */
	public int getIdCom()
	{
		return idCom;
	}

	/**
	 * Setteur ID du commentaire
	 * 
	 * @param idCom
	 *            ID du commentaire
	 */
	public void setIdCom(int idCom)
	{
		this.idCom = idCom;
	}

	/**
	 * Getteur titre du commentaire
	 * 
	 * @return titre du commentaire
	 */
	public String getTitreCom()
	{
		return titreCom;
	}

	/**
	 * Setteur Titre du commentaire
	 * 
	 * @param titreCom
	 *            Titre du commentaire
	 */
	public void setTitreCom(String titreCom)
	{
		this.titreCom = titreCom;
	}

	/**
	 * Getteur Description du commentaire
	 * 
	 * @return Description du commentaire
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Setteur Description du commentaire
	 * 
	 * @param description
	 *            Description du commentaire
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}

	/**
	 * Getteur Date du commentaire
	 * 
	 * @return Date du commentaire
	 */
	public Date getDateCom()
	{
		return dateCom;
	}

	/**
	 * Setteur Date du commentaire
	 * 
	 * @param dateCom
	 *            Date du commentaire
	 */
	public void setDateCom(Date dateCom)
	{
		this.dateCom = dateCom;
	}

	/**
	 * Getteur Test du commentaire
	 * 
	 * @return Test du commentaire
	 */
	public Test getTest()
	{
		return test;
	}

	/**
	 * Setteur Test du commentaire
	 * 
	 * @param test
	 *            Test du commentaire
	 */
	public void setTest(Test test)
	{
		this.test = test;
	}

	/**
	 * Getteur Utilisateur du commentaire
	 * 
	 * @return Utilisateur du commentaire
	 */
	public Utilisateur getUtilisateur()
	{
		return utilisateur;
	}

	/**
	 * Setteur Utilisateur du commentaire
	 * 
	 * @param utilisateur
	 *            Utilisateur du commentaire
	 */
	public void setUtilisateur(Utilisateur utilisateur)
	{
		this.utilisateur = utilisateur;
	}
}
