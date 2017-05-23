package example;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * Created by AGDS on 5/23/2017.
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        //It will check weither username or password is correct

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println(System.getProperty("user.dir"));
        try {
            if (username.equals("java") && password.equals("1234")) {
                //Go to member's page
                RequestDispatcher dispatcher = request.getRequestDispatcher("member.jsp");
                dispatcher.forward(request, response);

            } else {
                //Go to error page
                RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
                dispatcher.forward(request, response);
            }
        } catch (Exception e) {
        }


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
