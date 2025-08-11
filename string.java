public class string {
    public static void main(String[] args) {
        String in = "JavJja";
        int[] freq = new int[256];  // Create array to store frequency of each character

        // Count frequency of each character
        for (int i = 0; i < in.length(); i++) {
            freq[in.charAt(i)]++;
        }

        // Print characters and their frequency
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }
    }
}
