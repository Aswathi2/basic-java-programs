package controlstructures;
import java.util.Scanner;
public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int a=n,r,sum=0,i;
while(n>0) {
	int f=1;
	r=n%10;
	for(i=1;i<=r;i++)
	{
		f=f*i;
	}
	sum=sum+f;
	n=n/10;
}
	if(sum==a)
		System.out.println("strong");
	else {
		System.out.println("not strong");
	}
	s.close();
	}
}
