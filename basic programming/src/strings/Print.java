package strings;
import java.util.Scanner;
public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.next();
		char a;
		int i,k=0,j,c=0;
	int length=str.length();
		for(i=0;i<length;i++)
		{
		a=str.charAt(i);
		
		if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
		{
			c++;
			for(j=0;j<c;j++)
			{
				System.out.print("*");
			}
			System.out.print(a);
		for(k=0;k<c;k++)
		{
			System.out.print("*");
		}
		}
		
		else
				System.out.print(a);

}
}
}
	
