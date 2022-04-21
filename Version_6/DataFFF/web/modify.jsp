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
<center>
    <body>
    <form action="<%=path%>/DoUpdateOrAddPersonServlet">
        人员编号：<input type="text" name = "pid" readonly="readonly" hidden="hidden" value="${person.pid}"><br>
        人员姓名：<input type="text" name = "pname" value="${person.pname}"><br>
        性别：<input type="text" name = "psex" value="${person.psex}"><br>
        出生年月日：<input type="date" name="pbirth" value="${person.pbirth}"><br>
        民族：<input type="text" name="pnational" value="${person.pnational}"><br>
        籍贯：<input type="text" name="pnativeplace" value="${person.pnativeplace}"><br>
        政治面貌：<input type="text" name="ppoliticalstatus" value="${person.ppoliticalstatus}"><br>
        工作单位：<input type="text" name="pworkplace" value="${person.pworkplace}"><br>
        职称：<input type="text" name="pzhicheng" value="${person.pzhicheng}"><br>
        学历：<input type="text" name="pxueli" value="${person.pxueli}"><br>
        现任职务：<input type="text" name="pcurrentposition" value="${person.pcurrentposition}"><br>
        社会职务：<input type="text" name="psocialwork" value="${person.psocialwork}"><br>
        参加工作时间：<input type="date" name="pjoinworktime" value="${person.pjoinworktime}"><br>
        加入党派时间：<input type="date" name="pjoinpartytime" value="${person.pjoinpartytime}"><br>
        获得荣誉：<input type="text" name="phonor" value="${person.phonor}"><br>
        培训情况：<input type="text" name="ptraining" value="${person.ptraining}"><br>
        参政议政情况：<input type="text" name="pcanzhengyizheng" value="${person.pcanzhengyizheng}"><br>
        联系方式：<input type="text" name="pcontactnum" value="${person.pcontactnum}"><br>
        备注 ：<input type="text" name="pinfor" value="${person.pinfor}"><br>
        <%--    <select>--%>
        <%--        <option value="">选项一</option>--%>
        <%--        <option value="">选项二</option>--%>
        <%--        <option value="">选项三</option>--%>
        <%--        <option value="">选项四</option>--%>
        <%--    </select>--%>
        <%--    <input type="submit" value="Submit">--%>
        <input class="btn btn-primary" type="submit" value="Submit">
    </form>
    </body>
</center>
</html>
