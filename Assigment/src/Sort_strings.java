import java.lang.*;
import java.util.*;
public class Sort_strings {
public static void main(String args[])
{
int x;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of names = ");
x=sc.nextInt();
String arr[]=new String[x];
System.out.print("Enter all "+x+ " names");
for(int i=0;i<x;i++)
{arr[i]=sc.next();}
for(int i=0;i<x;i++)
	{
	String min=arr[i];
	int k=i;
	for(int j=i;j<x;j++)
	{
	if(min.compareTo(arr[j])>0)	
		{min=arr[j];
		k=j;
		}
	}
	String swap=arr[k];
	arr[k]=arr[i];
	arr[i]=swap;
	}
System.out.print("Sorted order names are = ");
for(int i=0;i<x;i++)
	System.out.print(" "+arr[i]);
}
}
