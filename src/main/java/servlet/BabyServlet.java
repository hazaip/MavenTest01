package servlet;


import framework.BabyService;
import framework.WeightDataDao;
import framework.WeightDataService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(urlPatterns = "/web/babies/baby")
public class BabyServlet extends HttpServlet{

    @EJB
    BabyService babyService;

    @EJB
    WeightDataService weightDataService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        req.setAttribute("baby", babyService.getBaby(id));
        req.setAttribute("dataset", weightDataService.getWeightData(id));

        resp.setCharacterEncoding("UTF-8");

        req.getRequestDispatcher("/web/baby.jsp").include(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getParameter("id");
        req.getParameter("weight");
        Date date = new Date();


    }
}
