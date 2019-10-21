package operators;
import java.util.Scanner;
public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int a=s.nextInt();
int b=a%10;
a=a/10;
System.out.printf("result=%d%d",a*b,a*b);


	}

}
