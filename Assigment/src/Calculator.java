//calculator program

import java.util.*;
 class calculator_class{
	public float a;
	public float b;
	
	
	 public float read(float x)
	{Scanner sc=new Scanner(System.in);
	x=sc.nextFloat();
	return x;
	}
	 public void write(float x)
	{System.out.println("vlaue of the operations till are = "+x);}
	 public float Addition(float x,float y)
	{float z=x+y;
	return z;}
	
	public float Substraction(float x,float y){
		float z=x-y;
		return z;}
	
	public float Multiplication(float x,float y)
	{float z=x*y;
	return z;}
	
	float Division(float x,float y){
		float z=x/y;
		return z;}
	public float Square(float x){
		return x*x;
	}
	public float Sin(float x)
	{
		float y=(float)Math.sin(x);
		return y;}
	public float Cos(float x){
		float y=(float)Math.cos(x);
		return y;
	}
	public float Min(float x,float y){
		float z=Math.min(x, y);
		return z;}
	public float Max(float x,float y)
	{
		float z=Math.max(x, y);
		return z;}}

public class Calculator {
public static void main(String args[])
{
calculator_class c=new calculator_class();

while(true)
{
	System.out.println("Enter 1 for intialising calculator to zero");
	System.out.println("Enter 2 for one input");
	System.out.println("Enter 3 for two input");
	System.out.println("Enter 4 for print output till now");
	System.out.println("Enter 5 for addition");
	System.out.println("Enter 6 for substraction");
	System.out.println("Enter 7 for multiplication");
	System.out.println("Enter 8 for division");
	System.out.println("Enter 9 for sin of a number");
	System.out.println("Enter 10 for cos of a number");
	System.out.println("Enter 11 for minimum of two number");
	System.out.println("Enter 12 for maximum of two number");
	System.out.println("Enter 13 for exit");
	System.out.println("Enter your choice");
    Scanner sc=new Scanner(System.in);
	int choice =sc.nextInt();
switch(choice)
{
case 1:
	c.a=0;
	break;
case 2:
	c.b=c.read(c.b);
	break;
case 3:
	c.a=c.read(c.a);
	c.b=c.read(c.b);
	break;
case 4:
	c.write(c.a);
	break;
case 5:
	c.a=c.Addition(c.a,c.b);
	break;
case 6:
	c.a=c.Substraction(c.a,c.b);
	break;
case 7:
	c.a=c.Multiplication(c.a, c.b);
	break;
case 8:
	c.a=c.Division(c.a,c.b);
	break;
case 9:
	c.a=c.Sin(c.b);
	break;
case 10:
	c.a=c.Cos(c.b);
	break;
case 11:
	c.a=c.Min(c.a, c.b);
	break;
case 12:
	c.a=c.Max(c.a, c.b);
	break;
case 13:
	java.lang.System.exit(1);
}
}
}
}
