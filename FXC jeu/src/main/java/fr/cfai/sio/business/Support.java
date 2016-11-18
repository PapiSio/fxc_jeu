package fr.cfai.sio.business;

public class Support
{

	/**
	 * Déclaration des variables de Support
	 */
	private int idSupport;
	private String libelleSupport;

	/**
	 * Constructeur de Support
	 * 
	 * @param idSupport
	 * @param libelleSupport
	 */
	public Support(int idSupport, String libelleSupport)
	{
		super();
		this.idSupport = idSupport;
		this.libelleSupport = libelleSupport;
	}

	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public int getIdSupport()
	{
		return idSupport;
	}

	public void setIdSupport(int idSupport)
	{
		this.idSupport = idSupport;
	}

	public String getLibelleSupport()
	{
		return libelleSupport;
	}

	public void setLibelleSupport(String libelleSupport)
	{
		this.libelleSupport = libelleSupport;
	}

}
