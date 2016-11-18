package fr.cfai.sio.business;

public class ModeleEconomique
{
	/**
	 * Déclaration des variables de ModeleEconomique
	 * 
	 */
	private int idModeleEco;
	private String libelleModeleEco;

	/**
	 * Constructeur de ModeleEconomique
	 * 
	 * @param idModeleEco
	 * @param libelleModeleEco
	 */
	public ModeleEconomique(int idModeleEco, String libelleModeleEco)
	{
		super();
		this.idModeleEco = idModeleEco;
		this.libelleModeleEco = libelleModeleEco;
	}

	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public int getIdModeleEco()
	{
		return idModeleEco;
	}

	public void setIdModeleEco(int idModeleEco)
	{
		this.idModeleEco = idModeleEco;
	}

	public String getLibelleModeleEco()
	{
		return libelleModeleEco;
	}

	public void setLibelleModeleEco(String libelleModeleEco)
	{
		this.libelleModeleEco = libelleModeleEco;
	}
}
