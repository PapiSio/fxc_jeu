package fr.cfai.sio.business;

public class Plateforme
{

	/**
	 * Déclaration des varaibles de Plateforme
	 */
	private int idPlateforme;
	private String libellePlateforme;

	/**
	 * Constructeur de Plateforme
	 * 
	 * @param idPlateforme
	 * @param libellePlateforme
	 */
	public Plateforme(int idPlateforme, String libellePlateforme)
	{
		super();
		this.idPlateforme = idPlateforme;
		this.libellePlateforme = libellePlateforme;
	}

	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public int getIdPlateforme()
	{
		return idPlateforme;
	}

	public void setIdPlateforme(int idPlateforme)
	{
		this.idPlateforme = idPlateforme;
	}

	public String getLibellePlateforme()
	{
		return libellePlateforme;
	}

	public void setLibellePlateforme(String libellePlateforme)
	{
		this.libellePlateforme = libellePlateforme;
	}

}
