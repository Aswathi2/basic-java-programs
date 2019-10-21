package operators;
import java.util.Scanner;
public class Maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the first number");
int a=s.nextInt();
System.out.println("enter the second number");
int b=s.nextInt();
System.out.printf("sum =%d\n",a+b);
System.out.printf("sub=%d\n",a-b);
System.out.printf("mul=%d\n",a*b);
System.out.printf("div=%d\n",a/b);
System.out.printf("mod=%d\n",a%b);
	}

}
