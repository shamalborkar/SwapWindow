package com.prog1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserDemo {

		  	public static void main(String[] args) throws ProductNotFoundException {
		  		Scanner sc=new Scanner(System.in);
		  	try {
				Authenticate newUser = new Authenticate();
			  newUser.authenticateUser(sc);
		  		
		  	
		     while(true) {
		  			System.out.println("Press 1 for View a List of Products");
		  			System.out.println("Press 2 to add Products");
		  			System.out.println("Press 3 to remove Products");
		  			System.out.println("Press 4 to view product");
		  			System.out.println("press 5 to place the orderd");
		  			System.out.println("press 6 to update product ");

		  			System.out.println("enter option");
		  			int opt=sc.nextInt();
		  			select(opt);
		  		}
		  	}
		     catch (InputMismatchException e) {
					// TODO: handle exception
			  		System.out.println(e);
				}
		  	}
		  	public static void select(int opt) {
		  		Shop s=new Shop();
		  	
		  		Scanner scn=new Scanner(System.in);
		  		switch(opt)
		  		{
		  		case 1: s.displayProduct();
		  				break;
		  		case 2: System.out.println("Enter Product Id and quantity");
		  				int pid=scn.nextInt();
		  				int qty=scn.nextInt();
		  				s.addProduct(pid, qty);
		  				System.out.println("your product is added.");
		  				break;
		  		case 3: System.out.println("Enter Product Id to remove product");
		  			
		  				try {
		  				int id=scn.nextInt();
		  				s.removePriduct(id);
		  				System.out.println("your product is removed...");
		  				}
		  				catch (InputMismatchException e) {
							// TODO: handle exception
		  					System.out.println(e);
						}
		  				break;
		  		case 4: s.showProducts();
		  				break;
		  		case 5:s.showProducts();
		  				System.out.println("your order is placed successfully..");
		  				break;
		  		case 6:
		  			System.out.println("enter product id");
		  			int prodId=scn.nextInt();
		  			s.updateProduct(prodId);
		  				System.out.println("your product is updated");
		  				break;
		  				
		  		default :System.err.println("Please enter a valid input");
		  		}
		  	}
		  
		  
			
		  	}

	  


