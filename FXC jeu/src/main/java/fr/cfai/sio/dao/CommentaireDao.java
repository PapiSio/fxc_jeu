package fr.cfai.sio.dao;

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
	
	public Commentaire findCommentaireByTest(int idTest);

}
