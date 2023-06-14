import java.io.*;


class Shape{
	int calcArea(int a) {
		return a*a;
	}
	
	float calcArea(float r) {
		return 3.14f*r*r;
	}
}
class OverLoading {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		int len = 0;
		float r = 0.0f;
		try {
			System.out.print("Enter length of Square: ");
			len = Integer.parseInt(br.readLine());
			System.out.print("Enter radius of Circle: ");
			r = Float.parseFloat(br.readLine());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		Shape obj = new Shape();
		System.out.println("Area of the Square is: "+obj.calcArea(len));
		System.out.println("Area of the Circle is: "+obj.calcArea(r));
	}
}