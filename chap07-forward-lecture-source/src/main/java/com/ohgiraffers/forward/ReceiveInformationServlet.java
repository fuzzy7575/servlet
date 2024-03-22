package com.ohgiraffers.forward;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/forward")
public class ReceiveInformationServlet extends HttpServlet {

    /*
    * forward 받은 서블릿에서도 요청 방식이 get이면 doGet 메소드를, post이면 doPost 메소드를 호출한다.
    * 보내준 서블릿에서 request에 전달 정보를 담았으므로 해당 서블릿에서 사용하기 위해 다시 request에서 꺼내온다.
    *  */

    /*
    * firward할 때 전달한 request와 reponse의 모든 정보를 이용해 새로운 request와 reponse를 만들고
    * 그 정보를 이용해 다시 http메소드에 맞는 서블릿의 doGet 혹은 doPost를 요청하는 방식이다.
    * 깊은 복사를 이용해 값을 그대로 복사했기 때문에 내부에 존재하는 헤더 정보나 인스턴스는 그대로 유지하고 있다.
    * */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userID = request.getParameter("userID");
        String password = request.getParameter("password");

        System.out.println("userID = " + userID);
        System.out.println("password = " + password);

        /*
         어떤 서블릿으로 위임할 것인지 대상 서블릿을 지정하는 인스턴스(RequestDispatcher)를 생성하고
         forward() 메소드를 통해 요청과 응답에 대한 정보를 전달하여 나머지 작업을 수행하도록 '위임' 한다.
         이때 다른 서블릿으로 요청하기 위한 데이터는 request에 setAttribute()로 전달하여 받
         받는 쪽에서 getAttribute()로 꺼내 쓰도록 한다.
         */

        request.setAttribute("userID", userID);


        RequestDispatcher rd = request.getRequestDispatcher("print");
        rd.forward(request, response);
    }
}
