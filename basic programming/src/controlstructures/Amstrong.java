package controlstructures;
import java.io.*;
public class Amstrong {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the value");
int a=Integer.parseInt(br.readLine());
int n=a,r=1;
double s=0;
int c=0;
while(a>0)
{
a=a/10;	
c++;
}
a=n;
while(a!=0) {
	r=a%10;
	s=(int) (s+(Math.pow(r,c)));
	a=a/10;
}
if(s==n)
System.out.println("amstrong");
else
	System.out.println("not amstrong");
	}

}
