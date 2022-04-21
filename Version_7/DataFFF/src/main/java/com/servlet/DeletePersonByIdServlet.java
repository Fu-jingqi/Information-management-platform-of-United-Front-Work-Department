package com.servlet;

import com.entity.PersonInfor;
import com.service.PersonInforService;
import com.service.PersonService;
import com.service.impl.PersonInforServiceImpl;
import com.service.impl.PersonServiceImpl;
import com.util.ConnUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/DeletePersonByIdServlet")
public class DeletePersonByIdServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String strPid = req.getParameter("pid") ;
        int pid = 0 ;
        if(strPid!=null){
            pid=Integer.parseInt(strPid) ;
        }
        PersonInforService ps = new PersonInforServiceImpl() ;
        if(ps.delPersonById(pid) == 1){
            String sss = "ALTER TABLE workpersoninfor AUTO_INCREMENT = 1" ;
            Connection conn = ConnUtil.getConn() ;
            try {
                Statement stat = conn.createStatement() ;
                stat.execute(sss) ;
            } catch (SQLException e) {
                e.printStackTrace();
            }

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
