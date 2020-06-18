package com.ning4256.springboot.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "FirstFilter", urlPatterns = {"*.do", "*.jsp"})
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入Fist Filter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("离开Fist Filter");
    }

    @Override
    public void destroy() {

    }
}
