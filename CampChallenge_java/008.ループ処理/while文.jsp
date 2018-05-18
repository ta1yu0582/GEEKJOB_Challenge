<%-- 
    Document   : while文
    Created on : 2018/05/18, 16:25:16
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        int x = 1000;
        while(x>100){
            x =x/2;
        }
        out.print(x);
        %>
    </body>
</html>
