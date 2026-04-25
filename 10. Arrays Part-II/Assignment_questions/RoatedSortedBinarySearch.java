public class RoatedSortedBinarySearch {

    public static int RoatedSortedArrayIndexFind(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }

            else if(arr[start]<=arr[mid]){ //if Left Portion is Sorted
                if(arr[start]<=target && arr[mid]>target){
                    end = mid-1;
                } else {
                    start = mid + 1;
                }
            }
             
            else{ //If Right Part is sorted (if left part is NOT sorted then RIGHT part will be sorted surely)
                
                if(target>arr[mid] && target<=arr[end]){
                    start = mid+1;
                } else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[]={3,4,5,6,7,8,1,2};
        System.out.println(RoatedSortedArrayIndexFind(nums, 7));
        
    }
}
