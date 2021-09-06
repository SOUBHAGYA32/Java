abstract class Shape {
	abstract public double area();
	abstract public double perimeter();
}
class Circle extends Shape{
	double radious;
	public double area()
	{
		return Math.PI*radious*radious;
	}
	public double perimeter()
	{
		return 2*Math.PI*radious;
	}

}
class Rectangle extends Shape {
	double length;
	double breadth;
	public double area()
	{
		return length*breadth;
	}
	public double perimeter()
	{
		return 2*(length+breadth);
	}
}
public class Abstract1{
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=5;
        
        Shape s=r;
        System.out.println("Area of the Rectangle : "+s.area());
        System.out.println("Perimeter of the Rectangle: "+s.perimeter());

        Circle c=new Circle();
        c.radious=3.4;
        Shape s1=c;
        System.out.println("Area of the Circle : "+s1.area());
        System.out.println("Perimeter of the Circle"+s1.perimeter());
	}
}