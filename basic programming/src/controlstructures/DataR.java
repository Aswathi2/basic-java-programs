package controlstructures;
import java.io.*;
public class DataR {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int s=0;int a;
do {
	System.out.println("enter the number");
	a=Integer.parseInt(br.readLine());
if(a>0)
{
s=s+a;
	}
}while(a>0);
System.out.println(s);
}}
