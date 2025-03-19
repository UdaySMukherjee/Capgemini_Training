public class Symmetric { 

 public static boolean isSymmetric(int mat[][]) { 
    for (int i = 0; i < mat.length; i++) {
        for (int j = i+1; j < mat[0].length; j++) {
            if(i!=j){
                if (mat[i][j] != mat[j][i]) {
                    return false; 
                }
            }
        }
    }
    return true; 
} 
    public static void main (String[] args) { 
            int mat[][] = { { 1, 3, 5 }, { 3, 2, 4 }, { 5, 4, 1 } }; 
    if (isSymmetric(mat)) 
        System.out.println(  "SYMMETRIC"); 
    else 
        System.out.println("NOT SYMMETRIC"); 
          
    } 
} 
