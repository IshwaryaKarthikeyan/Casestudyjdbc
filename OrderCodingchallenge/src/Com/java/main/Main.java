package Com.java.main;
import java.util.*;

import Com.java.dao.OrderProcessor.UserNotFoundException;
import Com.java.service.service;
public class Main {
	public static void main(String [] args) throws UserNotFoundException, Com.java.exception.exceptions.UserNotFoundException {
	
		

		

		
				Scanner sc = new Scanner(System.in);
service ser=new service();			 
System.out.println("---Welcome to Order Management System!---");
			    while(true) {
			    System.out.println("Select an option:");
			    System.out.println("1. Create User");
			    System.out.println("2. Create Product");
			    System.out.println("3. Cancel Order");
			    System.out.println("4. Get All Products");
			    System.out.println("5. Get Order by User");
			    System.out.println("6. Exit");
			        
			    System.out.println("Enter ur choice");
			    int ch=sc.nextInt();
			    switch (ch){
			    case 1:
			    	ser.createOrder();
			        break;
			    case 2:
			    	ser.createOrder();
			        break;
			    case 3:
			    	ser.cancelOrder();
			    	break;
			    case 4:
			    	ser.getAllProducts();
			    	break;
			    case 5:
			    	ser.getOrderByUser();
			    	break;
			    case 6:  	
			    	System.out.println("Exiting Order Management System");
			    	System.exit(0);
			    	break;
			    default: 
			    	System.out.println("Invalid choice. Please try again.");
			    	break;
			            }
			        }
			    }
}
		