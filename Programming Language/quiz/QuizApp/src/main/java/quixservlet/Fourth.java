package quixservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Fourth
 */
@WebServlet("/Fourth")
public class Fourth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fourth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw =response.getWriter();
		pw.println("Hello");
		int score =0;
		HttpSession session = request.getSession();
		String ans4 = request.getParameter("q4");
		int sc=(int)session.getAttribute("sc");
		if(ans4 != null) {
		if(ans4.equalsIgnoreCase("main()"))
		{
			sc++;
			session.setAttribute("sc",sc);
			response.sendRedirect("Fifth.html");
		}
		else
		{
		session.setAttribute("sc",sc);
		response.sendRedirect("Fifth.html");
		}
		}
		else
		{
		session.setAttribute("sc",sc);
		response.sendRedirect("Fifth.html");	
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
