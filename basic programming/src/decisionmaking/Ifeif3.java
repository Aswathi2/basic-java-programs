package decisionmaking;
import java.util.Scanner;
public class Ifeif3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the mark");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a>=80) {
	System.out.println("grade is A");
}
else if(a>=60&&a<80) {
	System.out.println("grade is B");
}
else if(a>=40&&a<60) {
	System.out.println("grade is C");
}
else {
	System.out.println("failed");
}



	}

}
