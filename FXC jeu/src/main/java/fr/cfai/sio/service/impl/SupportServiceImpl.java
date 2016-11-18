package fr.cfai.sio.service.impl;

import java.util.ArrayList;
import java.util.List;
import fr.cfai.sio.business.Support;
import fr.cfai.sio.dao.SupportDao;
import fr.cfai.sio.dao.impl.SupportDaoImpl;
import fr.cfai.sio.service.SupportService;

public class SupportServiceImpl implements SupportService
{
	private SupportDao supportDaoImpl;
	
	public SupportServiceImpl()  throws Exception
	{
		super();
		this.supportDaoImpl = new SupportDaoImpl();
	}

	@Override
	public List<Support> recupererListeSupports()
	{
		List<Support> listeSupport = new ArrayList<Support>();

		listeSupport = supportDaoImpl.findAllSupports();

		return listeSupport;
	}

	@Override
	public Support recupererSupportParId(int idSupport)
	{
		Support support;

		support = supportDaoImpl.findSupportById(idSupport);

		return support;
	}

}
