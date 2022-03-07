
package com.mycompany.csc325_oop_designreview_lab;

/**
 * Student --
 * child class of the Human class, extends and implements the 
 * properties of the human class, while implementing its own fields 
 * pertaining to a student object.
 * 
 * @author MoaathAlrajab, Jesus Alvarado
 */

public class Student extends Human{
  
    private double gpa;
    
    /** 
     * Student--
     * Constructor method for instantiating the Student object
     * @param: String name, short age
     * @return: string address
     */
    public Student(String name, short age){
        
        super(name, age);
    }

    /**
     * getAddress--
     * getter method for getting a student's address. Implements and overrides
     * the method provided by the parent class
     * @param: 
     * @return: string address
     */
    @Override
    public String getAddress() {    
        return super.address;
    }

    /** 
     * setAddress--
     * setter method for setting a student's address. Implements and overrides
     * the method provided by the parent class
     * @param: string address
     * @return: 
     */
    @Override
    public void setAddress(String address) {
        super.address = address;
    }
    
    /** 
     * getGPA--
     * getter method for getting a student's gpa
     * @param: 
     * @return: double gpa
     */
    public double getGPA(){
        return gpa;
    }
    
    /**
     * setGPA --
     * setter method for setting a student's gpa
     * @param: double grade
     * @return: void
     */
    public void setGPA(double grade){
        gpa = grade;
    }
	// ToDo 1: Make this class a child of Human
	
	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
	
	// ToDo 4: Add comments to your code

}