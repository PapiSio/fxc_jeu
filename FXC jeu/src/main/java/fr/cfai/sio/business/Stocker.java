package fr.cfai.sio.business;

/**
 * Commentaire non OK
 * 
 * @author mathieu
 *
 */
public class Stocker
{

	/**
	 * Déclartion des variables de Stocker
	 */
	private Support support;
	private Jeu jeu;

	/**
	 * Constructeur de Stocker
	 * 
	 * @param support
	 * @param jeu
	 */
	public Stocker(Support support, Jeu jeu)
	{
		super();
		this.support = support;
		this.jeu = jeu;
	}

	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public Support getSupport()
	{
		return support;
	}

	public void setSupport(Support support)
	{
		this.support = support;
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
