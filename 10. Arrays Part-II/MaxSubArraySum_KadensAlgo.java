

// Kaden's Algorithm is MOST IMPORTANT algorithm for INTERVIEW purpose.


public class MaxSubArraySum_KadensAlgo {

    // My code METHOD 1
    public static int KadensAlgo(int arr[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(currentSum + arr[i]<0){
                currentSum=0;
            } else {
                currentSum = currentSum + arr[i];
            }
            if(maxSum<currentSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    
    // Shradhha's Code METHOD 2
    public static int KadensAlgo2(int arr[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            currentSum = currentSum + arr[i];
            if(currentSum<0){
                currentSum=0;
            }

            maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;
    }

    // Upto this in both cases if all number is negative in the array then it will print 0 which is wrong.
    // To tackle this edge cases below code in the funstion is more optimized (Using Shraddha's Algo)

    public static int KadensAlgo3(int arr[]){
        int currentSum = arr[0];
        int maxSum = arr[0];
            for(int i=1;i<arr.length;i++){
                currentSum = Math.max(arr[i], currentSum + arr[i]);
                maxSum = Math.max(maxSum, currentSum);
            }
            return maxSum;
    }

    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        int numbers2[]={-2,-3,-4,-1,-2,-1,-5,-3};
       System.out.println(KadensAlgo2(numbers));
       System.out.println(KadensAlgo3(numbers2));

    }
}
