package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	/* OBJECTS:
	    - Every real world Object has two major characteristics:
	        1. State
	        2. Behavior

	    - State is nothing but specification of the system
	      Like, a computer's RAM, type of OS it is running, it's storage capacity, etc.

	    - Behavior for computer would be booting up, shutting down, giving output, printing something,
	      performing calculation, etc.

	    Similar to this, Objects in OOP i.e., software objects also have STATE and BEHAVIOR.

	    - State of the software objects are stored in fields known as VARIABLES.
	    - Behaviors of these software objects are exposed through METHODS.


	  CLASS:
	    - Class is a template or a blueprint for creating Objects.

	    - Benefits of Class:
	        1. Basic or primitive data types are limited i.e., int, short, etc.
	        2. Class give us a power to define our own data type called User-defined Data Type.
	*/

        Car mahindra = new Car();
        Car tata = new Car();

        // mahindra.model = "XUV300"; // can be used without defining set-Method.

        // mahindra = null;

        System.out.println("Model is " + mahindra.getModel());
        /* Here we will get:
            Model is null

           Null is actually the default state for a class and also for a String.
        */


        mahindra.setModel("XUV300");

        System.out.println("Model is " + mahindra.getModel());


        mahindra.setModel("XUV700");

        System.out.println("Model is " + mahindra.getModel());
    }
}
