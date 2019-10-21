package decisionmaking;
import java.util.Scanner;

public class Ifeif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value of a");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a==1)
		{
			System.out.println("jan");
		}
		else if(a==2) {
			System.out.println("feb");
		}
			else if(a==3){
			System.out.println("mar");	
			}
			else if(a==4) {
				System.out.println("apr");
			}
			else if(a==5) {
				System.out.println("may");
		}
			else if(a==6) {
				System.out.println("june");
			}
			else if(a==7) {
				System.out.println("july");
			}
			else if(a==8) {
				System.out.println("aug");
			}
			else if(a==9) {
				System.out.println("sep");
			}
			else if(a==10) {
				System.out.println("oct");
			}
			else if(a==11) {
				System.out.println("nov");}
			else if(a==12) {
				System.out.println("dec");
			}
			else {
				System.out.println("not existing month");}
		}
	}


