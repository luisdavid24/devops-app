/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

/**
 *
 * @author david
 */
public class Calculator {
    public int sum(int addend1,int addend2){
        return addend1+addend2;
    };
    
     public int substract(int num1,int num2){
        return num1-num2;
    };
     public int mult(int num1,int num2){
        return num1*num2;
    };
     public int div(int num1,int num2){
        if(num2!=0){
            return num1/num2;
        } 
        return 0;
    }; 
    
}
