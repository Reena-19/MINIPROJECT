import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;



/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet2 extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
response.getWriter().append("Served at: ").append(request.getContextPath());
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String email = request.getParameter("email");
    String pass = request.getParameter("pass");
    LoginDoa db = new LoginDoa(email,pass);

    if (db.signin()) {
        RequestDispatcher req = request.getRequestDispatcher("WordPuzzle.html");
        req.forward(request, response);
    } else {
        RequestDispatcher req = request.getRequestDispatcher("login.jsp");
        req.forward(request, response);
    }

    doGet(request, response);
}
}

