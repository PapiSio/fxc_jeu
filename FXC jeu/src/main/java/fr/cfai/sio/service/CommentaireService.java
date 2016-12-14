package fr.cfai.sio.service;

import java.util.Date;
import java.util.List;

import fr.cfai.sio.business.Commentaire;
import fr.cfai.sio.business.Test;
import fr.cfai.sio.business.Utilisateur;

public interface CommentaireService {
	
	public List<Commentaire> recupererListeCommentaire();
	
	public Commentaire recupererCommentaireParId(int idcommentaire);
	
	public List<Commentaire> recupererCommentaireParTest(int idTest);
	
	
	public int recupererIDMaxCommentaire();

	public Commentaire ajouterCommentaire(int idCom, String contenuCom, Date dateCom, int idTest, int idUtilisateur);

	public Commentaire ajouterReponseCommentaire(int idCom, String contenuCom, Date dateCom, int idTest, int idUtilisateur,
			Commentaire commentaire);

}
