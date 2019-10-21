package decisionmake;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);	
	int year= s.nextInt();
	switch (year)
	{
	case 1:
		System.out.println("English,Maths,Science");
		break;
	case 2:
		System.out.println("Enter the branch");

		char b=s.next().charAt(0);
		switch (b)
		{
		case 'C':
			System.out.println("Operating system,java,Data Mining");
			break;
		case 'E':
			System.out.println("Microprocessor,Logic Switiching Theory");
			break;
		case 'M':
			System.out.println("Drawing,Manufacturing");
			break;
			
		}
		break;
	case 3:
		System.out.println("Enter the branch");

		char branch=s.next().charAt(0);
		switch (branch)
		{
		case 'C':
			System.out.println("Database,computer organization");
			break;
		case  'E':
			System.out.println("logic design,microelectronics");
			break;
		case 'M':
			System.out.println("internal combustion,mechanics");
			break;
			
		}
		break;
	
	}
}
}
