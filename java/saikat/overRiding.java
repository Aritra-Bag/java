import java.util.Scanner;


abstract class Shape{
    abstract float area();
}

class Square extends Shape{
    float side;
    Square(float a){
        side = a;
    }

    float area(){
        return side*side;
    }     
}

class Circle extends Shape{
    float radius;
    Circle(float r){
        radius = r;
    }

    float area(){
        return 3.14f*radius*radius;
    }
}

class OverRiding {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        float l = sc.nextFloat();
        System.out.print("Enter radius of circle: ");
        float r = sc.nextFloat();

        Square s = new Square(l);
        Circle c = new Circle(r);
        
        System.out.println("Area of square is: "+s.area());
        System.out.println("Area of circle is: "+c.area());
    }
}