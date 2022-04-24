package com.servlet;

import com.entity.PersonInfor;
import com.service.PersonInforService;
import com.service.impl.PersonInforServiceImpl;
import com.util.PageHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/GetAllPersonByPageServlet")
public class GetAllPersonByPageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String strPageNo = req.getParameter("pageNo") ;
        if(strPageNo == null){
            strPageNo = "1" ;
        }
        PageHelper ph = new PageHelper() ;
        ph.setPageNo(Integer.parseInt(strPageNo));
        PersonInforService ps = new PersonInforServiceImpl() ;
        ph.setPageSize(8);
        ph.setDataCount(ps.GetPersonCount());

        int pageCount = ph.getPageCount() ;
        ph.setPageCount(pageCount);

        List<PersonInfor> list = ps.getPersonByPage(ph.getPageNo(),ph.getPageSize()) ;
        req.setAttribute("list",list);
        req.setAttribute("ph",ph);
        req.getRequestDispatcher("/show.jsp").forward(req,resp);
    }
}
