
package servlets;

import Classes.AccountService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {


 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/login.jsp")
                    .forward(request, response);
       HttpSession session = request.getSession();
       String check = request.getParameter("logout");
        
       if (check != null) {
           session.invalidate();
           request.setAttribute("message", "You have successfully logged out.");
           getServletContext().getRequestDispatcher("/login.jsp")
                    .forward(request, response);
           
       }
    }

  
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String username = request.getParameter("username");
       String password = request.getParameter("password");
       HttpSession session = request.getSession();
      if (username.equals("") || password.equals("")){
          request.setAttribute("message", "You must not leave any field blank.");
          getServletContext().getRequestDispatcher("/login.jsp")
                    .forward(request, response);
          return;
      } else {
          AccountService user = new AccountService();
          
           if(user.login(username, password) == true) {
               user.setUsername(username);
               user.setPassword(password);
               session.setAttribute("username", user.getUsername());
               response.sendRedirect("home.jsp"); 
           } else {
               request.setAttribute("message", "You have entered the wrong credentials.");
               request.setAttribute("username", username);
               request.setAttribute("password", password);
          getServletContext().getRequestDispatcher("/login.jsp")
                    .forward(request, response);
               
               
           }
    }

  

}
}
