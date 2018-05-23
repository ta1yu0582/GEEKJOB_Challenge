/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class ArgRV1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  // メソッド定義側の処理
         HashMap<String,String> method(String str){
         HashMap<String, String> user1= new HashMap<>();
         HashMap<String, String> user2= new HashMap<>();
         HashMap<String, String> user3= new HashMap<>();
         HashMap<String, String> user4= new HashMap<>();
         user1.put("id", "1"); user1.put("birth", "2010/8/1");user1.put("adress", "Tokyo");
         user2.put("id", "2"); user2.put("birth", "1985/7/28");user2.put("adress", "Kyoto");
         user3.put("id", "3"); user3.put("birth", "1976/1/18");user3.put("adress", "null");
         user4.put("id", "そのIDは使われていません。");   
         //ArrayListにHashMapをいれて簡単に出来ないかと思ったがArrayListからHashMapのKeyとValueをはなして考えるやり方がよくわからなかった。
         //ArrayList<HashMap> users = new ArrayList<>();
         //users.add(user1);
         //users.add(user2);
         //users.add(user3);
         //users.add(user4);
         
             if (str.equals(user1.get("id"))){
        return user1;
        }else if(str.equals(user2.get("id"))){
            return user2;
        }else if(str.equals(user3.get("id"))){
            return user3;
        }else{
            return user4;}

        
         
         }protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         HashMap<String, String> user = method("2");
         for (Map.Entry<String,String>disp : user.entrySet()){
    
    out.print(disp.getValue()+"<br>");
}
        
         
          
     

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ArgRV1</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet ArgRV1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
