package fr.cfai.sio.service;

import java.util.List;

import fr.cfai.sio.business.Commentaire;

public interface CommentaireService {
	
	public List<Commentaire> recupererListeCommentaire();
	
	public Commentaire recupererCommentaireParId(int idcommentaire);
	
	public Commentaire recupererCommentaireParTest(int idTest);

}
