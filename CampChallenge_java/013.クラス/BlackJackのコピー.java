/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.blackjack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.Collections;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class BlackJack extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    abstract class Human{
        public ArrayList<Integer> mycards =new ArrayList<>();
        
        abstract protected int open();
        abstract protected void setCard(ArrayList<Integer> al);
        abstract protected boolean checkSum();
    }
    class Dealer extends Human{
       public ArrayList<Integer> cards;
       Random rnd =new Random();
       boolean check = false;
       //Integer ran = rnd.nextInt(cards.size());
      // public ArrayList<Integer> deals;
      // public ArrayList<Integer> hits; 
       
       //コンストラクト作成
       public Dealer() { 
        //cardsに52枚のカード(1~13*4)を入れ、シャッフルする。
        this.cards =new ArrayList<>();
        for(int u=1;u<=3;u++) {
        for(int i=1;i<=13;i++) {
        this.cards.add(i);
        }
        }
         Collections.shuffle(this.cards);
        }
       
       //最初の2枚を取り出す処理
        public ArrayList<Integer> deal() {
        ArrayList<Integer> deal = new ArrayList<>();
        Integer ran = rnd.nextInt(cards.size());
        deal.add(cards.get(ran));
        cards.remove(deal.get(0));
        Integer ran2 = rnd.nextInt(cards.size());
        deal.add(cards.get(ran2)); 
        cards.remove(deal.get(1));
        return deal;
   }
        public ArrayList<Integer> hit() {
        if(check = true){
        ArrayList<Integer> hit =new ArrayList<>();
        Integer ran = rnd.nextInt(cards.size());
        hit.add(cards.get(ran));
        cards.remove(hit.get(0));
        return hit;
        }else {return null;}
        }
  
   //カードの合計を計算
        protected int open(){
            
          int open =0;
          
          for(int i=0;i<mycards.size();i++){
              if(mycards.get(i)>10) {
                  open += 10;
              }else{
              open +=mycards.get(i);}
          }
          return open;
        }
        //配列を引数として取り、その配列を手札に加える
        protected void setCard(ArrayList<Integer> al){  
         
          for(int i=0;i<al.size ();i++){
            mycards.add(al.get(i));
        }
         
    }
        //hitを行うか行わないかのチェック
        protected boolean checkSum(){
            int total =0;
           for(int i=0;i<mycards.size();i++) {
               if(mycards.get(i)>10) {
                   total +=10;
               }else{
                   total += mycards.get(i);
               }
           }
           if (total<=16) {
               check =true;
           }else{
               check =false;
           }
           
           return check;
        }
   }
         class User extends Human{
            
        boolean check = false;

        protected int open() {
                  
          int open =0;
          
          for(int i=0;i<mycards.size();i++){
             if(mycards.get(i)>10) {
                 open += 10;
             }else{
                 open += mycards.get(i);
             }
          }
          return open;

        }protected void setCard(ArrayList<Integer> al) {
        
            for(int i=0;i<al.size ();i++){
            mycards.add(al.get(i));
        }

        }protected boolean checkSum() {
           int total =0;
           
           for(int i=0;i<mycards.size();i++) {
               if(mycards.get(i)>10) {
                   total +=10;
               }else{
                   total += mycards.get(i);
               }
           }
           
           if (total<=16) {
               check =true;
           }else{
               check =false;
           }
           
           return check;
        }
        
        }protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Dealer dealer =new Dealer();
            User user =new User();
            ArrayList<Integer> deal_d =dealer.deal();
            ArrayList<Integer> deal_u =dealer.deal();
            ArrayList<Integer> hit_d =dealer.hit();
            ArrayList<Integer> hit_u =dealer.hit();
            
            
            out.print("ディーラー側の手札は"+deal_d+"<br>");
            out.print("ユーザー側の手札は"+deal_u+"<br>");
            
            dealer.setCard(deal_d);
            user.setCard(deal_u);
            dealer.checkSum();
            user.checkSum();
            
            while(user.checkSum() == true){
                
            user.checkSum(); 
            user.setCard(hit_u);
            out.print("ユーザーは"+hit_u+"を引きました。"+"<br>");
           
            }
            
            while(dealer.checkSum() == true){
                
            dealer.checkSum();
            dealer.setCard(hit_d);
            out.print("ディーラーは"+hit_d+"を引きました。"+"<br>");
            
            }
           
           if(dealer.open()>21 && user.open()>21){
               out.print("ディーラー側の合計が"+dealer.open()+"でユーザー側の合計が"+user.open()+"なので引き分け。");
           }else if(dealer.open()>21 && user.open()<21){
               out.print("ディーラー側の合計が"+dealer.open()+"でユーザー側の合計が"+user.open()+"なのでユーザー側の勝ち。");
           }else if(dealer.open()<21 && user.open()>21){
                out.print("ディーラー側の合計が"+dealer.open()+"でユーザー側の合計が"+user.open()+"なのでディーラー側の勝ち。");
           }else if(dealer.open() > user.open()) {
                out.print("ディーラー側の合計が"+dealer.open()+"でユーザー側の合計が"+user.open()+"なのでディーラー側の勝ち。");
           }else if(dealer.open() == user.open()){
                 out.print("ディーラー側の合計が"+dealer.open()+"でユーザー側の合計が"+user.open()+"なので引き分け。");
           }else{
                out.print("ディーラー側の合計が"+dealer.open()+"でユーザー側の合計が"+user.open()+"なのでユーザー側の勝ち。");
           }
           
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BlackJack</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet BlackJack at " + request.getContextPath() + "</h1>");
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
