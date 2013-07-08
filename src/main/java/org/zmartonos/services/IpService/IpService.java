package org.zmartonos.services.IpService;

import org.zmartonos.zlib.service.GenericService;
import org.zmartonos.zlib.utils.Utils;

public class IpService extends GenericService {
	/**
	 * 
	 */
	public IpService(){
		super();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.zmartonos.zlib.service.GenericService#work()
	 */
	public void work()throws Exception{
		String publicIp= Utils.getPublicIp();
		System.out.println("Public ip is: "+publicIp);
	}
}
