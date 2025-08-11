public class transs {
    public static void main(String[] args) {
        int [][]arr= {{1,6,7},{9,18,15},{21,8,14}};
        int count =0;
        for(int i = 0 ; i <arr.length ;i++) {
        	for (int j =i+1;j<arr[i].length;j++) {
        		int temp = arr[i][j];
        		arr[i][j] = arr[j][i];
        		arr[j][i]=temp;
        		count++;
        	}
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            }
        
    }
}