<%-- 
    Document   : newjsp1
    Created on : 2018/05/18, 15:10:54
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
         <%@ page import="java.util.*" %>
        <%
            HashMap<String, String> kadai =new HashMap<String, String>();
            kadai.put("1", "AAA"); kadai.put("hello", "world"); kadai.put("soeda", "33"); kadai.put("20", "20");
            ArrayList<HashMap> data = new ArrayList<HashMap>();
            data.add(kadai);
            out.print(data.get(0));
        %>
    </body>
</html>
