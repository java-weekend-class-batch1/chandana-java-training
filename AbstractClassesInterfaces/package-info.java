package com.training.AbstractClassesInterfaces;
public class ShapeApp {

    // 🔹 Abstract Class
    static abstract class Shape {
        protected String name;

        public Shape(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public abstract double area();
        public abstract double perimeter();
    }

    // 🔹 Rectangle Class
    static class Rectangle extends Shape {
        private double length, width;

        public Rectangle(double length, double width) {
            super("Rectangle");

            if (length < 0 || width < 0) {
                throw new IllegalArgumentException("Length and width must be non-negative");
            }

            this.length = length;
            this.width = width;
        }

        public double area() {
            return length * width;
        }

        public double perimeter() {
            return 2 * (length + width);
        }
    }

    // 🔹 Circle Class
    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            super("Circle");

            if (radius < 0) {
                throw new IllegalArgumentException("Radius must be non-negative");
            }

            this.radius = radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }

        public double perimeter() {
            return 2 * Math.PI * radius;
        }
    }

    // 🔹 Triangle Class
    static class Triangle extends Shape {
        private double a, b, c;

        public Triangle(double a, double b, double c) {
            super("Triangle");

            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalArgumentException("Sides must be positive");
            }

            // Triangle inequality
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalArgumentException("Invalid triangle sides");
            }

            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double perimeter() {
            return a + b + c;
        }

        public double area() {
            double s = perimeter() / 2; // semi-perimeter
            return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
        }
    }

    // 🔹 MAIN METHOD
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("java ShapeApp circle radius");
            System.out.println("java ShapeApp rectangle length width");
            System.out.println("java ShapeApp triangle a b c");
            return;
        }

        String type = args[0].toLowerCase();
        Shape shape = null;

        try {
            switch (type) {

                case "circle":
                    if (args.length != 2) {
                        System.out.println("Circle requires 1 value (radius)");
                        return;
                    }
                    double r = Double.parseDouble(args[1]);
                    shape = new Circle(r);
                    break;

                case "rectangle":
                    if (args.length != 3) {
                        System.out.println("Rectangle requires 2 values (length width)");
                        return;
                    }
                    double l = Double.parseDouble(args[1]);
                    double w = Double.parseDouble(args[2]);
                    shape = new Rectangle(l, w);
                    break;

                case "triangle":
                    if (args.length != 4) {
                        System.out.println("Triangle requires 3 values (a b c)");
                        return;
                    }
                    double a = Double.parseDouble(args[1]);
                    double b = Double.parseDouble(args[2]);
                    double c = Double.parseDouble(args[3]);
                    shape = new Triangle(a, b, c);
                    break;

                default:
                    System.out.println("Invalid shape type!");
                    return;
            }

            // 🔹 Output
            System.out.printf("%s: area = %.2f, perimeter = %.2f\n",
                    shape.getName(),
                    shape.area(),
                    shape.perimeter());

        } catch (NumberFormatException e) {
            System.out.println("❌ Invalid number format!");
        } catch (IllegalArgumentException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }
}