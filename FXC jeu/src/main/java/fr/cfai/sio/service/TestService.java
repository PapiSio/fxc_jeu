package fr.cfai.sio.service;

import java.util.List;

import fr.cfai.sio.business.Test;

public interface TestService {

	
	public Test recupereTestParID(int idTest);

	public List<Test> recupererListeTests();
	
	//Test MM
	public List<Test> recupererListeTestsMM();
	
}
