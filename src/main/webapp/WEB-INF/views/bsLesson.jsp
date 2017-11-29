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
    <title>BS_lesson</title>

    <script>
        $(function () {
            $("#from").datepicker({
                defaultDate: "+1w",
                changeMonth: true,
                changeYear:true,
                numberOfMonths: 1,
                onClose: function (selectedDate) {
                    $("#from").datepicker("option", "dateFormat", "yy-mm-dd");
                    $("#to").datepicker("option", "minDate", selectedDate);
                }
            });
            $("#to").datepicker({
                defaultDate: "+1w",
                changeMonth: true,
                changeYear:true,
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
        <li><A href="/a/getBSArea">BS_Area</A></li>
        <li><A  href="/a/getBSAreaNew" >BS_AreaNew</A></li>
        <li><A  href="/a/getBSClass">BS_Class</A></li>
        <li><A  href="/a/getBSClassType" >BS_ClassType</A></li>
        <li><A  href="/a/getBSCourse">BS_Course</A></li>
        <li><A  class="hover" href="/a/getBSLesson" >BS_Lesson</A></li>
        <li><A  href="/a/getBSLessonTrg">BS_LessonTrg</A></li>
        <li><A  href="/a/getBSProject">BS_Project</A></li>
        <li><A  href="/a/getBSRoom" >BS_Room</A></li>
        <li><A  href="/a/getBSRoster" >BS_Roster</A></li>
        <li><A  href="/a/getBSStudent" >BS_Student</A></li>
        <li><A  href="/a/getBSTeacher">BS_Teacher</A></li>
        <li><A  href="/a/getDtproperties">DT_Properties</A></li>
        <li><A  href="/a/getSDept">S_Dept</A></li>
        <div id="lanPos"></div>
    </ul>

</div>
<div id="mainBody">


    <br/>
    <form action="/a/getBSLesson" name="search" method="post" class="form-horizontal">
        <%--&nbsp;&nbsp;<label for="lessonNo"> lessonNo </label>&nbsp;&nbsp;
        <input type="text" id="lessonNo" name="lessonNo">--%>
        &nbsp;&nbsp;<label for="classCode"> 课编码 </label>&nbsp;&nbsp;
        <input type="text" id="classCode" name="classCode">
        &nbsp;&nbsp;<label for="from">从</label>
        <input type="text" id="from" name="from">
        <label for="to">到</label>
        <input type="text" id="to" name="to">
        &nbsp;&nbsp;<button type="submit" class="btn btn-primary">查询</button>
        &nbsp;&nbsp;<button type="reset" class="btn btn-primary"> 重置</button>
    </form>
    <div>
        <table id="treeTable" class="table table-striped table-bordered table-condensed">
            <tr><th>课编码</th><th>教室编码</th><th>教师编码</th><th>修改时间</th><th>开始时间</th><th>结束时间</th></tr>
            <c:forEach items="${page.list}" var="list">
                <tr >
                    <td>${list.sClassCode}</td>
                    <td>${list.sRoomCode}</td>
                    <td>${list.sTeacherCode}</td>
                    <td>${list.dtDate}</td>
                    <td>${list.sectBegin}</td>
                    <td>${list.sectEnd}</td>

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

                <a href="${path}/a/getBSLesson?pageNo=${page.topPageNo }"><input type="button" name="fristPage" value="首页" class="btn btn-primary btn-xs" /></a>
                <c:choose>
                    <c:when test="${page.pageNo!=1}">

                        <a href="${path}/a/getBSLesson?pageNo=${page.previousPageNo }"><input type="button" name="previousPage" value="上一页" class="btn btn-primary btn-xs" /></a>

                    </c:when>
                    <c:otherwise>

                        <input type="button" disabled="disabled" name="previousPage" value="上一页" class="btn btn-default btn-xs"/>

                    </c:otherwise>
                </c:choose>
                <c:choose>
                    <c:when test="${page.pageNo != page.totalPages}">
                        <a href="${path}/a/getBSLesson?pageNo=${page.nextPageNo }"><input type="button" name="nextPage" value="下一页" class="btn btn-primary btn-xs" /></a>
                    </c:when>
                    <c:otherwise>

                        <input type="button" disabled="disabled" name="nextPage" value="下一页" class="btn btn-default btn-xs" />

                    </c:otherwise>
                </c:choose>
                <a href="${path}/a/getBSLesson?pageNo=${page.bottomPageNo }"><input type="button" name="lastPage" value="尾页" class="btn btn-primary btn-xs" /></a>
            </td>
        </tr>
    </div>
</div>
</body>
</html>
