public class mnum {
    public static void main(String[] args) {
        int n = 5;
        printnum(1, n);
    }
    public static int printnum(int i, int n) {
        if (i <= n) {
        System.out.print(i + " ");
        return printnum(i + 1,n);
        }
        return 0 ; 
        }
    }

