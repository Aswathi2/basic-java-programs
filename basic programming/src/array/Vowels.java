package array;
import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int size,i;
System.out.println("enter size");
size=s.nextInt();
String []b=new String[size];
System.out.println("enter strings");
for(i=0;i<size;i++)
{
    b[i]=s.next();
}
char c;
for(i=0;i<size;i++)
{
     c=b[i].charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
{
	System.out.println(b[i]);
}
}
s.close();
}}
