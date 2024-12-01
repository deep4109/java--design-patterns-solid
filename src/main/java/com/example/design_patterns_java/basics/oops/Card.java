package com.example.design_patterns_java.basics.oops;

abstract public class Card implements PaymentMethod{
    protected String cardNo;
    protected String userName;

    public Card(String cardNo,String name){
        this.cardNo = cardNo;
        this.userName = name;
    }
    public String getCardNo(){
        return cardNo;
    }
    public String getUserName(){
        return userName;
    }
}