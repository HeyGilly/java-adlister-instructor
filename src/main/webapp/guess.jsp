<%--
  Created by IntelliJ IDEA.
  User: gilly
  Date: 3/9/23
  Time: 11:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess Number</title>
</head>
<body>


<form method="post" action="/guess">

    <div class="mb-3">
        <label for="guessNum" class="form-label">Guess the number between 1-3</label>
        <input type="number" class="form-control" id="guessNum" name="guessNum" max="3">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>
