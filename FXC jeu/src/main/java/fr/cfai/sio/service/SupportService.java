package fr.cfai.sio.service;

import java.util.List;
import fr.cfai.sio.business.Support;

public interface SupportService
{
	public Support recupererSupportParId(int idSupport);

	public List<Support> recupererListeSupports();
}
