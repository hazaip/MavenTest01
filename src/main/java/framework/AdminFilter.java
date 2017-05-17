package framework;

import servlet.AdminPageServlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName="adminFilter", urlPatterns = "/web/admin")
public class AdminFilter implements Filter {
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        servletResponse.setContentType("text/html; charset=UTF-8");
        System.out.println("Admin filter...");

        servletRequest.getServletContext().getRequestDispatcher("/web/login.jsp").include(servletRequest, servletResponse);

        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void init(FilterConfig filterConfig) throws ServletException {
    }
    public void destroy() {
    }
}
