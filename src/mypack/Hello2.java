package mypack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import check.CheckParameter1;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.google.inject.servlet.GuiceFilter;

/**
 * Servlet implementation class Hello
 */
@Singleton
public class Hello2 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
				// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		System.out.println("Executing Hello2 Servlet......completed.");
		boolean f=CheckParameter1.checkParam(request);
		if(f)
		out.println("Response of servlet Hello2. Authenticated");
		else
		out.println("Response of servlet Hello2. Invalid");
		Injector injector=(Injector)request.getSession().getServletContext().getAttribute(constant.Contants.INJECTOR_NAME);
		//Test t=injector.getInstance(Test.class);
		//t.test();
		out.close();
	}
}
