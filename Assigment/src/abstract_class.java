abstract class Shape{
abstract void number_of_sides(int a);}

class Trapezoid extends Shape{
	void number_of_sides(int a)
	{
		System.out.println("number of sides in trapezoid is = "+a);
}}
class Triangle extends Shape{
		void number_of_sides(int a)
		{
			System.out.println("number of sides in triangle is = "+a);
	}}
class Hexagon extends Shape{
			void number_of_sides(int a)
			{
				System.out.println("number of sides in Hexagon is = "+a);
		}
						
	
}
public class abstract_class {
public static void main(String args[])
{
	Shape s=new Trapezoid();
	s.number_of_sides(4);
	 s=new Triangle();
	s.number_of_sides(3);
	 s=new Hexagon();
	s.number_of_sides(6);
	
}
}

