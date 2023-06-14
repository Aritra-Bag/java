interface Shape {
    double calculatePerimeter();
}

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Shape_Example {
    public static void main(String[] args) {
        Square square = new Square(5);
        double squarePerimeter = square.calculatePerimeter();
        System.out.println("Perimeter of the square: " + squarePerimeter);

        Circle circle = new Circle(3);
        double circlePerimeter = circle.calculatePerimeter();
        System.out.println("Perimeter of the circle: " + circlePerimeter);
    }
}
