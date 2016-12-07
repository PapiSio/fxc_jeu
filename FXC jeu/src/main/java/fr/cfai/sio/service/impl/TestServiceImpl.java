package fr.cfai.sio.service.impl;

import java.util.Date;
import java.util.List;
import fr.cfai.sio.business.Test;
import fr.cfai.sio.dao.TestDao;
import fr.cfai.sio.dao.impl.TestDaoImpl;
import fr.cfai.sio.service.TestService;

public class TestServiceImpl implements TestService
{

	private TestDao testDaoImpl;
	private List<Test> listeTests;

	public TestServiceImpl() throws Exception
	{
		super();
		this.testDaoImpl = new TestDaoImpl();
	}

	@Override
	public Test recupereTestParID(int idTest)
	{
		Test test = null;

		test = testDaoImpl.findTestById(idTest);

		return test;
	}

	@Override
	public List<Test> recupererListeTests()
	{
		if (listeTests == null)
		{
			listeTests = testDaoImpl.findAllTest();
			return listeTests;
		}
		else
		{
			return listeTests;
		}
	}

	@Override
	public Test ajouterTest(String titre, Date date, int nb_Com, String avantage, String inconvenient, String description, short note, int id_Jeu,
			int id_Utilisateur)
	{
		Test test = null;

		test = testDaoImpl.addTest(titre, date, nb_Com, avantage, inconvenient, description, note, id_Jeu, id_Utilisateur);

		return test;
	}
}
