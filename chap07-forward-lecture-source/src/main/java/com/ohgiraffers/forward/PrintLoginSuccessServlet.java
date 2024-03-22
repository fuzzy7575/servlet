package com.ohgiraffers.forward;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/print")
public class PrintLoginSuccessServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userID = request.getParameter("userID");

        StringBuilder responseText = new StringBuilder();
        responseText.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h3 align=\"center\">\n")
                .append(userID)
                .append("님 환영합니다.<h3>\n")
                .append("</body>\n")
                .append("</html>\n");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.print(responseText.toString());

        out.flush();
        out.close();
    }
}
