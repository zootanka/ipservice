package org.zmartonos.services.IpService;

/**
 * Hello world!
 *
 */
public class App {
	private IpService service;
	private Thread runner;
	
	public App(){
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
	
    public static void main( String[] args )
    {
        App app= new App();
        app.startService();
    }
}
