/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * MainClass --
 *
 * @author MoaathAlrajab, Jesus Alvarado
 */
public class MainClass {
	
        /**
         * main--
         * main method used to run this program. Instantiates two student objects.
         * Requires the user to input data for the gpa for the students then outputs 
         * those values. Then prints out the state of the students objects on the console.
         * @param args 
         */
	public static void main(String[] args) {
		// ToDo 5: Fix the error
		
		// ToDo 6: Fix the constructor of Student class
                
                // Todo 7: Create two classes for Freshman and Senior 
                
                // ToDo 8: The senior class should have a minimum of 85 credits  
		
		// ToDo 9: Add a toString method for Freshman class
		
                // ToDo 10: Add a toString method for Senior class
                
		Student std1= new Freshman("James", (short) 20, 12); // name, age, credits
                
                Student std2 = null;
            try {
                std2 = new Senior("John", (short) 30, 90);
            } catch (Exception ex) {
                System.out.println(ex);
            }
		
            Scanner scnr = new Scanner(System.in);
            
            System.out.println("Enter the gpa for "+ std1.getName() +": ");
            double gpa1 = scnr.nextDouble();
            
            System.out.println("Enter the gpa for "+ std2.getName() +": ");
            double gpa2 = scnr.nextDouble();
            
            std1.setGPA(gpa1);
            std2.setGPA(gpa2);
            
            System.out.println("The GPA for "+std1.getName() +"= "+ std1.getGPA());
            System.out.println("The GPA for "+std2.getName() +"= "+ std2.getGPA());
            
		// ToDo 11: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
		
		System.out.println(std1);
                
                System.out.println(std2);
		
		// ToDo 12: add comments and explain your code
		
		// ToDo 13: submit using a pull request.
	}

}