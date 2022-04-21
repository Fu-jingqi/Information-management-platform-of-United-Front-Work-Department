package com.servlet;

import com.service.PersonService;
import com.service.impl.PersonServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final String driver = "com.mysql.jdbc.Driver";// 数据库驱动
    private static final String url = "jdbc:mysql://localhost:3306/empinfor?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";   //"login"是指你的数据库名称 3306是端口
    private static final String username = "root";         //  数据库用户名
    private static final String password = "fjq72110902";         //  数据库密码
//    private static java.sql.Connection conn = null;                 //  连接对象

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doPost(req, resp);
        resp.getWriter().write("POST Method");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String pname = req.getParameter("pname") ;
        String pwd = req.getParameter("pwd");
        PersonService ps = new PersonServiceImpl() ;
        if(ps.login(pname,pwd)){
//            req.getSession().setAttribute("username",pname);
//            req.getRequestDispatcher("/login_success.jsp").forward(req,resp);
            req.getSession().setAttribute("pname",pname);
            resp.sendRedirect("GetAllPersonServlet");
        }else {
            req.getRequestDispatcher("/login_failed.jsp").forward(req,resp);
        }
//        resp.getWriter().write(name + " " + pwd) ;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(url, username, password);
//            String sql = "SELECT * FROM person where pname = ? and pwd = ?" ;
//            PreparedStatement prd = conn.prepareStatement(sql) ;
//            prd.setString(1,name);
//            prd.setString(2,pwd);
//
//            ResultSet rs = prd.executeQuery() ;
//            boolean flag = false ;
//            while(rs.next()){
//                flag = true ;
//            }
//            if(flag) {
//                System.out.println("登录成功");
//            }else{
//                System.out.println("登录失败");
//            }
//
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
//        resp.getWriter().write("GET Method");
    }

}
