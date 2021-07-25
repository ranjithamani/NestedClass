package com.xworkz.nestedclass;

public class InnerClassDemo {
	
	    // Creating member inner class 
	    class InnerClass
	    {
	        int a = 5;
	        // Method of member inner class
	        public void methodOfInner() 
	        {
	            System.out.println("Inner class");
	        }
	    }
	    
	    void showData()
	    {
	        InnerClass objOfInner = new InnerClass();
	        System.out.println("Show data method and value of a : "+ objOfInner.a);
	        objOfInner.methodOfInner();
	    }//in non static we can access the inner class directly via inner class object
	    
	        public static void main(String[] args) 
	        { 
	        	
	        InnerClassDemo objOfOuter = new InnerClassDemo();
	        InnerClass objOfInner = objOfOuter.new InnerClass();
	        System.out.println("Value of a = " +objOfInner.a);
	        objOfInner.methodOfInner();
	        
	        objOfOuter.showData();
	        }//in static method we can access the inner class by using outer class object
	    
	    
	}

