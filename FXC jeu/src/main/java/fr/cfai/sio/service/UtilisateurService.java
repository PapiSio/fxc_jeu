package fr.cfai.sio.service;

import java.util.List;
import fr.cfai.sio.business.Utilisateur;

public interface UtilisateurService
{
	public Utilisateur ajouteUtilisateur(String login, String password);

	public Utilisateur recupererUtilisateurParID(int idUtilisateur);

	public List<Utilisateur> recupererListeUtilisateurs();
}
