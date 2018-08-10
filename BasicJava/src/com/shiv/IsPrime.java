package com.shiv;

public class IsPrime {
	  public static void main(String args[]){
		  int num=9;
		 
		  for(int i=1;i<num/2;i++){
			  if(num%i==0){
				  System.out.println("is prime");
			  }
		  }
	  }
}