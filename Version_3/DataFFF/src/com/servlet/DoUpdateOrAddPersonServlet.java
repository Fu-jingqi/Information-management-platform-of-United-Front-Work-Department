package com.servlet;

import com.entity.person;
import com.service.PersonService;
import com.service.impl.PersonServiceImpl;

import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebServlet("/DoUpdateOrAddPersonServlet")
public class DoUpdateOrAddPersonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. pid
        int pid = Integer.parseInt(req.getParameter("pid")) ;
        // 2. page
        int page = Integer.parseInt(req.getParameter("page" ));
        // 3. pname
        String pname = req.getParameter("pname") ;
        // 4. pbirth
        String pbirth = req.getParameter("pbirth") ;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd") ;
        Date date = new Date() ;
        try {
            date = sdf.parse(pbirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date sDate = new java.sql.Date(date.getTime()) ;
        // 5. pwd
        String pwd = req.getParameter("pwd");

        PersonService ps = new PersonServiceImpl() ;
        person person = new person(pid,pname,page,sDate,pwd) ;
        int result = ps.UpdatePersonById(person) ;

        if(result == 1){
            resp.sendRedirect("/GetAllPersonServlet");
        }else{
            resp.sendRedirect("/error.jsp");
        }
    }
}
