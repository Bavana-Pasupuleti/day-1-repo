//Assignment 1 problem 4

//here i have taken 2 packages one used for console display and one for logic purposes

//Console Package
package com.hsbc.assignment1.UI;
import  com.hsbc.assignment1.BL.Number;
public class UiMain{
		public static void main(String[] args) {
			Number n1=new Number();
		System.out.println( "Please enter a 3 digit number");
		n1.getNumber();
		n1.display ();

	}
}
//Logic Package
package com.hsbc.assignment1.BL;
import java.util.Scanner;
public class Number {
Scanner sc;
int val;
public void getNumber(){
sc=new Scanner (System. in) ;
val=sc.nextInt();
}
public void display(){
int[] arr=new int[3];
for (int i=0;i<3;i++){
int temp;
temp=val%10;
arr[i]=temp;
val=val/10;
}
system.out.println(" ("arr[2]+"x 100) + ("arr[1]+"x 10) +"+arr[0]);
}
}
