<%@ page contentType="text/html;charset=UTF-8" language="java" %>




<html>
<jsp:include page="partials/header.jsp">
    <jsp:param name="title" value="Login Page" />
</jsp:include>
<body>

<%--NavBar--%>
<jsp:include page="partials/navbar.jsp"></jsp:include>



<%--Should See a form --%>
<!-- Form -->
<form class="w-50 mx-auto border shadow-lg rounded p-2 mt-5" method="post" action="login">
    <%--Username--%>
    <div class="mb-3">
        <label for="inputUsername" class="form-label">Username</label>
        <input type="text" class="form-control" id="inputUsername" name="inputUsername" aria-describedby="username">
    </div>
    <%--Password--%>
    <div class="mb-3">
        <label for="inputPassword" class="form-label">Password</label>
        <input type="password" class="form-control" id="inputPassword" name="inputPassword" aria-describedby="password">
        <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <%--Submit Button--%>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>




</body>
<!-- Boostrap -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</html>