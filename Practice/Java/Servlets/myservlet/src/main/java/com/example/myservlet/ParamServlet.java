package com.example.myservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "paramServlet",
        urlPatterns = {"/param"}
)
public class ParamServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        if (firstName == null || lastName == null) {
            // print to java console
            System.out.println("no input provided");
            // provide string statement as a response
            out.println("<h2> No parameters provided in URL </h2>");
        } else {
            // print to java console
            System.out.println(firstName + " " + lastName);
            // provide fetched parameters as part of response
            out.println("<h2>" + firstName + "</h2>");
            out.println("<h2>" + lastName + "</h2>");
        }
    }
}
