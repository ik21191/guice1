package mypack;

import com.google.inject.name.Names;
import com.google.inject.servlet.ServletModule;

public class MyServletModule extends ServletModule 
{
	@Override
	protected void configureServlets() 
	{
		serve("*.html").with(Hello2.class);
		serve("/test/*").with(Hello3.class);
		filter("/*").through(Filter1.class);
		bind(Test.class).annotatedWith(Names.named("Impl2")).to(TestImpl2.class);
	}
}
