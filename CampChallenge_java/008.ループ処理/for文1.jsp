<%-- 
    Document   : newjsp1
    Created on : 2018/05/18, 15:24:32
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
            long x = 8;
                for(int i=1;i<20;i++){
                    x =x*8;
                }
                out.print(x);
        
        %>
    </body>
</html>
