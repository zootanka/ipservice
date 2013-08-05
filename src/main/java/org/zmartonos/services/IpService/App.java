package org.zmartonos.services.IpService;

import org.apache.log4j.PropertyConfigurator;
import org.zmartonos.zlib.utils.Utils;

/**
 * Hello world!
 *
 */
public class App {
	private IpService service;
	private Thread runner;
	
	public App(){
		PropertyConfigurator.configure("/home/zootanka/jworkspace/IpService/src/main/resources/log4j.properties");
	}
	
	private void createService(){
		service= new IpService();
		runner= new Thread(service);
		service.setSleepInterval(2000);
	}
	
	public void startService(){
		createService();
		runner.start();
	}
	
	public void stopService(){
		service.stop();
		while (service.hasStopped())
			Utils.sleep(3000);
	}
	
    public static void main( String[] args )
    {
        App app= new App();
        app.startService();
    }
}
