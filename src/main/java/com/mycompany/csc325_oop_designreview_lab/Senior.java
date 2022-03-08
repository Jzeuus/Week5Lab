/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author jesusalvarado
 */
public class Senior extends Student{
    
    private int credits;
    
    public Senior(String name, short age, int totalCredits) throws Exception {
        super(name, age);
        
        if(totalCredits<85){
            throw new IllegalArgumentException("Need 85 credits minimum to be a Senior!");
        }
        else{
            this.credits = totalCredits;
        }
        
        
    }
    
    public int getCredits(){
        return credits;
    }
    
    public void setCredits(int newCredits){
        credits = newCredits;
    }
    
    public String toString(){
        return "Name: " + getName() +
                "\nAge: " + getAge() + 
                "\nAddress: " + getAddress() +
                "\nGPA: " + getGPA() +
                "\nCredits: "+ getCredits() +
                "\nStudent Year: " + getClass().getSimpleName();
    }
    
}
