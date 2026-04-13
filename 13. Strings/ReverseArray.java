import java.util.Arrays;

public class ReverseArray {
    public static int[] Rev(int arr[]){

        for(int i=0;i<(arr.length-1)/2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]= temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(Arrays.toString(Rev(arr)));
        
    }
}
