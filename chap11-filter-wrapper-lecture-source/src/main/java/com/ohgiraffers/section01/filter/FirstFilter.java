package com.ohgiraffers.section01.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/first/*")
public class FirstFilter implements Filter {

    public FirstFilter() {}

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("Filter init() 메소드 호출됨");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        /* Servlet으로 request가 전될되기 전에 요청을 가로채는 역할을 하는 메소드 */
        System.out.println("Filter doFilter() 메소드 호출됨");
        /* ----- 필터에서 처리할 코드 ----- */

        /* 필터 처리 이후 다음 필터 또는 Servlet의 doGet/doPost를 호출한다. */
        filterChain.doFilter(servletRequest, servletResponse);

        /* servlet 처리 후에 수행할 내용 작성 */
        System.out.println("doFilter() 호출 이후 ... Servlet 요청 수행 완료!");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        System.out.println("Filter destroy() 메소드 호출됨");
    }

}
