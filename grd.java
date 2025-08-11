import java.util.Scanner;

public class grd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a == b && b == c && c == d) {
            System.out.println("All values are equal: " + a);
        } else {
            int max = a;
            if (b > max) max = b;
            if (c > max) max = c;
            if (d > max) max = d;

            System.out.println("Largest value is: " + max);
            System.out.print("greatest from :  ");
            if (a == max) System.out.print("a ");
            if (b == max) System.out.print("b ");
            if (c == max) System.out.print("c ");
            if (d == max) System.out.print("d ");
        }
    }
}