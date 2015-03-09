package check;

import javax.servlet.http.HttpServletRequest;

public class CheckParameter1 
{
	public static boolean checkParam(HttpServletRequest req)
	{
		boolean flag=false;
		String name=req.getParameter("name");
		if(name!=null)
		{
			if(name.equalsIgnoreCase("abc"))
			flag=true;
			else
			flag=false;
		}
		return flag;
	}
}
