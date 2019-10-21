package array;
import java.util.Scanner;
public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int i,j=0,k=0,sum=0,sum1=0;
float avg=1,avg1=1;
System.out.println("enter size");
int size=s.nextInt();
int[]a1=new int[size];
int[]a2=new int[size];
int[]a3=new int[size];
System.out.println("enter first array");
for(i=0;i<size;i++)
{
	//System.out.println("value at index["+i+"]");
a1[i]=s.nextInt();
if(a1[i]%2==0)
{
	a2[j]=a1[i];
	j++;
}
else {
	a3[k]=a1[i];
	k++;
}}
System.out.println("even array");
for(i=0;i<j;i++) 
{
System.out.println(a2[i]);
sum=sum+a2[i];
}
System.out.println("odd array");
for(i=0;i<k;i++) {
System.out.println(a3[i]);
sum1=sum1+a3[i];}

	avg=sum/j;
	System.out.printf("avg of even array%f\n",avg);
	avg1=sum1/k;
	System.out.printf("avg of odd array%f",avg1);
	}}


