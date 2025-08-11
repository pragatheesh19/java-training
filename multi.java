public class multi {
    public static void main(String[] args) {
        int[] one = {1, 2, 3, 4, 5, 6};
        int rows = 2;
        int cols = 3;
        int c = rows*cols;
        if(c==one.length) {
        int [][]arr=new int[rows][cols];
        int count =0;
        for(int i = 0 ; i <rows ;i++) {
        	for (int j =0;j<cols;j++) {
        		arr[i][j] = one[count];
        		count++;
        	}
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            }
        }
        else {
        		System.out.println("invalid");
        	}
    	}
}