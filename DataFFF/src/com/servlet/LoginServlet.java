package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final String driver = "com.mysql.jdbc.Driver";// 数据库驱动
    private static final String url = "jdbc:mysql://localhost:3306/book?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";   //"login"是指你的数据库名称 3306是端口
    private static final String username = "root";         //  数据库用户名
    private static final String password = "fjq72110902";         //  数据库密码
    private static java.sql.Connection conn = null;                 //  连接对象

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doPost(req, resp);
        resp.getWriter().write("POST Method");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username") ;
        String pwd = req.getParameter("password");
        resp.getWriter().write(name + " " + pwd) ;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver") ;
            conn = DriverManager.getConnection(url, username, password);
            String sql = "SELECT * FROM person where pname = ? and pwd = ?" ;
            PreparedStatement prd = conn.prepareStatement(sql) ;
            prd.setString(1,name);
            prd.setString(2,pwd);

            ResultSet rs = prd.executeQuery() ;
            boolean flag = false ;
            while(rs.next()){
                flag = true ;
            }
            if(flag) {
                resp.getWriter().write("登录成功");
            }else{
                resp.getWriter().write("登录失败");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        resp.getWriter().write("GET Method");
    }

}
