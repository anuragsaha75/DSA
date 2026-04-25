// QUESTION :  
// There is an integer array nums sorted in ascending order (with distinct 
// values). Prior to being passed to your function, nums is possibly rotated at an 
// unknown pivot index k (1 <= k < nums.length) such that the resulting array 
// is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0
// indexed). For example, [0,1,2,4,5,6,7] might 
// be 
// rotated at 
// index 3 and become [4,5,6,7,0,1,2]. 
// pivot
// Given the array nums after the possible rotation and an integer target, return 
// the index of target if it is in nums, or -1 if it is not in nums. 
// You must write an algorithm with O(log n) runtime complexity. 
// Example 1: 
// Input: 
// nums = [4, 5, 6, 7, 0, 1, 2], target = 0 
// Output:  4 
// Example 2: 
// Input: 
// nums = [4, 5, 6, 7, 0, 1, 2], target = 3 
// Output: -1



public class Question2 {

    public static int BinaryModifiedSearch(int arr[],int target){

        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            // LEFT PART
            else if(arr[start]<=arr[mid]){//if Left Part is Sorted

                if(target>=arr[start] && target<arr[mid]){ // if target belongs to that left sorted part or not
                    end = mid -1;
                } else{
                    start = mid + 1;   //
                }

            //RIGHT PART
            } else if (arr[start]>=arr[mid]){ // If Left is not sorted the Right part is surely sorted
                    if(target>arr[mid]&&target<=arr[end]){
                        start = mid + 1;
                    } else{
                        end = mid -1;
                    }
                }      

        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4, 5, 6, 7, 0, 1, 2};

        System.out.println(BinaryModifiedSearch(arr, 0));
    }
}
