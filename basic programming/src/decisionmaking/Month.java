package decisionmaking;
import java.util.Scanner;
public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the date");
String d=s.nextLine();
String a=""+d.charAt(3)+d.charAt(4);
switch(a)
{
case "01":System.out.println("jan");
       break;
case "02":System.out.println("feb");
break;
case "03":System.out.println("march");
break;
case "04":System.out.println("april");
break;
case "05":System.out.println("may");
break;
case "06":System.out.println("jun");
break;
case "07":System.out.println("jul");
break;
case "08":System.out.println("aug");
break;
case "09":System.out.println("sep");
break;
case "10":System.out.println("oct");
break;
case "11":System.out.println("nov");
break;
case "12":System.out.println("dec");
break;
}
s.close();
	}

}
