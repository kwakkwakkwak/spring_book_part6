<%--
  Created by IntelliJ IDEA.
  User: kwak
  Date: 2017. 10. 26.
  Time: AM 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script>
    var result='${savedName}';
    parent.addFilePath(result);
</script>

</body>
</html>
