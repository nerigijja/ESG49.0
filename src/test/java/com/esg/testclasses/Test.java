package com.esg.testclasses;

import com.esg.utilities.HelperClass;

public class Test extends HelperClass{
	
	
	
	public static void LeapYear() {
		int A = 2019;
		if ((A%4 ==0)&&((A%100!=0)) ||(A%400==0)) {
			
			System.out.println("Year is a Leap year");
			
		} else {
			System.out.println("Year is Not a Leap year");
		}
		
	
	}
	
	public static void If_Else_If() {
		
		int Marks = 65;
		
		if (Marks< 55) {
			System.out.println("The Subject is Failed");
			
		}
		else if ((Marks >= 55) && (Marks <= 65)) {
			
			System.out.println("The Subject is Pass");
			
		}
			else if ((Marks >= 50) && (Marks <65)) {
			
			System.out.println("The Subject Pass in D grade");
			
		}
		
	}
	public static void Pyramid() {
		
		for(int i=1;i<=5;i++){  
			for(int j=1;j<=i;j++){  
			        System.out.print("* ");  
			}  
			System.out.println();//new line  
			}  
			}
	
	public static void PyramidExample2() {  
		
		int term=6;  
		for(int i=1;i<=term;i++){  
		for(int j=term;j>=i;j--){  
		        System.out.print("* ");  
		}  
		System.out.println();//new line  
		}  
		}  
		
	public static void PrimeNumber() {
		int i=100;
		
		for(i=1; i%2==0; i++ )
			System.out.println("prime number");
	}

	public static void main(String args[])
{
		//Pyramid();
	//	PyramidExample2();
		PrimeNumber();
		}
}
