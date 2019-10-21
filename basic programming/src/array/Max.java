package array;
import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int i=0,j=0;
System.out.println("enter the size");
int size=s.nextInt();
int[]a=new int[size];
System.out.println("enter array");
for(i=0;i<size;i++)
{
	a[i]=s.nextInt();
if(a[i]>=j)
{
j=a[i];	
}}
System.out.printf("max value is %d",j);

}}