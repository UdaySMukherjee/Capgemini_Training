package ExceptionHandling;


public class ArrayException {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 5, 4, 1, 2, 6, 9};
        int[] array = null; 
//        System.out.println("Array length is " + arr.length);
        try {
            System.out.println("Try 1");
            // System.out.println(arr[10]);
            System.out.println(array.length); 
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Element not reachable");
            e.printStackTrace();
        } 
        catch(NullPointerException e1) {
            System.out.println("NULL POINTER");
            e1.printStackTrace();
        }
    }
}
