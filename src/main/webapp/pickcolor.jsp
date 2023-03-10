<%--
  Created by IntelliJ IDEA.
  User: gilly
  Date: 3/9/23
  Time: 11:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pickcolor</title>
</head>
<body>

<form action="/pickcolor" method="post">
    <label for="exampleColorInput" class="form-label">Color picker</label>
    <input type="color" name="color" class="form-control form-control-color" id="exampleColorInput" value="#563d7c" title="Choose your color">
    <button type="submit" class="btn btn-primary">Submit</button>
</form>


</body>
</html>
