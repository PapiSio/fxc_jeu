package fr.cfai.sio.service.impl;

import java.util.ArrayList;
import java.util.List;

import fr.cfai.sio.business.Test;
import fr.cfai.sio.dao.TestDao;
import fr.cfai.sio.dao.impl.TestDaoImpl;
import fr.cfai.sio.service.TestService;

public class TestServiceImpl implements TestService {
	
	private TestDao testDaoImpl;

	public TestServiceImpl() throws Exception
	{
		super();
		this.testDaoImpl = new TestDaoImpl();
	}
	
	@Override
	public Test recupereTestParID(int idTest) {
		Test test = null;
		
		test = testDaoImpl.findTestById(idTest);
		
		return test;
	}

	@Override
	public List<Test> recupererListeTests() {
		List<Test> listeTests = new ArrayList<>();
		
		listeTests = testDaoImpl.findAllTest();

		return listeTests;
	}

	
	//Test MM
	@Override
	public List<Test> recupererListeTestsMM()
	{
		List<Test> listeTestsMM = new ArrayList<>();
		
		listeTestsMM = testDaoImpl.findAllTestMM();

		return listeTestsMM;
	}

}
