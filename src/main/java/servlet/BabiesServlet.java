package servlet;

import framework.*;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/web/", "/web/babies"})
public class BabiesServlet extends HttpServlet {

    @EJB
    BabyService babyService;

    @EJB
    UserDao userDao;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getRemoteUser();

        req.setAttribute("babies", babyService.getBabies(username));

        resp.setContentType("text/html; charset=UTF-8");
        req.getRequestDispatcher("/web/babies.jsp").include(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        EGender gender = req.getParameter("add") != null && req.getParameter("add").equals("boy") ? EGender.BOY : EGender.GIRL;
        String name = req.getParameter("name");
        User parent = userDao.getUser(req.getRemoteUser());
        babyService.addBaby(name, gender, parent);

        resp.sendRedirect(req.getContextPath() + "/web/babies");
    }
}
