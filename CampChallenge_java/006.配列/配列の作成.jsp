<%-- 
    Document   : ArrayListの操作
    Created on : 2018/05/18, 14:26:58
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
        <%@ page import="java.util.ArrayList" %>

        <% 
        ArrayList<String> str = new ArrayList<String>();
        str.add("10");
        str.add("100");
        str.add("soeda");
        str.add("hayasi");
        str.add("-20");
        str.add("118");
        str.add("END");
        out.print(str.get(0) + "<br>");
        out.print(str.get(1) + "<br>");
        out.print(str.get(2) + "<br>");
        out.print(str.get(3) + "<br>");
        out.print(str.get(4) + "<br>");
        out.print(str.get(5) + "<br>");
        out.print(str.get(6) + "<br>");
        %>
    </body>
</html>
