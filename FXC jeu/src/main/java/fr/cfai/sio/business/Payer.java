package fr.cfai.sio.business;

/**
 * Commentaire Non OK
 * @author mathieu
 *
 */
public class Payer
{

	/**
	 * Déclaration des variables de Payer
	 */
	private ModeleEconomique modeleEconomique;
	private Jeu jeu;

	/**
	 * Constructeur de Payer
	 * 
	 * @param modeleEconomique
	 * @param jeu
	 */
	public Payer(ModeleEconomique modeleEconomique, Jeu jeu)
	{
		super();
		this.modeleEconomique = modeleEconomique;
		this.jeu = jeu;
	}

	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public ModeleEconomique getModeleEconomique()
	{
		return modeleEconomique;
	}

	public void setModeleEconomique(ModeleEconomique modeleEconomique)
	{
		this.modeleEconomique = modeleEconomique;
	}

	public Jeu getJeu()
	{
		return jeu;
	}

	public void setJeu(Jeu jeu)
	{
		this.jeu = jeu;
	}
}
