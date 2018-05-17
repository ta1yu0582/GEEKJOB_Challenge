<%-- 
    Document   : newjsp
    Created on : 2018/05/17, 16:46:13
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
           String self_intro = "私の名前は瀧澤 竜太郎です。";
           out.print(self_intro);
       %>
    </body>
</html>
