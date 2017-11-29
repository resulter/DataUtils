<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/11/23
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="static/js/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="static/js/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <script type="text/javascript" src="static/js/jquery-1.12.4.min.js"></script>
    <title>Title</title>
    <script>
        $(document).ready(function(){
            $("#menu li").each(function (index) {
                $(this).click(function () {
                    $("div#right div.tab_content").hide();
                    $("div#right div.tab_content:eq(" + index + ")").show();
                })
            })
        });
    </script>
</head>
<body>
<jsp:include page="menu.jsp"/>

<%--<div id="content">--%>

<%--</div>--%>
<%--<a href="/a/getBSArea">getBSArea</a>--%>
<%--list--%>
</body>
</html>
