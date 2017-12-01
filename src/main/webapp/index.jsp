<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>
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
    <link href="static/js/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <script type="text/javascript" src="static/js/jquery-1.12.4.min.js"></script>
    <script type="text/javascript" src="static/js/bootstrap-3.3.7-dist/js/bootstrap.js"></script>

    <title>登录</title>
</head>
<body>
<div class="container" style="margin-top:250px;">
    <form class="form-horizontal" name="loginform" action="/a/login">
        <div class="form-group">
            <label for="username" class="col-sm-3 control-label" >账号</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" name="username" id="username" placeholder="username">
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-3 control-label">密码</label>
            <div class="col-sm-3">
                <input type="password" class="form-control" name="password" id="password" placeholder="password">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-3 col-sm-9">
                <button type="submit" class="btn btn-default">登录</button>&nbsp;&nbsp;
                <button type="reset" class="btn btn-default">重置</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>
