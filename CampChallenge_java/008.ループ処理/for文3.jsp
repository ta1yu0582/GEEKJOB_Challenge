<%-- 
    Document   : for文3
    Created on : 2018/05/18, 16:00:18
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
            int x = 0;
            int total = 0;
            for(int i=0;i<101;i++){
                total += x;
                x = x+1;
            }
            out.print(total);
            
        %>
    </body>
</html>
