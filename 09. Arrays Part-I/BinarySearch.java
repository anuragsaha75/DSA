public class BinarySearch {


    public static int binary_search(int arr[], int key){

        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2 ;

        while(start<=end)
        {
            if (mid==key){
                return mid;
            }
            else if (mid < key) {     // Right Side Case
                start = mid + 1 ;
            } else if (mid > key) {     // Left Side Case
                start = mid - 1 ;
            }
        }
        return - 1;         // if the key is not found in the array
    }


    public static void main(String[] args) {
        int arr[] = {3,5,7,8,9,11,14,17,49};
        int key = 17;
       
        System.out.println(binary_search(arr, key));


    }
    
}
