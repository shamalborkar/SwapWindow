package com.prog1;
import java.util.Scanner;

public class Buynow1 {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int Option;
		Shopping item = new Shopping();
		item.setProductName();
		item.setProductPrice();

		item.displayListOfProducts();
		while (true) {
			Option = item.displayOptions(scanner);
			switch (Option) {

			
			// Case 1 to Add New Item in Bucket
			case 1:
				item.displayListOfProducts();
				int sequenceNumberOfProduct,
				quantityOfProduct;
				int indexOfFirstProducts = 0;
				int maxProductQuantity = 500;
				int minProductQuantity = 0;
				System.out.print("Product SN: ");
				
				//To check Product Details is correct or not
				sequenceNumberOfProduct = scanner.nextInt();
				if (!(sequenceNumberOfProduct <= item.noOfProductInList())) {
					System.out.println("Sorry Now we have only "
							+ item.noOfProductInList() + " Products");
				} 
				else if (!(sequenceNumberOfProduct > indexOfFirstProducts)) {
					System.out.println("Sorry Prduct Sequence Starts From 1");
				} 
				else {
					System.out.print("Quantitiy: ");
					quantityOfProduct = scanner.nextInt();
					if (!(quantityOfProduct > minProductQuantity)) {
						System.out
								.println("Sorry you need to buy one or more product");
					} 
					else if (!(quantityOfProduct < maxProductQuantity)) {
						System.out
								.println("Sorry at a time you can buy 500 or less products");
					} 
					else {
						item.addInCart(sequenceNumberOfProduct,
								quantityOfProduct);
					}
				}
				break;

			// Case 2 to remove Product from the List
			
			case 2:
				
					int sequenceNumberOfRemovableProduct;
					item.displayFinalBucketProducts();
					System.out
							.print("Enter Product  which you want to remove: ");
					sequenceNumberOfRemovableProduct = scanner.nextInt();
					
				break;

			// Case 3 to update Product from the List
			
			  case 3: if (item.isListEmpty() == true)
			  System.out.println("Sorry Your Bucket Is Empty"); 
			  else { 
				  int sequenceNumberOfUpdateableProduct;
				  int newQuantity, quantityIsZero = 0;
			  item.displayFinalBucketProducts(); System.out
			  .print("Enter Product no which you want to Update: ");
			  sequenceNumberOfUpdateableProduct = scanner.nextInt();
			  
			  if (sequenceNumberOfUpdateableProduct > item.sizeOfList()) {
			  System.out.print("Sorry Product Sequence " +
			  sequenceNumberOfUpdateableProduct + " Doesn't Exist"); } else {
			  System.out.print("Enter new Quantity of Product: "); 
			  newQuantity =scanner.nextInt();
			  
			  } } break;
			 				
			// It will Display Updated List	
			case 4:
				if (item.isListEmpty() == true)
					System.out.println("Sorry Your Bucket Is Empty");
				else {
					item.displayFinalBucketProducts();
				}
				break;

			// This will show final Price and Products Quantity
			case 5:
				if (item.isListEmpty() == true) {
					System.out.println("Your Bucket is Empty!");

					System.out.println("DO you want to buy Product ?");
					System.out.println("Press 1 for Yes and 2 for No");
					System.out.println("Option :  ");
					int wantToBuyMore = scanner.nextInt();
					int yes = 1, no = 2;
					if (wantToBuyMore == yes) {
						System.out.println("Okay");
					} else if (wantToBuyMore == no) {
						System.out
								.println("\tnext time you will Buy");
					
						System.exit(0);
					} 
				} 
				//When Bucket Having Some Products
				else {
					item.orderPlace();
					System.out.println("DO you want to buy more Product ?");
					System.out.println("Press 1 for Yes and 2 for No");
					System.out.println("Option :  ");
					int wantToBuyMore = scanner.nextInt();
					int yes = 1, no = 2;
					if (wantToBuyMore == yes) {
						System.out.println("Okay");
					} else if (wantToBuyMore == no) {
						System.out
								.println("\tYour Order is successfully Placed");
					
						System.exit(0);
					} 
				}

				break;

			default:
				System.out
						.println("Please Try Again");
			}
		}
	}
}


