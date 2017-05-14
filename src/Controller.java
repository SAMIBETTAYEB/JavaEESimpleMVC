

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import test.Person;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/cont")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       PersonOperations po;
   
    public Controller() {
    	po=new PersonOperations();
    }
    
	public void init(ServletConfig config) throws ServletException {
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		Person p=new Person(fname, lname);
		po.addPerson(p);
		request.setAttribute("model", po.getPersons());
		request.getRequestDispatcher("view.jsp").forward(request, response);
	}

}
