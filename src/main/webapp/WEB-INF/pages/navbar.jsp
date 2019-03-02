<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.bsptech.task.util.SecurityUtil" %>

<html>
<head>
    <title>Task</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>


<nav class="navbar navbar-default" role="navigation">

    <div class="navbar-collapse collapse">

        <ul class="nav navbar-nav navbar-left">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">Main Page</a>
            </div>
            <%
                if (SecurityUtil.hasRole("ADMIN")) {
            %>
            <li><a href="#user">
                <form:form
                        method="POST"
                        action="/user"
                >
                    <input class="btn btn-primary" type="submit" value="User"/>
                </form:form>
            </a></li>
            <%}%>
            <li><a href="#task">
                <form:form
                        method="POST"
                        action="/task"
                >
                    <input class="btn btn-primary" type="submit" value="Task"/>
                </form:form>
            </a></li>

        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="#logout">
                <form:form
                        method="POST"
                        action="/logout"
                >
                    <input class="btn btn-primary" type="submit" value="Logout"/>
                </form:form>
            </a></li>


        </ul>
    </div>
</nav>
</body>
</html>
