package fr.cfai.sio.dao;

import java.util.List;
import fr.cfai.sio.business.Classification;

public interface ClassificationDao
{

	public List<Classification> findAllClassifications();

}
