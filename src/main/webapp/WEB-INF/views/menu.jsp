<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/11/24
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;
    %>
    <base href="<%=basePath%>" >
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="static/css/basic.css" rel="stylesheet" type="text/css">
    <link href="static/css/style.css" rel="stylesheet" type="text/css">
    <link href="static/js/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="static/js/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <script type="text/javascript" src="static/js/jquery-1.12.4.min.js"></script>
    <script type="text/javascript" src="static/js/menu.js"></script>
    <title>Title</title>

</head>
<body>
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
    <div id="content">
        <div>
            <jsp:include page="1.jsp"/>
        </div>
        <div><jsp:include page="bsArea.jsp"/></div>
        <div>3</div>
        <div>4</div>
        <div>1</div>
        <div>1</div>
        <div>1</div>
        <div>1</div>
        <div>1</div>
        <div>1</div>
        <div>1</div>
        <div>1</div>
        <div>1</div>
        <div><jsp:include page="bsArea.jsp"/></div>
    </div>
</div>
</body>
</html>
