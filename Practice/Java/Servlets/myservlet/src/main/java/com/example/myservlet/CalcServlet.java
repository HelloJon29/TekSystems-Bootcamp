package com.example.myservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "CalcServlet",
        urlPatterns = {"/calc"}
)
public class CalcServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String x = request.getParameter("x");
        String y = request.getParameter("y");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        if (x == null || y == null) {
            // print to java console
            System.out.println("Missing input");
            // provide string statement as a response
            out.println("<h2> Missing parameters in URL </h2>");
        } else {
            // Parse String x and y into int type
            int x1 = Integer.parseInt(x);
            int y1 = Integer.parseInt(y);

            // provide fetched parameters as part of response
            out.println("<h2>" + "Addition: " + (x1+y1) + "</h2>");
            out.println("<h2>" + "Multiplication : " + (x1*y1) + "</h2>");
        }
    }
}
