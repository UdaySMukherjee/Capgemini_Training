package DSA;

import java.util.Arrays;

public class SetZeroMatrix {
    
    static void findZero(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        boolean[] rowZero = new boolean[row];
        boolean[] colZero = new boolean[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rowZero[i] || colZero[j]) {
                    arr[i][j] = 0;
                }
            }
        }
        
        for(int[] is : arr) {
        	System.out.println(Arrays.toString(is));
        }
    }
    
    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0}, {3,4,5,2}, {1, 3, 1,5}};
        findZero(arr);
    }
}
