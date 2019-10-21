package array;
import java.util.Scanner;
public class SecondL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int i,temp;
System.out.println("enter size");
int size=s.nextInt();
int a[]=new int[size];
System.out.println("enter array");
for(i=0;i<size;i++)
{
	a[i]=s.nextInt();
}
i=0;
int c=0;
while(c<=size) 
	{
if(a[i]>a[i+1])
{
	temp=a[i];
	a[i]=a[i+1];
	a[i+1]=temp;
	i++;c++;
}
else {
	i++;c++;
}
	}
System.out.printf("second largest number is %d",a[size-1]);

s.close();}
}
