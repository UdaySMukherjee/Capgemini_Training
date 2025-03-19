class Solution {
    public static void main(String[] args) {
        int[] a = {1,2,4,6,5,3,0};
        int  start = 0;int end = a.length-1;int mid = 0;
        while (start != end){
            mid = start + (end - start)/2;
            if (a[mid] >= a[mid+1]){
                end = mid;
            } else{
                start = mid+1;
            }
        }
        System.out.print(start);
    }
}
