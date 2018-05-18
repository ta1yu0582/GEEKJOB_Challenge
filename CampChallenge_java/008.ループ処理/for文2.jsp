<%-- 
    Document   : for文2
    Created on : 2018/05/18, 15:54:56
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
            String x = "A";
            for (int i=1;i<30;i++){
                x += "A";
            }
            out.print(x);
        %>
    </body>
</html>
