/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.time;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class Reading_Display extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            //渡したファイルパス（ここでは.txt）を読み込んで、Fileクラスのインスタンスを生成している。
            File fp =new File("intro.txt");
            //作ったFileクラスのインスタンスを使って、Fileの書き込みを行う
            FileWriter fw =new FileWriter(fp);
            fw.write("名前　瀧澤竜太郎"+"生年月日　1993/1016");
            //Fileクラスのインスタンスのクローズ(ここまでの処理をセーブしている)
            fw.close();
            //Fileクラスのインスタンスを使って、FileReaderクラスのインスタンスを生成している
            FileReader fr =new FileReader(fp);
            //FileReaderクラスのインスタンスを使って、BufferedReaderクラスのインスタンスを生成している
            BufferedReader br =new BufferedReader(fr);
            //BufferedReaderのメソッド、readLineを使って、1行表示する
            System.out.print(br.readLine());
            fw.close();
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Reading_Save</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Reading_Save at " + request.getContextPath() + "</h1>");
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
