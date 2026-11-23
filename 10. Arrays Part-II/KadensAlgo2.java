public class KadensAlgo2 {

    public static int Kaden(int arr[]){
        int MaxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0;i<arr.length;i++){
            
            currentSum = currentSum + arr[i];
            MaxSum = Math.max(MaxSum, currentSum);
            if(currentSum<0){
                currentSum=0;
            }
            
            
        }

        return MaxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(Kaden(arr));
    }
}
