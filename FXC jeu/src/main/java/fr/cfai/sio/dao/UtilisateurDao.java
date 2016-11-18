package fr.cfai.sio.dao;

import java.util.List;
import fr.cfai.sio.business.Utilisateur;

public interface UtilisateurDao
{

	public int addUtilisateur(String login, String mdp);

	public Utilisateur findUtilisateurById(int idUtilisateur);

	public List<Utilisateur> findAllUtilisateurs();

}
