package array;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s=new Scanner(System.in);
int i;
System.out.println("enter size");
int size=s.nextInt();
int[]val=new int[size];
int[]va=new int[size];
int[]v=new int[size];
System.out.println("enter first array values");
for(i=0;i<size;i++)
{
	System.out.println("value at index["+i+"]");
val[i]=s.nextInt();	
}
System.out.println("enter second array values");
for(i=0;i<size;i++)
{
	System.out.println("value at index["+i+"]");

va[i]=s.nextInt();

}
System.out.println("sum of array");
for(i=0;i<size;i++)
{
	v[i]=val[i]+va[i];
	System.out.println(v[i]);
}


	}

}
