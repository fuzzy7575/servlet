package com.ohgiraffers.section03.status;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class StatusCodeTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.sendError(404, "없는 페이지 입니다. 경로를 확인해 주세요.");
    }

}
