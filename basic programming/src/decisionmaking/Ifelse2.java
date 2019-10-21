package decisionmaking;
import java.util.Scanner;
public class Ifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the age");
int a=s.nextInt();
if(a>=18&&a<=35)
{
	System.out.println("the person is eligible for psc");
}
else {
	System.out.println("the person isn't eligible for psc");
}
	
	}

}
