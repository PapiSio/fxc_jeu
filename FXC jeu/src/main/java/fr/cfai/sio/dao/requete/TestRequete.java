package fr.cfai.sio.dao.requete;

public class TestRequete
{
	public static final String FIND_TEST_BY_ID = "SELECT * FROM test WHERE test.id_test = ?";
	
	public static final String FIND_ALL_TESTS = "SELECT id_test, titre_test, date_test, description_test, nb_com, note_jeu, id_utilisateur FROM test"; 
	
	// A finir
	public static final String ADD_TEST = "INSERT INTO test (id_test, titre_test, date_test, nb_com, avantage_jeu, inconvenient_jeu, description_test, id_jeu, id_utilisateur, note_jeu) VALUES (";
	
}
