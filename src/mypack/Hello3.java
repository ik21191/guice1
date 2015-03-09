package mypack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.*;
import com.google.inject.name.Names;
import com.google.inject.servlet.GuiceFilter;

/**
 * Servlet implementation class Hello
 */
@Singleton
public class Hello3 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
				// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		System.out.println("Executing Hello3 Servlet......completed.");
		out.println("Response of servlet Hello3.");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&");
		Injector injector=(Injector)request.getSession().getServletContext().getAttribute(constant.Contants.INJECTOR_NAME);
		Test a=(Test)injector.getInstance(Key.get(Test.class,Names.named("Impl2")));
		//Test c=(Test)injector.getInstance(Key.get(Test.class,Names.named("objectC")));
		System.out.println("********************");
		a.test();
		//c.test();
		out.close();
	}
}
