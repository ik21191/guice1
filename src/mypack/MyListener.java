package mypack;
import javax.servlet.ServletContextEvent;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class MyListener extends GuiceServletContextListener 
{

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		
	}

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		System.out.println("Printing Injector object below......");
		super.contextInitialized(servletContextEvent);
		System.out.println("Printed Injector object.");
	}

	@Override
	protected Injector getInjector() {
		Injector injector = Guice.createInjector(new MyInitModule(),new MyServletModule());
		return injector;
	}
	
}
