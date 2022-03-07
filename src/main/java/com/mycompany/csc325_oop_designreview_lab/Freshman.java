/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author jesusalvarado
 */
public class Freshman extends Student{
    private int credits;
    public Freshman(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }
    public int getCredits(){
        return credits;
    }
    
    public void setCredits(int newCredits){
        credits = newCredits;
    }
    
}
