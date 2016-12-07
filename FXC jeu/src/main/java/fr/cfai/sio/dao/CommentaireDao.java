package fr.cfai.sio.dao;

import java.util.Date;
import java.util.List;

import fr.cfai.sio.business.Commentaire;
import fr.cfai.sio.business.Test;
import fr.cfai.sio.business.Utilisateur;

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
	
	public int addCommentaire(int idCom,String titreCom,String description,Date dateCom,Test test,Utilisateur utilisateur);
	
	public List<Commentaire> findAllCommentaire();
	
	public Commentaire findCommentaireByTest(int idTest);
	

}
