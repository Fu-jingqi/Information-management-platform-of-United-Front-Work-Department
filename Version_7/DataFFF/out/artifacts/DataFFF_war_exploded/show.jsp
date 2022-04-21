<%--
  Created by IntelliJ IDEA.
  User: 10706
  Date: 2022/4/17
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%
    String path = request.getContextPath() ;
%>
<html>
<head>
    <title>Title</title>

</head>

<script type="text/javascript">
    function gotoReg(){
        location.href = "/modify.jsp"
    }
</script>

<center>
    <body style="text-align: center">
    <%
        //      这里用于显示数据
        request.getAttribute("list") ;
    %>
    <div style="height: 50px">
        欢迎你${pname}
    </div>
    <div><input type="button" value="注册" onclick="gotoReg()"></div>
    <hr/>
    <table>
        <tr>
            <td>人员编号</td>
            <td>人员姓名</td>
            <td>年龄</td>
            <td>生日</td>
            <td>密码</td>
        </tr>
        <c:forEach items="${personList}" var = "person">
            <tr>
                <td>${person.pid}</td>
                <td>${person.pname}</td>
                <td>${person.page}</td>
                <td>${person.pbirth}</td>
                <td>${person.pwd}</td>
                <td><a href="<%=path%>/undatePersonServlet?pid=${person.pid}">修改</a></td>
                <td><a href="<%=path%>/DeletePersonByIdServlet?pid=${person.pid}" onclick="if(confirm('是否确定删除？')===false)return false">删除</a></td>
            </tr>
        </c:forEach>
    </table>
    </body>
</center>
</html>
