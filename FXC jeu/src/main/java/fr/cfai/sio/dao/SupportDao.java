package fr.cfai.sio.dao;

import java.util.List;
import fr.cfai.sio.business.Support;

public interface SupportDao
{

	public Support findSupportById(int idSupport);

	public List<Support> findAllSupports();
}
