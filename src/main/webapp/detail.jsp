<%@ page import="com.PersonModel.Senzor" %><%--
  Created by IntelliJ IDEA.
  User: root
  Date: 09.06.2019
  Time: 01:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail</title>
</head>
<style>
    .text{
        height: 300px;
    }
    .senzor{
        width: 250px;
    }

</style>
<body>

<div>
    <form method="post" action="detail">
        <table>
            <tr class="senzor">
                <td>Senzor :</td>
                <td><input type="number" name="nameSenzor"></td>
            </tr>
            <tr>
                <td>
                <td>
                <td><input type="submit" name="submit Senzor" value="Data Senzor"></td>
                </td></td>
            </tr>
            <tr><td class="text">
                <td>
                <td>
                    <%
                        Senzor person = (Senzor) request.getAttribute("pers");
                        out.println(person.getId());
                    %>
                </td>
                </td>
                </td>
            </tr>
        </table>
    </form>


</div>

</body>
</html>
