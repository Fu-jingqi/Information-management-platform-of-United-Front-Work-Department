package com.servlet;

import com.entity.PersonInfor;
import com.service.PersonInforService;
import com.service.impl.PersonInforServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/GetAllPersonServlet")
public class GetAllPersonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PersonInforService ps1 = new PersonInforServiceImpl() ;
        List<PersonInfor> list1 = ps1.getAllPerson() ;
        req.setAttribute("personList",list1);
        req.getRequestDispatcher("/show.jsp").forward(req,resp);
    }
}
