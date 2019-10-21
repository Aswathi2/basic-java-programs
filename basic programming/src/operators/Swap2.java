package operators;
import java.util.Scanner;
public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the num1");
int a=s.nextInt();
System.out.println("enter num2");
int b=s.nextInt();
a=a+b;b=a-b;a=a-b;
System.out.printf("a=%d\n",a);
System.out.printf("b=%d",b);
	}

}
