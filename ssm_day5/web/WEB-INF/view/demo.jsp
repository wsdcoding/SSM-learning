<%--
  Created by IntelliJ IDEA.
  User: 15593
  Date: 2018/4/20
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/user/upload" enctype="multipart/form-data">
    <%--一定要注意这里使用 enctype="multipart/form-data--%>
    <input type="text" name="id"/>
    <input type="file" name="file"/><%--一定要注意这里name里面的值要跟后台的一样--%>
    <input type="submit" value="提交"/>
</form>
<a href="/user/down"> 点我下载</a>
</body>
</html>
