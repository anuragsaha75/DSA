public class LargestNumOfArray {

    
    

    public static int Get_Largest(int arr[]) {
        int largest = Integer.MIN_VALUE;                  // Integer.MIN_VALUE -----> - Infinity
                                                         //  Integer.MAX_VALUE -----> + Infinity

        for(int i = 0 ; i<arr.length ; i++) {
            if (arr[i]>largest){
                largest = arr[i];
            }   
        }
        return largest;
    }

    public static void main(String[] args) {

        int abc [] = {1,2,3,6,8,4,6,78};
        System.out.println("The largest value of the array is : " + Get_Largest(abc));

        
    }



    
}
