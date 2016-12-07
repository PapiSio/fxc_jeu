package fr.cfai.sio.service;

import java.util.Date;
import java.util.List;

import fr.cfai.sio.business.Commentaire;
import fr.cfai.sio.business.Test;
import fr.cfai.sio.business.Utilisateur;

public interface CommentaireService {
	
	public List<Commentaire> recupererListeCommentaire();
	
	public Commentaire recupererCommentaireParId(int idcommentaire);
	
	public Commentaire recupererCommentaireParTest(int idTest);
	
	public Commentaire ajouterCommentaire(int idCom, String titreCom, String description, Date dateCom, Test test,
			Utilisateur utilisateur);

}
