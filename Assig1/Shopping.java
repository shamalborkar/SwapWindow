package com.prog1;
	import java.util.ArrayList;
	import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
	public class Shopping{
		int priceOfProduct[] = new int[5];
		String nameOfProduct[] = new String[5];
		List<bucket> userBucket = new ArrayList<bucket>();

		void setProductName() {
			nameOfProduct[0] = "Laptop";
			nameOfProduct[1] = "Mouse";
			nameOfProduct[2] = "Keybord";
			nameOfProduct[3] = "Monitor";
			nameOfProduct[4] = "Carger";
		}
		

		void setProductPrice() {
			priceOfProduct[0] = 70000;
			priceOfProduct[1] = 6000;
			priceOfProduct[2] = 5000;
			priceOfProduct[3] = 8000;
			priceOfProduct[4] = 699;
		}

		int noOfProductInList() {
			return nameOfProduct.length;
		}

		void displayListOfProducts() {
			System.out.println("SN\tProduct Name\tPrice");
			for (int i = 0; i < 5; i++)
				System.out.println(i + 1 + "\t" + nameOfProduct[i] + "\t\t"
						+ priceOfProduct[i]);
		}
		
		int displayOptions(Scanner scanner) {
			int SelectOption;
			System.out.println("1: Add Product in Bucket");
			System.out.println("2: Remove Product form Bucket");
			System.out.println("3: Update Orders List");
			System.out.println("4: Display Orders List");
			System.out.println("5: Place the Order");
			System.out.print("Your Option: ");
			SelectOption = scanner.nextInt();
			
			return SelectOption;
		}

		void addInCart(int sequenceNumberOfProduct, int quantityOfProduct) {
			System.out.println(quantityOfProduct + " Peace Of " + nameOfProduct[sequenceNumberOfProduct - 1]
					+ " SmartPhone is Successfully Added");
			updateList(sequenceNumberOfProduct, quantityOfProduct);
		}

		boolean isListEmpty() {
			return userBucket.isEmpty();
		}

		int sizeOfList() {
			return userBucket.size();
		}

		void removeFromList(int sequenceToRemoveProduct) {
			userBucket.remove(sequenceToRemoveProduct - 1);
		}

		int totalPrice() {
			int TotalPrice = 0;
			Iterator itr = userBucket.iterator();

			while (itr.hasNext()) {
				bucket st = (bucket) itr.next();
				TotalPrice = TotalPrice + st.productPrice;
			}
			return TotalPrice;
		}

		int totalProduct() {
			int totalProduct = 0;
			Iterator itr = userBucket.iterator();

			while (itr.hasNext()) {
				bucket st = (bucket) itr.next();
				totalProduct = totalProduct + st.productQuantity;
			}
			return totalProduct;
		}

		void displayFinalBucketProducts() {
			Iterator itr = userBucket.iterator();
			int productSequence = 1;
			System.out.println("Product Sequence\tProduct Name\tQuantity\tPrice");

			while (itr.hasNext()) {
				bucket st = (bucket) itr.next();
				System.out.println(productSequence++ + "\t\t\t" + st.productName + "\t\t"
						+ st.productQuantity + "\t"+st.productSequence+"\t" + st.productPrice);
			}
			
		}

		void orderPlace() {
			
			System.out.println("Quantity of Products: " + totalProduct()
					+ "\nTotal Price: " + totalPrice());
		}
		
		void updateList(int productSequenceNumber, int quantityOfProduct) {
			Iterator itr = userBucket.iterator();
			boolean flag = true;
			while (itr.hasNext()) {
				bucket st = (bucket) itr.next();
				if (st.productSequence == productSequenceNumber - 1) {
					st.productQuantity = st.productQuantity + quantityOfProduct;
					st.productPrice = st.productPrice
							+ (quantityOfProduct * priceOfProduct[productSequenceNumber - 1]);
					flag = false;
					break;
				}
			}
			if (flag) {
				userBucket.add(new bucket(productSequenceNumber - 1,
						nameOfProduct[productSequenceNumber - 1],
						priceOfProduct[productSequenceNumber - 1] * quantityOfProduct, quantityOfProduct));
			}
		}
		
		void reUpdateBucketProduct(int productSequenceNumber, int Qnt){
			Iterator itr = userBucket.iterator();
			while (itr.hasNext()) {
				bucket st = (bucket) itr.next();
				if (st.productSequence == productSequenceNumber - 1) {
					st.productQuantity =  Qnt;
					st.productPrice = Qnt * priceOfProduct[productSequenceNumber - 1];
					break;
				}
			}
		}
	}

	class bucket {
		int productSequence;
		String productName;
		int productPrice;
		int productQuantity;

		bucket(int sn, String name, int price, int qnt) {
			this.productSequence = sn;
			this.productName = name;
			this.productPrice = price;
			this.productQuantity = qnt;
		}
	}

	