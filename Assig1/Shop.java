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
    		 p.setProductPrice(3000);
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
    			 p.setProductPrice(4000);
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
    			 p.setProductPrice(2500);
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
    			 p.setProductPrice(2500);
    			 p.setProductQuantity(productQuantity);
    			 m1.put(4,p);
    		 }
    	}
    	
    	else
    	{
    		System.err.println("please valid option:");
    	}
    	
    	
    }
    public void removePriduct(int productId)
    {
    	m1.remove(productId);
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
			
		}
		System.out.println("totalprice:"+totalPrice);
	}
	
	 
		
}

