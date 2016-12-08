package fr.cfai.sio.dao.requete;

public class CommentaireRequete {
	

	public static final String FIND_COMMENTAIRE_BY_ID = "SELECT * FROM commentaire WHERE id_com= ?";


	public static final String FIND_ALL_COMMENTAIRE = "SELECT * FROM commentaire";
	
	public static final String FIND_COMMENTAIRE_BY_TEST = "SELECT * FROM commentaire WHERE id_test = ?";
	
	public static final String ID_MAX_COMMENTAIRE = "SELECT MAX (id_com) FROM commentaire";
	
	public static final String AJOUT_COMMENTAIRE= "INSERT INTO commentaire (id_com,contenu_com,date_com,id_utilisateur,id_test) VALUES(?,?,?,?,?)";
	
	public static final String SUPPRESSION_COMMENTAIRE= "DELETE FROM commentaire WHERE id_com=?";

}
