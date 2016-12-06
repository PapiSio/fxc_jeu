package fr.cfai.sio.dao.requete;

public class CommentaireRequete {
	
	public static final String FIND_COMMENTAIRE_BY_ID = "SELECT * FROM commentaire WHERE id_commentaire = ?";

	public static final String FIND_ALL_COMMENTAIRE = "SELECT id_commentaire FROM commentaire";
	
	public static final String FIND_COMMENTAIRE_BY_TEST = "SELECT * FROM commentaire WHERE id_test = ?";

}
