package fr.cfai.sio.business;

import java.util.Date;

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
	private Utilisateur user;

	/**
	 * Constructeur de Commentaire
	 * 
	 * @param idCom
	 * @param titreCom
	 * @param description
	 * @param dateCom
	 * @param test
	 * @param user
	 */
	public Commentaire(int idCom, String titreCom, String description, Date dateCom, Test test, Utilisateur user)
	{
		super();
		this.idCom = idCom;
		this.titreCom = titreCom;
		this.description = description;
		this.dateCom = dateCom;
		this.test = test;
		this.user = user;
	}

	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public int getIdCom()
	{
		return idCom;
	}

	public void setIdCom(int idCom)
	{
		this.idCom = idCom;
	}

	public String getTitreCom()
	{
		return titreCom;
	}

	public void setTitreCom(String titreCom)
	{
		this.titreCom = titreCom;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public Date getDateCom()
	{
		return dateCom;
	}

	public void setDateCom(Date dateCom)
	{
		this.dateCom = dateCom;
	}

	public Test getTest()
	{
		return test;
	}

	public void setTest(Test test)
	{
		this.test = test;
	}

	public Utilisateur getUser()
	{
		return user;
	}

	public void setUser(Utilisateur user)
	{
		this.user = user;
	}

}
