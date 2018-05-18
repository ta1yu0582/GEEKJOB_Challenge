<%-- 
    Document   : switch文2
    Created on : 2018/05/18, 13:47:47
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
        char ini = 'A';
        switch (ini) {
            case 'A':
                out.print("英語");
                break;
            case 'あ':
                out.print("日本語");
                break;
            default:
                break;
        }
        %>
    </body>
</html>
