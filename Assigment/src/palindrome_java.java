import java.util.Scanner;
import java.lang.String;

public class palindrome_java {
	public static void main(String args[])
	{System.out.print("Enter the string to be checked");
	Scanner sc=new Scanner(System.in);	
	String s=sc.nextLine();
	for(int i=0,j=s.length()-1;i<j;i++,j--)
		if(s.charAt(i)!=s.charAt(j))
		{System.out.print("String is not Palindrome");
	   return;}
	   System.out.print("String is Palindrome"); 
		   
	}
	

}
