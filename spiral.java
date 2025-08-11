public class spiral {
    public static void main(String[] args) {
        int[][] arr = {{1, 6, 7}, {9, 18, 15}, {21, 8, 14}};
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.println(arr[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.println(arr[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.println(arr[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.println(arr[i][left]);
                }
                left++;
            }
        }
    }
}
