package mypack;

class AreaCalculator {
    double area(double side) {
        return side * side;
    }

    double area(double length, double width) {
        return length * width;
    }

    double area(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }

    double area(int base, int height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Area of square (side=5): " + calc.area(5));
        System.out.println("Area of rectangle (length=4, width=6): " + calc.area(4, 6));
        System.out.println("Area of circle (radius=3): " + calc.area(3, true));
        System.out.println("Area of triangle (base=4, height=5): " + calc.area(4, 5, true));
    }
}