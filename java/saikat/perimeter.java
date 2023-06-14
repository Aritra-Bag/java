
import java.util.Scanner;
interface Shape{
	float perimeter(float a);
}

class Square implements Shape{
	public float perimeter(float  a) {
		return 4.0f*a;
	}
}

class Circle implements Shape{
	public float perimeter(float a) {
		return 2*3.14f*a;
	}
}

class Perimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length of Square: ");
		float len = sc.nextFloat();
		System.out.print("Enter radius of Circle: ");
		float r = sc.nextFloat();
		sc.close();
		
		Square s = new Square();
		Circle c = new Circle();
		
		System.out.println("Perimeter of the Square is: "+s.perimeter(len));
		System.out.print("Perimeter of the Circle is: "+c.perimeter(r));
		

	}

}