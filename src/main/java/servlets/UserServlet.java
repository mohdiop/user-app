package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 1615373366162040045L;
	
	private ArrayList<User> users;
	
	@Override
	public void init() throws ServletException {
		users = new ArrayList<User>();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Bonjour");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom").toString();
		String email = request.getParameter("email").toString();
		if(nom.isBlank()) {
			System.out.println("Le champ nom est vide!");
		}
		if(email.isBlank()) {
			System.out.println("Le champ email est vide!");
		}
		HttpSession session = request.getSession();
		User user = new User(
				nom,
				email
				);
		users.add(user);
		session.setAttribute("users", users);
		session.setAttribute("currentUser", user);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/userDetails.jsp");
		requestDispatcher.forward(request, response);
		request.getMethod();
	}

}
