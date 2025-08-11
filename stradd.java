public class stradd {
    public static void main(String[] args) {
        String str1 = "124";
        String str2 = "456";
        int carry = 0;
        String result = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            int num1 = str1.charAt(i) - '0';
            int num2 = str2.charAt(i) - '0';
            int sum = num1 + num2 + carry;
            carry = sum / 10;
            result = (sum % 10) + result;
        }
        if (carry > 0) {
            result = carry + result;
        }
        System.out.println(result);
    }
}
