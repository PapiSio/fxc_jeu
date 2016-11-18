package fr.cfai.sio.business;

public class Lire
{
	/**
	 * Déclaration des variables de Lire
	 * 
	 */
	private Plateforme plateforme;
	private Jeu jeu;

	/**
	 * Constructeur de Lire
	 * 
	 * @param plateforme
	 * @param jeu
	 */
	public Lire(Plateforme plateforme, Jeu jeu)
	{
		super();
		this.plateforme = plateforme;
		this.jeu = jeu;
	}

	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public Plateforme getPlateforme()
	{
		return plateforme;
	}

	public void setPlateforme(Plateforme plateforme)
	{
		this.plateforme = plateforme;
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
