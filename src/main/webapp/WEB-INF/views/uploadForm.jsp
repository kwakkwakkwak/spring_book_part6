<%--
  Created by IntelliJ IDEA.
  User: kwak
  Date: 2017. 10. 25.
  Time: PM 8:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        iframe {
            width:0px;
            height: 0px;
            border: 0px;
        }
    </style>
</head>
<body>
<form id="form1" action="/uploadForm" method="post"
enctype="multipart/form-data" target ="zeroFrame">
    <input type="file" name="file"><input type="submit">
</form>
<iframe name="zeroFrame"></iframe>
<script>
    function addFilePath() {
        alert(msg);
        document.getElementById("form1").reset();
    }
</script>
</body>
</html>
