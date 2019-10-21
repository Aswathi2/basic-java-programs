package controlstructures;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc=new Scanner(System.in);
System.out.println("enter the number:");
int i=Sc.nextInt();
int a=0;
int b=1,c;
{
for(i=0;i<=8;i++)
{
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;

}		}
	}	
}
