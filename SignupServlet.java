
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignupServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Validate vc = new Validate();

		if (vc.checkname(request.getParameter("name")) == true
				&& vc.checkemail(request.getParameter("email")) == true
				&& vc.checkpassword(request.getParameter("password")) == true
				&& vc.checkdob(request.getParameter("dob")) == true
				&& vc.checkgender(request.getParameter("gender")) == true) {
			Store sc = new Store();
			try {
				if (sc.insertuser(request.getParameter("name"),
						request.getParameter("email"),
						request.getParameter("password"),
						request.getParameter("dob"),
						request.getParameter("gender")) == true) {
					response.sendRedirect("Success.jsp");
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		else {
			response.sendRedirect("Failure.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
