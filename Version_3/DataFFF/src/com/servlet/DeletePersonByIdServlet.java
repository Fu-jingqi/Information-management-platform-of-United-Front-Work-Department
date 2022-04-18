package com.servlet;

import com.service.PersonService;
import com.service.impl.PersonServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/DeletePersonByIdServlet")
public class DeletePersonByIdServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Integer.parseInt(req.getParameter("pid"))  ;
        String strPid = req.getParameter("pid") ;
        int pid = 0 ;
        if(strPid!=null){
            pid=Integer.parseInt(strPid) ;
        }
        PersonService ps = new PersonServiceImpl() ;
        if(ps.delPersonById(pid) == 1){
//            req.getRequestDispatcher("/show.jsp").forward(req,resp);
            resp.sendRedirect("/GetAllPersonServlet");
        }else{
            req.getRequestDispatcher("/error.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
