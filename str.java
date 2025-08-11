public class str {
    public static void main(String[] args) {
        String str = "hello world";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j) && i != j) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(ch);
                return;
            }
        }
        System.out.println("No non-repeating character found.");
    }
}
