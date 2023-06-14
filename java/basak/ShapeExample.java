abstract class Shape {
    abstract double calculateArea();
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class ShapeExample {
    public static void main(String[] args) {
        Square square = new Square(5);
        double squareArea = square.calculateArea();
        System.out.println("Area of the square: " + squareArea);

        Circle circle = new Circle(3);
        double circleArea = circle.calculateArea();
        System.out.println("Area of the circle: " + circleArea);
    }
}
