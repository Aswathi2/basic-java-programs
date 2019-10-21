package operators;
import java.util.Scanner;
public class Midpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter x1");
int x1=s.nextInt();
System.out.println("enter x2");
int x2=s.nextInt();
System.out.println("enter y1");
int y1=s.nextInt();
System.out.println("enter y2");
int y2=s.nextInt();
int a=(x1+x2)/2;
int b=(y1+y2)/2;
System.out.printf("midpoint=(%d,%d)",a,b);
	}

}
