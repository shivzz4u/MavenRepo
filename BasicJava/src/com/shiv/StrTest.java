package com.shiv;

public class StrTest {

	public static void main(String[] args) {
		String s = "abc";
		StringBuffer k = new StringBuffer("dfadsf");
		String t="";
		int a[] = {3,4,5,6};
		int l = s.length();
		k.reverse();
		
		char u[] = s.toCharArray();
			
		for(int i=0;i<u.length;i++)
		{
			System.out.println(u[i]);
			t = t + u[i];
		}
		System.out.println(t);	
	}
}