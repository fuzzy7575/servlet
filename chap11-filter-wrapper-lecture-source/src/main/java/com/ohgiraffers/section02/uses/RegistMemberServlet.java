package com.ohgiraffers.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/member/regist")
public class RegistMemberServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userID = request.getParameter("userID");
        String password = request.getParameter("password");
        String name = request.getParameter("name");

        System.out.println("userID : " + userID);
        System.out.println("password : " + password);
        System.out.println("name : " + name);

        PrintWriter out = response.getWriter();
        out.println("<!doctype html");
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + name + "님 가입을 축하합니다~~!</h1>");
        out.println("</body>");
        out.println("</html>");

        out.flush();
        out.close();
    }
}
