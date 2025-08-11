import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reverse Number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n; 
        int rev = 0, rem;
        int temp = n;
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println("Reversed number: " + rev);

        sc.nextLine(); // Clear the buffer

        // Reverse String
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);

        // Armstrong
        temp = original;
        int sum = 0, count = 0;

        if (original == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }

        temp = original;
        while (temp > 0) {
            rem = temp % 10;
            int power = 1;
            for (int i = 0; i < count; i++) {
                power *= rem;
            }
            sum += power;
            temp /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
