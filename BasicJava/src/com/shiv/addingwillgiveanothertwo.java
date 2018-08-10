package com.shiv;

public class addingwillgiveanothertwo {
	
	public static void add(int a, int b, int c, int d){
		
		for(int temp = a;a<c;a = a+b){
			if(temp==c){
				break;
			}
		}
		
		for(int temp1 =b;b<d; b = a+b){
			if(temp1==d){
				break;
			}
		}
	}
	
	public static void main(String[] args){
		add(12,14,15,16);
	}
}
