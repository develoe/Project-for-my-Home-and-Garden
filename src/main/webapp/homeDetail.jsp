<%@ page import="java.io.PrintWriter" %>
<html>
<head>
    <title>
        Room 1
    </title>
</head>
<style>
    h1 {
        margin-left: 40%;

    }

</style>
<body>
<h1>Welcome <% if (session.getAttribute("name")!=null){%>
   <% out.println(session.getAttribute("name"));%>
<%}%>
</h1>
<div>
    <form method="post" action="detail">
        <table>
            <tr>
                <td>Senzor :</td>
                <td><input type="number" name="nameSenzor"></td>
            </tr>
            <tr>
                <td><td><td><input type="submit" name="submit Senzor" value="Data Senzor" ></td></td></td>
            </tr>
        </table>
    </form>


</div>


</body>
</html>
