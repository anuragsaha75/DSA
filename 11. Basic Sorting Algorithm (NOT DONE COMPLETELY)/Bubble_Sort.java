
import java.util.Arrays;


public class Bubble_Sort{


    public static int[] BubbleSort(int arr[]){
        for(int iteration=0; iteration<=arr.length-1; iteration++){
            for(int j=0;j<arr.length-1-iteration; j++){
                // why (j<=arr.length-1-iteration) ??
                // because 1 iterations results to sort 1 element(pushes to the last)
                // Means (arr.length - 1)= last element.
                //But after 1 element sorted, I have to travel till 2nd last. So, It bocomes (arr.length - 1 -1)
                // Like this way , after 2nd element sorted, I have to travel till 3rd last. So, It bocomes (arr.length - 1 -2)
                // So, (1,2,3,.. = i) beacause it is increasing same as itertaion. 
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        return arr;
    }
    public static void main(String[] args) {

        int arr[]={5,4,3,7,1};
        String s = Arrays.toString(BubbleSort(arr));
        System.out.print(s);

    }
}