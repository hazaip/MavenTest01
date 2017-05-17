package framework;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebFilter(filterName="menuFilter", urlPatterns = "/web/*")
public class MenuFilter implements Filter {
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        servletResponse.setContentType("text/html; charset=UTF-8");
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String root = servletRequest.getServletContext().getContextPath();
        List<Menu> menus = new ArrayList<Menu>();
        menus.add(new Menu("Babák", root + "/web/babies"));
        menus.add(new Menu("Statisztikák", root + "/web/statistics"));
        menus.add(new Menu("Kijelentkezés", root + "/logout"));

        req.setAttribute("menu", menus);
        req.getServletContext().getRequestDispatcher("/WEB-INF/menu.jsp").include(servletRequest, servletResponse);

        filterChain.doFilter(servletRequest, servletResponse);
    }


    public void init(FilterConfig filterConfig) throws ServletException {
    }
    public void destroy() {
    }
}
