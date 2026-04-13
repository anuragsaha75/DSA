import java.util.*;


public class SumOfTwoElementsIs10InArray {

    public static void Target10(int arr[]){

            Arrays.sort(arr);
            int first = 0;
            int last = arr.length-1;
            
        while(first<last){
            int sum = arr[first]+arr[last];
            if(sum==10){
                System.out.println("The two elements are : "+arr[first]+" and "+ arr[last]);
                return;
            } else if (sum<10){
                first++;
            } else {
                last--;
            }
        }
        
    }
  

    public static void main(String[] args){
        int arr[] = {2,3,5,8,11};
        Target10(arr);

    }
}


