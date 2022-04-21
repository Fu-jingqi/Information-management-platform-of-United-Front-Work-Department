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
    <script type="text/javascript" src="js/jquery-3.4.1.min.js" ></script>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    <link rel="stylesheet" href="css/bootstrap.css">
    <style>
        .bigBoxJ{
            width: 580px;
        }
    </style>
</head>
<center>
    <body>
    <form action="<%=path%>/DoUpdateOrAddPersonServlet">
        <div class="bigBoxJ">
            请输入新增人员的信息
            <input type="text" name = "pid" readonly="readonly" hidden="hidden" value="${person.pid}"><br>
            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon1">人员姓名</span>
                <input type="text" class="form-control" placeholder="人员姓名" aria-describedby="sizing-addon1" name = "pname" value="${person.pname}">
            </div>

            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon2">性别</span>
                <input type="text" class="form-control" placeholder="性别" aria-describedby="sizing-addon1"  name = "psex" value="${person.psex}" >
            </div>

            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon3">出生年月日</span>
                <input type="date" class="form-control" placeholder="出生年月日" aria-describedby="sizing-addon1"  name="pbirth" value="${person.pbirth}" >
            </div>

            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon4">民族</span>
                <input type="text" class="form-control" placeholder="民族" aria-describedby="sizing-addon1"  name="pnational" value="${person.pnational}">
            </div>

            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon5">籍贯</span>
                <input type="text" class="form-control" placeholder="籍贯" aria-describedby="sizing-addon1"  name="pnativeplace" value="${person.pnativeplace}">
            </div>

            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon6">政治面貌</span>
                <input type="text" class="form-control" placeholder="政治面貌(没有请填无)" aria-describedby="sizing-addon1"  name="ppoliticalstatus" value="${person.ppoliticalstatus}">
            </div>

            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon7">工作单位</span>
                <input type="text" class="form-control" placeholder="工作单位" aria-describedby="sizing-addon1" name="pworkplace" value="${person.pworkplace}">
            </div>

            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon8">职称</span>
                <input type="text" class="form-control" placeholder="职称(没有请填无)" aria-describedby="sizing-addon1" name="pzhicheng" value="${person.pzhicheng}">
            </div>

            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon9">学历</span>
                <input type="text" class="form-control" placeholder="学历" aria-describedby="sizing-addon1" name="pxueli" value="${person.pxueli}">
            </div>

            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon10">现任职务</span>
                <input type="text" class="form-control" placeholder="现任职务" aria-describedby="sizing-addon1" name="pcurrentposition" value="${person.pcurrentposition}">
            </div>

            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon11">社会职务</span>
                <input type="text" class="form-control" placeholder="社会职务(没有请填无)" aria-describedby="sizing-addon1" name="psocialwork" value="${person.psocialwork}">
            </div>


            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon12">参加工作时间</span>
                <input type="date" class="form-control" placeholder="参加工作时间" aria-describedby="sizing-addon1" name="pjoinworktime" value="${person.pjoinworktime}">
            </div>

            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon13">加入党派时间</span>
                <input type="date" class="form-control" placeholder="加入党派时间" aria-describedby="sizing-addon1" name="pjoinpartytime" value="${person.pjoinpartytime}">
            </div>

            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon14">获得荣誉</span>
                <input type="text" class="form-control" placeholder="获得荣誉(没有请填无)" aria-describedby="sizing-addon1" name="phonor" value="${person.phonor}">
            </div>

            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon15">培训情况</span>
                <input type="text" class="form-control" placeholder="培训情况(没有请填无)" aria-describedby="sizing-addon1" name="ptraining" value="${person.ptraining}">
            </div>

            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon16">参政议政情况</span>
                <input type="text" class="form-control" placeholder="参政议政情况(没有请填无)" aria-describedby="sizing-addon1" name="pcanzhengyizheng" value="${person.pcanzhengyizheng}">
            </div>

            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon17">联系方式</span>
                <input type="text" class="form-control" placeholder="联系方式" aria-describedby="sizing-addon1" name="pcontactnum" value="${person.pcontactnum}">
            </div>

            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon18">备注</span>
                <input type="text" class="form-control" placeholder="备注(没有请填无)" aria-describedby="sizing-addon1" name="pinfor" value="${person.pinfor}">
            </div>
            <div class="well well-sm">
                <input class="btn btn-primary" type="submit" value="Submit">
            </div>
        </div>
        <%--    <select>--%>
        <%--        <option value="">选项一</option>--%>
        <%--        <option value="">选项二</option>--%>
        <%--        <option value="">选项三</option>--%>
        <%--        <option value="">选项四</option>--%>
        <%--    </select>--%>
        <%--    <input type="submit" value="Submit">--%>
<%--        <div class="well well-sm">--%>
<%--            <input class="btn btn-primary" type="submit" value="Submit">--%>
<%--        </div>--%>
    </form>
    </body>
</center>
</html>
