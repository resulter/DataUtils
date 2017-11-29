<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/11/24
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/taglib.jsp"%>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;
    %>
    <base href="<%=basePath%>" >
    <link href="static/js/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="static/js/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <script type="text/javascript" src="static/js/jquery-1.12.4.min.js"></script>
    <link rel="stylesheet" href="jqueryui/style.css">
    <link rel="stylesheet" href="//apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
    <script src="//apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
    <script src="//apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>


    <link href="static/css/basic.css" rel="stylesheet" type="text/css">
    <link href="static/css/style.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="static/js/menu.js"></script>
    <title>BS_Area</title>

    <script>
        $(function () {
            $("#from").datepicker({
                defaultDate: "+1w",
                changeMonth: true,
                numberOfMonths: 1,
                onClose: function (selectedDate) {
                    $("#from").datepicker("option", "dateFormat", "yy-mm-dd");
                    $("#to").datepicker("option", "minDate", selectedDate);
                }
            });
            $("#to").datepicker({
                defaultDate: "+1w",
                changeMonth: true,
                numberOfMonths: 1,
                onClose: function (selectedDate) {
                    $("#to").datepicker("option", "dateFormat", "yy-mm-dd");
                    $("#from").datepicker("option", "maxDate", selectedDate);
                }
            });


        });
    </script>
</head>
<body background="red">
<!-- Provides extra visual weight and identifies the primary action in a set of buttons -->
<div class="box">
    <ul id="nav">
        <li><A class="hover" >BS_Area</A></li>
        <li><A  >BS_AreaNew</A></li>
        <li><A  >BS_Class</A></li>
        <li><A  >BS_ClassType</A></li>
        <li><A  >BS_Course</A></li>
        <li><A  >BS_Lesson</A></li>
        <li><A  >BS_LessonTrg</A></li>
        <li><A  >BS_Project</A></li>
        <li><A  >BS_Room</A></li>
        <li><A  >BS_Roster</A></li>
        <li><A  >BS_Student</A></li>
        <li><A  >BS_Student</A></li>
        <li><A  >DT_Properties</A></li>
        <li><A  >S_Dept</A></li>
        <div id="lanPos"></div>
    </ul>

</div>
<div id="mainBody">


<br/>
<form action="/a/getBSArea" name="search" method="get" class="form-horizontal">
    &nbsp;&nbsp;<label for="objectId"> Id </label>&nbsp;&nbsp;
    <input type="text" id="objectId" name="objectId">
    &nbsp;&nbsp;<label for="from">从</label>
    <input type="text" id="from" name="from">
    <label for="to">到</label>
    <input type="text" id="to" name="to">
    &nbsp;&nbsp;<button type="submit" class="btn btn-primary">查询</button>
    &nbsp;&nbsp;<button type="reset" class="btn btn-primary"> 重置</button>
    &nbsp;&nbsp;<button type="button" class="btn btn-primary" id="reload"> 刷新</button>
</form>
<div>
    <table id="treeTable" class="table table-striped table-bordered table-condensed">
        <tr><th>机构名称</th><th>归属区域</th><th>机构编码</th><th>机构类型</th><th>备注</th></tr>
        <c:forEach items="${page.list}" var="office">
            <tr >
                <td>${office.id}</td>
                <td>${office.sName}</td>
                <td>${office.id}</td>
                <td>${office.sName}</td>
                <td>${office.id}</td>

            </tr>
        </c:forEach>
         <%--<c:forEach items="${list}" var="office">--%>
            <%--<tr >--%>
                <%--<td>${office.id}</td>--%>
                <%--<td>${office.sName}</td>--%>
                <%--<td>${office.id}</td>--%>
                <%--<td>${office.sName}</td>--%>
                <%--<td>${office.id}</td>--%>

            <%--</tr>--%>
        <%--</c:forEach>--%>
        <%----%>
    </table>
    <tr>
        <td colspan="6" align="center" bgcolor="#5BA8DE"><h3>共${page.totalRecords}条记录 共${page.totalPages}页 当前第${page.pageNo}页</h3><br>

            <a href="${path}/a/getBSArea?pageNo=${page.topPageNo }"><input type="button" name="fristPage" value="首页" class="btn btn-primary btn-xs" /></a>
            <c:choose>
                <c:when test="${page.pageNo!=1}">

                    <a href="${path}/a/getBSArea?pageNo=${page.previousPageNo }"><input type="button" name="previousPage" value="上一页" class="btn btn-primary btn-xs" /></a>

                </c:when>
                <c:otherwise>

                    <input type="button" disabled="disabled" name="previousPage" value="上一页" class="btn btn-default btn-xs"/>

                </c:otherwise>
            </c:choose>
            <c:choose>
                <c:when test="${page.pageNo != page.totalPages}">
                    <a href="${path}/a/getBSArea?pageNo=${page.nextPageNo }"><input type="button" name="nextPage" value="下一页" class="btn btn-primary btn-xs" /></a>
                </c:when>
                <c:otherwise>

                    <input type="button" disabled="disabled" name="nextPage" value="下一页" class="btn btn-default btn-xs" />

                </c:otherwise>
            </c:choose>
            <a href="${path}/a/getBSArea?pageNo=${page.bottomPageNo }"><input type="button" name="lastPage" value="尾页" class="btn btn-primary btn-xs" /></a>
        </td>
    </tr>
</div>
</div>
</body>
</html>
