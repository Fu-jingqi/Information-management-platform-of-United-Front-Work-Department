<%--
  Created by IntelliJ IDEA.
  User: 10706
  Date: 2022/4/15
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String name = request.getParameter("username") ;
        String psw = request.getParameter("password") ;
        // 转发的特点
        // 1.一次请求
        // 2.地址栏不发生改变
        // 3.这个操作是服务器段进行的
        // 4.转发是在当前请求的基础上进行转发的，所以只能转发到本项目的页面
        if(name.equals("admin") && psw.equals("123456")){
             RequestDispatcher requestDispatcher = request.getRequestDispatcher("login_success.jsp");
             requestDispatcher.forward(request,response);
            // request.setAttribute("username",name) ;
            // 重定向
            // 1.地址栏会发生改变
            // 2.重定向是两次请求，所以我们放在第一个请求对象的内容无法直接获取
            // 3.重定向是客户端的操作
            // 4.因为是两次请求 所以我们放在request作用域的内容，无法获取
            // 5.地址栏必须是绝对路径
            // session.setAttribute("username",name) ;
            // session 表示会话作用域
            // response.sendRedirect("/DataDemo/login_success.jsp");
        }else{
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("login_failed.jsp");
            requestDispatcher.forward(request,response);
        }
    %>
</body>
</html>
