<%-- 
    Document   : 変数の宣言と表示（if文）
    Created on : 2018/05/18, 12:07:04
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
         int x = 3;
         
         if(x == 1) {
             out.print("1です!");
         }else if(x == 2) {
             out.print("プログラミングキャンプ!");
         }else{
             out.print("その他です!");
         }
       %>
    </body>
</html>
