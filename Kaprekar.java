import java.util.Scanner;
public class Kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int d = 0;
        while (temp > 0) {
            d++;
            temp = temp / 10;
        }
        int sq = n * n;
        int div = 1;
        for (int i = 1; i <= d; i++) {
            div = div * 10;
        }
        int r = sq % div;
        int l = sq / div;
        if (l + r == n) {
            System.out.println("Kaprekar");
        } else {
            System.out.println("Not Kaprekar");
        }
    }
}
