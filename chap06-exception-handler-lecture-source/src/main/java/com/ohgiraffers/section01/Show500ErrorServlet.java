package com.ohgiraffers.section01;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class Show500ErrorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendError(500,"서버 내부 오류");
    }

}
