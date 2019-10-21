package controlstructures;
import java.util.Scanner;
public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int factr=1;
			int i=2;
		for(i=2;i<=a/2;i++)
		{
		if(a%i==0){
			int fact=1;
		factr=fact*i;
		}

		}
		System.out.printf("%d",factr);
		s.close();
		}
	}


