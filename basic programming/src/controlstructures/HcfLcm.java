package controlstructures;
import java.util.Scanner;
public class HcfLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter value a");
int a=s.nextInt();
System.out.println("enter value b");
int b=s.nextInt();
int min,i,max,gcd=0,lcm=0;
min=(a<b)?a:b;
max=(a>b)?a:b;
	for(i=min;i>=1;i--)
	{
	if(a%i==0 && b%i==0)
	{
		gcd=i;
	
	break;
	}
		}
	for(i=max;;i++)
	{
		if(i%a==0 && i%b==0) {
			 lcm=i;
		break;}
	}
System.out.println(gcd);
System.out.println(lcm);
	s.close();
	}

}
