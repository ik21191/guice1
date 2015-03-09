package mypack;

import com.google.inject.AbstractModule;
import com.google.inject.*;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class MyInitModule extends AbstractModule 
{
	public MyInitModule()
	{
		System.out.println("Constructor of MyInitModule called......");
	}
	@Override
	protected void configure() 
	{
		System.out.println("configure() of MyInitModule......");
		bind(Test.class).annotatedWith(Names.named("Impl1")).to(TestImpl1.class);
		bind(Test.class).annotatedWith(Names.named("Impl2")).to(TestImpl2.class);
		//bind(Test.class).to(Key.get(TestImpl3.class,Names.named("objectC")));
		bind(A.class);
		bind(B.class);
	}
	@Provides
	@Named("objectC")
	@Singleton
	public TestImpl3 getC()
	{
		return new TestImpl3();
	}
}
