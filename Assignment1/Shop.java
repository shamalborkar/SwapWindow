package com.prog1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

class Product{
	private String productName;
 private double productPrice;
private	int productQuantity;
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}
public int getProductQuantity() {
	return productQuantity;
}
public void setProductQuantity(int productQuantity) {
	this.productQuantity = productQuantity;
}
@Override
public String toString() {
	return "Product [productName=" + productName + ", productPrice=" + productPrice + ", productQuantity="
			+ productQuantity + "]";
}
	
}

public class Shop {
	static Map<Integer,Product> m1=new HashMap<>();
	
	Product p;
	double totalPrice;
	 public void displayProduct()
	 {
		 System.out.println("display product list");
		 System.out.println("pid \tpname \tprice");
		 System.out.println("1.\tLaptop\t10");
		 System.out.println("2.\tMouse\t20");
		 System.out.println("3.\tMobile\t30");
		 System.out.println("4.\tHeadphone\t40");
		 
		 

	 }
    public void addProduct(int productId,int productQuantity)
    
    {
    	if(productId==1)
    	{
    		 if(m1.containsKey(productId))
    		 {
    				Product k =(Product)m1.get(productId);
    				k.setProductQuantity(productQuantity+(int)k.getProductQuantity());
    				m1.put(productId,k);
    				System.out.println(m1.get(productId).getProductName());
       		 }
    		 else {  	 		 
    			 p =new Product();
    		 p.setProductName("Laptop");
    		 p.setProductPrice(10);
    		 p.setProductQuantity(productQuantity);
    		 m1.put(1,p);
    	 
    		 }
    	}	 
    
    	else if(productId==2)
    	{
    		 if(m1.containsKey(productId))
    		 {
    				Product k =(Product)m1.get(productId);
    				k.setProductQuantity(productQuantity+(int)k.getProductQuantity());
    				m1.put(productId,k);
       		 }
    		 else 
    		 {
    			 p =new Product();
    			 p.setProductName("Mouse");
    			 p.setProductPrice(20);
    			 p.setProductQuantity(productQuantity);
    			 m1.put(2,p);
    		 }
    	}
    	else if(productId==3)
    	{
    		 if(m1.containsKey(productId))
    		 {
    				Product k =(Product)m1.get(productId);
    				k.setProductQuantity(productQuantity+(int)k.getProductQuantity());
    				m1.put(productId,k);
       		 }
    		 else 
    		 {
    			 p =new Product();
    			 p.setProductName("Mobile");
    			 p.setProductPrice(30);
    			 p.setProductQuantity(productQuantity);
    			 m1.put(3,p);
    		 }
    	}
    	
    	else if(productId==4)
    	{
    		 if(m1.containsKey(productId))
    		 {
    				Product k =(Product)m1.get(productId);
    				k.setProductQuantity(productQuantity+(int)k.getProductQuantity());
    				m1.put(productId,k);
       		 }
    		 else 
    		 {
    			 p =new Product();
    			 p.setProductName("Headphone");
    			 p.setProductPrice(40);
    			 p.setProductQuantity(productQuantity);
    			 m1.put(4,p);
    		 }
    	}
    	
    	else
    	{
    		System.err.println("please enter a valid option:");
    	}
    	
    	
    }
    public void removePriduct(int productId)
    {
    
    	if(m1.containsKey(productId)) 
    	{
        	m1.remove(productId);

    	}
	
      else 
      {
    	System.err.println("please enter valid id");
     }
    }
    
    
	public void showProducts()
	{
		Set key=m1.keySet();
		Iterator itr=key.iterator();
		while(itr.hasNext())
		{
			Object a=itr.next();
			System.out.println(m1.get(a).getProductName()+"\t"+m1.get(a).getProductPrice()+"\t"+m1.get(a).getProductQuantity());
			totalPrice+=(int)m1.get(a).getProductPrice()*(int)m1.get(a).getProductQuantity();
			System.out.println("totalprice:"+totalPrice);

		}
		System.out.println("totalprice:"+totalPrice);
	}
	public int productCount(){
		return m1.size();
	}
	public void updateProduct(int prodId)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter updated quantity");
			int quan=sc.nextInt();
		Product k =(Product)m1.get(prodId);
		k.setProductQuantity(quan+(int)k.getProductQuantity());
		m1.put(prodId,k);

		
	

		
	}
	 
		
}

