import java.util.Arrays;

public class Selection_Sort {
    public static int[] SelectionSort(int arr[]){
        int smallest;
        for(int i=0; i<=arr.length-1;i++){
                if(arr[i]>=largest){
                    largest=arr[i];
                }
            for(int j=0;j<arr.length-1;j++){
                int temp=  largest;
                arr[j]=largest;
                largest=temp;
            }
            
        }
       
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {7,9,6,8,4};
        System.out.println(Arrays.toString(SelectionSort(arr)));
        
    }
}
