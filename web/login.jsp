<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/6/16
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function login() {
            var targetForm = document.forms[0];
            targetForm.action = "loginAction.action";
        }
        function regist() {
            var targetForm = document.forms[0];
            targetForm.action = "registAction.action";
        }
    </script>
</head>
<body>
<form name="login" action="loginAction.action" method="post">
    用户名：<input type="text" name="username" id="username"/><br/>
    密码：<input type="text" name="password" id="password"/><br/>
    <input type="submit" value="1111"/>
    <input type="submit" value="button" onclick="regist();"/>
</form>
</body>
</html>
