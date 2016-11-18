package fr.cfai.sio.service.impl;

import java.util.ArrayList;
import java.util.List;
import fr.cfai.sio.business.Classification;
import fr.cfai.sio.dao.ClassificationDao;
import fr.cfai.sio.dao.impl.ClassificationDaoImpl;
import fr.cfai.sio.service.ClassificationService;

public class ClassificationServiceImpl implements ClassificationService
{

	private ClassificationDao classificationDaoImpl;

	public ClassificationServiceImpl() throws Exception
	{
		super();
		this.classificationDaoImpl = new ClassificationDaoImpl();
	}


	@Override
	public List<Classification> recupererListeClassifications()
	{

		List<Classification> listeClassifications = new ArrayList<Classification>();

		listeClassifications = classificationDaoImpl.findAllClassifications();

		return listeClassifications;
	}
}
