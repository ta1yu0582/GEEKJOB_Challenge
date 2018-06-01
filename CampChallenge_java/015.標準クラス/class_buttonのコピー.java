/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.practice.button;

/**
 *
 * @author user
 */
import java.awt.FlowLayout;
import java.io.File;
import java.io.FileWriter;
import java.io.*;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
 
public class class_button {
 
  public static void main(String[] args) {
      
      Date now = new Date();
            
            Calendar c = Calendar.getInstance();
            c.setTime(now);
            System.out.print(c.get(Calendar.YEAR)+"-"+
            c.get(Calendar.MONTH)+"-"+
            c.get(Calendar.DAY_OF_MONTH)+"　"+
            c.get(Calendar.HOUR_OF_DAY)+":"+
            c.get(Calendar.MINUTE)+":"+
            c.get(Calendar.SECOND)+"開始");
     
    JFrame frame = new JFrame("ボタン");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);
    frame.setLocationRelativeTo(null);
     
    // コンポーネントの配置方法を設定
    frame.setLayout(new FlowLayout());
     
    // ボタン1を作成
    JButton button1 = new JButton("ボタン1");
    button1.addActionListener(e -> {
      System.out.println("ボタン1が押された");
         Calendar ca = Calendar.getInstance();
      try{
          File fp =new File("start.txt");
          FileWriter fw = new FileWriter(fp);
          fw.write(ca.get(Calendar.YEAR)+"-"+
            ca.get(Calendar.MONTH)+"-"+
            ca.get(Calendar.DAY_OF_MONTH)+"　"+
            ca.get(Calendar.HOUR_OF_DAY)+":"+
            ca.get(Calendar.MINUTE)+":"+
            ca.get(Calendar.SECOND)+"終了");
          fw.close();
           //ログファイルが出来ているかの確認
        /*  FileReader fr =new FileReader(fp);
            //FileReaderクラスのインスタンスを使って、BufferedReaderクラスのインスタンスを生成している
            BufferedReader br =new BufferedReader(fr);
            //BufferedReaderのメソッド、readLineを使って、1行表示する
            System.out.print(br.readLine());
            fw.close();*/
      } catch (IOException b) {
          b.printStackTrace();
      }
    });
     
    // ボタン2を作成
    JButton button2 = new JButton("ボタン2");
    button2.addActionListener(e -> {
      System.out.println("ボタン2が押された");
            Calendar cb = Calendar.getInstance();
         try{
          File fp =new File("start.txt");
          FileWriter fw = new FileWriter(fp);
          fw.write(cb.get(Calendar.YEAR)+"-"+
            cb.get(Calendar.MONTH)+"-"+
            cb.get(Calendar.DAY_OF_MONTH)+"　"+
            cb.get(Calendar.HOUR_OF_DAY)+":"+
            cb.get(Calendar.MINUTE)+":"+
            cb.get(Calendar.SECOND)+"終了");
          fw.close();
          //ログファイルが出来ているかの確認
        /*  FileReader fr =new FileReader(fp);
            //FileReaderクラスのインスタンスを使って、BufferedReaderクラスのインスタンスを生成している
            BufferedReader br =new BufferedReader(fr);
            //BufferedReaderのメソッド、readLineを使って、1行表示する
            System.out.print(br.readLine());
            fw.close();*/
      } catch (IOException b) {
          b.printStackTrace();
      }
      
    });
   
     
    // 各ボタンをウィンドウに追加
    frame.add(button1);
    frame.add(button2);
     
    frame.setVisible(true);
  }
}
