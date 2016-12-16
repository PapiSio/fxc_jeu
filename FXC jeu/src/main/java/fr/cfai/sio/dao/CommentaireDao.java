package fr.cfai.sio.dao;

import java.util.Date;
import java.util.List;
import fr.cfai.sio.business.Commentaire;

public interface CommentaireDao {
	
	/**
	 * Permet de recuperer un commentaire en fonction de son ID
	 * @return
	 */
	public Commentaire findCommentaireById(int idCommentaire);
	
	
	/**
	 * Permet de récupérer la liste de tous les commentaires
	 * @return
	 */
	
	
	public List<Commentaire> findAllCommentaire();
	
	public List<Commentaire> findCommentaireByTest(int idTest);


	
	public int getIDMaxCommentaire();


	public int addReponseCommentaire(int idCom, String contenuCom, Date dateCom, int idTest, int idUtilisateur,
			int idCommentaire);


	public int addCommentaire(int idCom, String contenuCom, Date dateCom, int idTest, int idUtilisateur);
	

}
