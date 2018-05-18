<%-- 
    Document   : newjsp
    Created on : 2018/05/17, 17:10:42
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
        float x = 23;
        final float y = 18;
        
        out.print("xを23、yを18とする" + "<br>");
        out.print("x + y=");
        out.print(x + y + "<br>");
        
        out.print("x - y=");
        out.print(x - y + "<br>");
        
        out.print("x × y=");
        out.print(x * y + "<br>");
        
        out.print("x / y=");
        out.print(x / y + "<br>");
        
        out.print("<br>");
        out.print("xに+1する" + "<br>");
        
        x++;
        out.print("x + y=");
        out.print(x + y + "<br>");
        
        out.print("x - y=");
        out.print(x - y + "<br>");
        
        out.print("x × y=");
        out.print(x * y + "<br>");
        
        out.print("x / y=");
        out.print(x / y + "<br>");
        
        %>

    </body>
</html>
