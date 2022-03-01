
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{
    
    public Student(String name, short age){
        
        super(name, age);
    }

    @Override
    public String getAddress() {    
        return super.address;
    }

    @Override
    public void setAddress(String address) {
        super.address = address;
    }
	// ToDo 1: Make this class a child of Human
	
	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
	
	// ToDo 4: Add comments to your code

}