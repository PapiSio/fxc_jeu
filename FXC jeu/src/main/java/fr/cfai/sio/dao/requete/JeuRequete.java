package fr.cfai.sio.dao.requete;

public class JeuRequete
{
	public static final String FIND_JEUX_BY_ID = "SELECT * FROM jeu,classification,developpeur,editeur,genre WHERE jeu.id_classification=classification.id_classification AND jeu.id_dev=developpeur.id_dev AND jeu.id_editeur=editeur.id_editeur AND jeu.id_genre=genre.id_genre AND jeu.id_jeu=?";
	
	public static final String FIND_ALL_JEUX = "SELECT * FROM jeu,classification,developpeur,editeur,genre WHERE jeu.id_classification=classification.id_classification AND jeu.id_dev=developpeur.id_dev AND jeu.id_editeur=editeur.id_editeur AND jeu.id_genre=genre.id_genre";


}
