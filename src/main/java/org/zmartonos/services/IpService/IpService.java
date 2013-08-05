package org.zmartonos.services.IpService;

import org.apache.log4j.Logger;
import org.zmartonos.zlib.service.GenericService;
import org.zmartonos.zlib.utils.Utils;

public class IpService extends GenericService {
	private Logger log= Logger.getLogger(IpService.class.getName());
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
		log.info("Public ip is: "+publicIp);
	}
}
