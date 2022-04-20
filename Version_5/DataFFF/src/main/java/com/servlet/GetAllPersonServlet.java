package com.servlet;

import com.entity.person;
import com.service.PersonService;
import com.service.impl.PersonServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.io.IOException;
@WebServlet("/GetAllPersonServlet")
public class GetAllPersonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PersonService ps = new PersonServiceImpl() ;
        List<person> list = ps.getAllPerson() ;
        req.setAttribute("personList",list);
        req.getRequestDispatcher("/show.jsp").forward(req,resp);

    }
}
