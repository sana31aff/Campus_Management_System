package com.campus.filter;

import java.io.IOException;



@WebFilter ("/*")
public class LogginFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws IOException, ServletException {
       System.out.println("Request received");
       Chain.doFilter(request, response);
       System.out.println("Response sent");
    }
    
}
