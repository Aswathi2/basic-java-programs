package decisionmaking;
import java.util.Scanner;
public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the year");
int a=s.nextInt();
if(a%4==0)
{
	if(a%100==0) 
	{
		if(a%400==0)
	System.out.println("leap year");
        else
	        System.out.println("not a leap year");
	}
	else
		System.out.println("leap year");
}
else
	System.out.println("leap year");

s.close();
}
	
	}
