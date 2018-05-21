/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;
//JavaBeansのルール①.java.ioSerializableインターフェイスの実装
import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author user
 */
public class ResultData implements Serializable{
 //JavaBeansのルール　フィールドは隠匿化する(privateを使う)
private Date d;
private String luck;
//javaBeansのルール　publicで引数のないコンストラクタを持つ
public ResultData(){}
//javaBeansのルール　フィールドはpublicで命名規則に沿ったgetter/setterをもつ
public Date getD(){
    return d;
}

public void setD(Date d){
    this.d = d;
}

public String getLuck(){
    return luck;
}

public void setLuck(String luck){
    this.luck = luck;
}
}
