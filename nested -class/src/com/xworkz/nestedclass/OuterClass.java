package com.xworkz.nestedclass;

public class OuterClass {
	
	    private int a = 1; // private variable
	    protected int b = 2; // protected variable
	    public int c = 3; // public variable
	    int d = 4; // default variable
	    
	    // Creating member inner class 
	    class InnerClass
	    {
	        // Method of inner class
	        public void methodOfInner() 
	        {
	            System.out.println("Accessing private variable : "+ a);
	            System.out.println("Accessing protected variable : "+ b);
	            System.out.println("Accessing public variable : "+ c);
	            System.out.println("Accessing default variable : "+ d);
	        }
	    }
	        public static void main(String[] args) 
	        { 
	        OuterClass objOfOuter = new OuterClass();
	        InnerClass objOfInner = objOfOuter.new InnerClass();
	        
	        objOfInner.methodOfInner();
	        
	        }
	}

