import java.util.*;


class RemoveDuplicateLettersFromStringArray{

    public static String fun(String str){
        int[] visited = new int[123];
        String result="";
        for(int i=0;i<str.length();i++){
            if(visited[str.charAt(i)]==0){
                result+=str.charAt(i);
                visited[str.charAt(i)]++;
            }
        }
        return result;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        sc.nextLine();
        String[] array1 = new String[size];
        String[] array2 = new String[size];
        for(int i=0;i<size;i++){
            array1[i]=sc.nextLine();
        }
        for(int i=0;i<size;i++){
            array2[i]=fun(array1[i]);
        }
        System.out.println(Arrays.toString(array2));
    }
}
