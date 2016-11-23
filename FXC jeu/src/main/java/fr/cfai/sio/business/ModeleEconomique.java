package fr.cfai.sio.business;

/**
 * Commentaire OK
 * 
 * @author mathieu
 *
 */
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
	 *            ID du modèle économique
	 * @param libelleModeleEco
	 *            Libellé du modèle économique
	 */
	public ModeleEconomique(int idModeleEco, String libelleModeleEco)
	{
		super();
		this.idModeleEco = idModeleEco;
		this.libelleModeleEco = libelleModeleEco;
	}

	/**
	 * Getteur ID du modèle économique
	 * 
	 * @return ID du modèle économique
	 */
	public int getIdModeleEco()
	{
		return idModeleEco;
	}

	/**
	 * Setteur ID du modèle économique
	 * 
	 * @param idModeleEco
	 *            ID du modèle économique
	 */
	public void setIdModeleEco(int idModeleEco)
	{
		this.idModeleEco = idModeleEco;
	}

	/**
	 * Getteur Libelle du modèle économique
	 * 
	 * @return Libelle du modèle économique
	 */
	public String getLibelleModeleEco()
	{
		return libelleModeleEco;
	}

	/**
	 * Setteur Libelle du modèle économique
	 * 
	 * @param libelleModeleEco
	 *            Libelle du modèle économique
	 */
	public void setLibelleModeleEco(String libelleModeleEco)
	{
		this.libelleModeleEco = libelleModeleEco;
	}
}
