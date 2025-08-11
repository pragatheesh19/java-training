public class move {
    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 1, 3, 0, 4};
        int l = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[l];
                arr[l] = arr[i];
                arr[i] = temp;
                l++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
