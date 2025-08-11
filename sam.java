public class sam {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "Silent";
        if (str1.length() != str2.length()) {
            System.out.println("not anagram");
            return;
        }
        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println("not anagram");
                return;
            }
        }
        System.out.println("anagram");
    }
}
