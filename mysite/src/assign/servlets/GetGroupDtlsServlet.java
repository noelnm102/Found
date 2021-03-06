package assign.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import assign.dbaccess.Group;
import assign.dbaccess.EMailDBAccess;
import assign.dbaccess.EMailBO;
import assign.dbaccess.EMailValidationException;

/*
 * Get Email Address Servlet 
 */

public class GetGroupDtlsServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
	String errors = "";
	String groupID = request.getParameter("groupid");
        response.setContentType("text/html");

	EMailBO eMailBO = new EMailBO();
	Group group = null;

	try{
	    group = eMailBO.getGroup(groupID);
	    
	    System.out.println("Inside GetGroupDTLS"+group.getgroupID()+"   " +group.getgName());
	}catch (EMailValidationException emve){
		errors = emve.getErrorMessage();
	} 
	catch (Exception e){
		e.printStackTrace();
	}
	if (errors.equals("")){
		//request.getSession().setAttribute("group", group);
		request.setAttribute("group", group);
		RequestDispatcher rd = (RequestDispatcher) request.getRequestDispatcher("/viewbygroupsuccess.jsp");
		rd.forward(request, response);
	//	response.sendRedirect("/mysite/viewbygroupsuccess.jsp");	

	}
	else {
		System.out.println(request.getRequestURI());
		request.getSession().setAttribute("Errors", errors);
		response.sendRedirect("/mysite/viewgroup.jsp");
	}
    }

    public void doPost(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        doGet(request, response);
    }

}

