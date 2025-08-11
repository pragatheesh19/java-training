import java.util.Scanner;

public class  pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        int upper = 0, lower = 0, digit = 0, special = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch >= 'A' && ch <= 'Z') upper++;
            else if (ch >= 'a' && ch <= 'z') lower++;
            else if (ch >= '0' && ch <= '9') digit++;
            else special++;
        }
        if (password.length() >= 8 && upper > 0 && lower > 0 && digit > 0 && special > 0)
            System.out.println("Password is strong ");
        else {
            System.out.println("Password is not strong ");
        }
    }
}
