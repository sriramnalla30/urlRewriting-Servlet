package myserv2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String userName = request.getParameter("uname");
            out.print("Hello " + userName);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
