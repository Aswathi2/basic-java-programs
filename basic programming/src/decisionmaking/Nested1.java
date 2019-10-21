package decisionmaking;
import java.util.Scanner;
public class Nested1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the value of a");
int a=s.nextInt();
System.out.println("enter the value of b");
int b=s.nextInt();
System.out.println("enter the value of c");
int c=s.nextInt();
if(a>b||a>c) {
	if(a>b) {
		System.out.println("a is greater");}
		else
		{
			System.out.println("b is greater");
		}}
else if(b>c) {
			
			if(b>c) {
				System.out.println("b is greater");
			}
			else {
				System.out.println("c is greater");
			}}
			else {
				System.out.println("c is greater");
			}
	}
	}




