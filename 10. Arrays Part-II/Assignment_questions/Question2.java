import java.util.*;
public class Question2 {
    public static int PresentInwhichNumber(int arr[], int target){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={4, 5, 6, 7, 0, 1, 2};
        System.out.println(PresentInwhichNumber(arr, 4));
    }
}
