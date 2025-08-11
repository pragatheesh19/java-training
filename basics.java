import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter shape :");
        String shape = sc.nextLine().toLowerCase();

        System.out.println("What do you want to calculate?");
        String type = sc.nextLine().toLowerCase();

        if (shape.equals("square")) {
            System.out.println("Enter side:");
            int side = sc.nextInt();
            int area = side * side;
            int perimeter = 4 * side;
            print(shape, type, area, perimeter);

        } else if (shape.equals("rectangle")) {
            System.out.println("Enter length and breadth:");
            int length = sc.nextInt();
            int breadth = sc.nextInt();
            int area = length * breadth;
            int perimeter = 2 * (length + breadth);
            print(shape, type, area, perimeter);

        } else if (shape.equals("circle")) {
            System.out.println("Enter radius:");
            int radius = sc.nextInt();
            double area = Math.PI * radius * radius;
            double perimeter = 2 * Math.PI * radius;
            print(shape, type, area, perimeter);

        } else if (shape.equals("triangle")) {
            System.out.println("Enter side of equilateral triangle:");
            int side = sc.nextInt();
            double area = (Math.sqrt(3) / 4) * side * side;
            int perimeter = 3 * side;
            print(shape, type, area, perimeter);

        } else {
            System.out.println("Unsupported shape.");
        }

        sc.close();
    }

    static void print(String shape, String type, int area, int perimeter) {
        if (type.equals("area")) {
            System.out.println("Area of " + shape + " = " + area);
        } else if (type.equals("perimeter")) {
            System.out.println("Perimeter of " + shape + " = " + perimeter);
        } else if (type.equals("both")) {
            System.out.println("Area of " + shape + " = " + area);
            System.out.println("Perimeter of " + shape + " = " + perimeter);
        } else {
            System.out.println("Invalid calculation type.");
        }
    }

    static void print(String shape, String type, double area, double perimeter) {
        if (type.equals("area")) {
            System.out.println("Area of " + shape + " = " + area);
        } else if (type.equals("perimeter")) {
            System.out.println("Perimeter of " + shape + " = " + perimeter);
        } else if (type.equals("both")) {
            System.out.println("Area of " + shape + " = " + area);
            System.out.println("Perimeter of " + shape + " = " + perimeter);
        } else {
            System.out.println("Invalid calculation type.");
        }
    }
}
