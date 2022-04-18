<%--
  Created by IntelliJ IDEA.
  User: 10706
  Date: 2022/4/18
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath() ;
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="<%=path%>/DoUpdatePersonServlet">
<%--        人员编号：<input type="text" name = "pid" readonly="readonly" value="${person.pid}"><br>--%>
        人员编号：<input type="text" name = "pid" value="${person.pid}"><br>
        用户名：<input type="text" name = "pname" value="${person.pname}"><br>
        年龄：<input type="text" name= "page" value="${person.page}"><br>
        生日：<input type="date" name="pbirth" value="${person.pbirth}"><br>
        密码：<input type="text" name="pwd" value="${person.pwd}"><br>
        <select>
            <option value="">选项一</option>
            <option value="">选项二</option>
            <option value="">选项三</option>
            <option value="">选项四</option>
        </select>
        <input type="submit" value="Submit">
    </form>

</body>
</html>
