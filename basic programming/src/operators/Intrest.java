package operators;
import java.util.Scanner;
public class Intrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the principle amount");
int p=s.nextInt();
System.out.println("enter the no of yrs");
int n=s.nextInt();
System.out.println("enter the rate of I");
float r=s.nextFloat();
float i=p*n*r/100;
System.out.printf("interest=%.2f",i);



	}

}
