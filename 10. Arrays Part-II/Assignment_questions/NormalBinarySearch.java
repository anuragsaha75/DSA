public class NormalBinarySearch {
    public static int PresentInwhichNumber(int arr[], int target){
        

            int left=0;
            int right=arr.length-1;

            while(left<=right){


                int mid=(int)Math.floor((left+right)/2);


                if(arr[mid]==target){
                    return mid;
                }else if(target<arr[mid]){
                    right = mid-1;
                } else if(target>arr[mid]){
                    left = mid+1;
                }
            }
                  
        return -1;
        
        

    }

    public static void main(String[] args) {
        int arr[]={4, 5, 6, 7, 0, 1, 2};
        System.out.println(PresentInwhichNumber(arr, 4));
    }
}
