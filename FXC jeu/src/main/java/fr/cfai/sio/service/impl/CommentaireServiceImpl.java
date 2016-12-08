package fr.cfai.sio.service.impl;

import java.util.Date;
import java.util.List;

import fr.cfai.sio.business.Commentaire;
import fr.cfai.sio.business.Test;
import fr.cfai.sio.business.Utilisateur;
import fr.cfai.sio.dao.CommentaireDao;
import fr.cfai.sio.dao.impl.CommentaireDaoImpl;
import fr.cfai.sio.service.CommentaireService;

public class CommentaireServiceImpl implements CommentaireService {
	
	private CommentaireDao commentaireDaoImpl;
	private List<Commentaire> listeCommentaire;

	public CommentaireServiceImpl() throws Exception {
		super();
		// TODO Auto-generated constructor stub
		this.commentaireDaoImpl = new CommentaireDaoImpl();
	}

	@Override
	public List<Commentaire> recupererListeCommentaire() {
		// TODO Auto-generated method stub
		if (listeCommentaire == null)
		{
			// System.out.println("ServiceJEU : Passe par le if, liste null");
			listeCommentaire = commentaireDaoImpl.findAllCommentaire();
			return listeCommentaire;
		}
		
		else
		{
			// System.out.println("ServiceJEU : Passe par le else, liste not
			// null");
			return listeCommentaire;
		}
		
	}

	@Override
	public Commentaire recupererCommentaireParId(int idcommentaire) {
		// TODO Auto-generated method stub
		Commentaire commentaire = null;
		
		commentaire = commentaireDaoImpl.findCommentaireById(idcommentaire);
		
		return commentaire;
	}

	@Override
	public List<Commentaire> recupererCommentaireParTest(int idTest) {
		// TODO Auto-generated method stub
		List<Commentaire> listeCommentaire = null;
		
		listeCommentaire = commentaireDaoImpl.findCommentaireByTest(idTest);
		
		return listeCommentaire;
	}

	@Override
	public Commentaire ajouterCommentaire(int idCom, String contenuCom, Date dateCom, Test test,
			Utilisateur utilisateur) {
		Commentaire commentaire = null;

		if (commentaireDaoImpl.addCommentaire(idCom,contenuCom,dateCom,test,utilisateur) != 0)
		{
			System.out.println("GG");
			commentaire = new Commentaire(idCom,contenuCom,dateCom,test,utilisateur);
		}

		return commentaire;
	}



}
