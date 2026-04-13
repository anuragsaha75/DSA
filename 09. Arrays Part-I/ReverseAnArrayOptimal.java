
import java.lang.reflect.Array; 
import java.util.Arrays;



public class ReverseAnArrayOptimal{

    

    public static int[] ReverseArray(int arr[]){

    int first=0;
    int last = arr.length-1;
        while(first<last) {
            
            int temp = arr[first];

            arr[first] = arr[last];

            arr[last] = temp;

            first++;
            last--;

        }

        return arr;

    }

   

    public static void main(String[] args) {

        int array[] = {1,2,3,4,5,6,7,8,9,10};

       System.out.println(Arrays.toString(ReverseArray(array))); 
        
    }
}