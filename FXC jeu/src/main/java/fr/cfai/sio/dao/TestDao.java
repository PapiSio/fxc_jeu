package fr.cfai.sio.dao;

import java.util.List;

import fr.cfai.sio.business.Test;

public interface TestDao {

		public Test findTestById(int idTest);

		public List<Test> findAllTest();
	
}
