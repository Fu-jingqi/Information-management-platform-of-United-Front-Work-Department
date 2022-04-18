package com.servlet;

import com.entity.person;
import com.service.PersonService;
import com.service.impl.PersonServiceImpl;

import java.sql.Date;
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
        String strPid = req.getParameter("pid");
        // 2. page
        int page = Integer.parseInt(req.getParameter("page" ));
        // 3. pname
        String pname = req.getParameter("pname") ;
        // 4. pbirth
        String strBir = req.getParameter("pbirth") ;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd") ;
        Date pbir = null;
        try{
            pbir = new Date(sdf.parse(strBir).getTime()) ;
        }catch (ParseException e){
            e.printStackTrace();
        }
        String pwd = req.getParameter("pwd") ;

        PersonService ps = new PersonServiceImpl() ;
        if(strPid != null && !(strPid.equals(""))){
            int pid = Integer.parseInt(strPid) ;
            if(ps.UpdatePersonById(new person(pid,pname,page,pbir,pwd))==1) {
                resp.sendRedirect("/GetAllPersonServlet");
            }
        }else{
            if(ps.AddPerson(new person(pname,page,pbir,pwd)) == 1){
                resp.sendRedirect("/GetAllPersonServlet");
            }
        }
    }
}
