<%--
  Created by IntelliJ IDEA.
  User: AGDS
  Date: 5/23/2017
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="LoginCheck"> <%--Action shows you where to go, we want to go from jsp to a servlet--%>
    <table>
        <tr>
            <td>
                UserName:
            </td>
            <td>
                <input type="text" name="uname"/>
            </td>
        </tr>
        <tr>
            <td>
                Password:
            </td>
            <td>
                <input type="text" name="password"/>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="login"/></td>
        </tr>
    </table>
</form>
</body>
</html>
