import java.util.*;

public class shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter shape:");
        String shape = sc.next();

        System.out.println("area / perimeter:");
        String type = sc.next();

        if (shape.equalsIgnoreCase("circle")) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            if (type.equalsIgnoreCase("area")) {
                System.out.println("Area = " + (3.14 * r * r));
            } else {
                System.out.println("Perimeter = " + (2 * 3.14 * r));
            }
        }

        else if (shape.equalsIgnoreCase("square")) {
            System.out.print("Enter side: ");
            int s = sc.nextInt();
            if (type.equalsIgnoreCase("area")) {
                System.out.println("Area = " + (s * s));
            } else {
                System.out.println("Perimeter = " + (4 * s));
            }
        }

        else if (shape.equalsIgnoreCase("rectangle")) {
            System.out.print("Enter length: ");
            int l = sc.nextInt();
            System.out.print("Enter breadth: ");
            int b = sc.nextInt();
            if (type.equalsIgnoreCase("area")) {
                System.out.println("Area = " + (l * b));
            } else {
                System.out.println("Perimeter = " + (2 * (l + b)));
            }
        }

        else if (shape.equalsIgnoreCase("triangle")) {
            System.out.print("Enter side a: ");
            int a = sc.nextInt();
            System.out.print("Enter side b: ");
            int b = sc.nextInt();
            System.out.print("Enter side c: ");
            int c = sc.nextInt();
            if (type.equalsIgnoreCase("area")) {
                double s = (a + b + c) / 2.0;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println("Area = " + area);
            } else {
                System.out.println("Perimeter = " + (a + b + c));
            }
        }

        else {
            System.out.println("Invalid shape");
        }
    }
}
