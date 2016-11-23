package fr.cfai.sio.business;

/**
 * Commentaire OK
 * 
 * @author mathieu
 *
 */
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
	 *            ID de la plateforme
	 * @param libellePlateforme
	 *            Libelle de la plateforme
	 */
	public Plateforme(int idPlateforme, String libellePlateforme)
	{
		super();
		this.idPlateforme = idPlateforme;
		this.libellePlateforme = libellePlateforme;
	}

	/**
	 * Getteur ID de la plateforme
	 * 
	 * @return ID de la plateforme
	 */
	public int getIdPlateforme()
	{
		return idPlateforme;
	}

	/**
	 * Setteur ID de la plateforme
	 * 
	 * @param idPlateforme
	 *            ID de la plateforme
	 */
	public void setIdPlateforme(int idPlateforme)
	{
		this.idPlateforme = idPlateforme;
	}

	/**
	 * Getteur Libelle de la plateforme
	 * 
	 * @return Libelle de la plateforme
	 */
	public String getLibellePlateforme()
	{
		return libellePlateforme;
	}

	/**
	 * Setteur Libelle de la plateforme
	 * 
	 * @param libellePlateforme
	 *            Libelle de la plateforme
	 */
	public void setLibellePlateforme(String libellePlateforme)
	{
		this.libellePlateforme = libellePlateforme;
	}

}
