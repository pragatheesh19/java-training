import java.util.Scanner;
public class strco{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        int count = 0;
        boolean s = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                if (!s) {
                    count++;
                   s = true;
                }
            } else {
                s = false;
            }
        }
        System.out.println(count);
    }
}
