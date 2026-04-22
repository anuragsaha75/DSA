

public class KadensAlgo{
    public static void main(String[] args) {
        int arr [] = {-2,-3,4,-1,-2,1,5,-3};
        
        int cSum=0 ;
        int mxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            cSum=cSum+arr[i];
            
            if(cSum<0){
                cSum=0;
            }
            if(cSum>mxSum){
                mxSum=cSum;
            }
        }

        System.out.println("Current Sum is :"+cSum);
        System.out.println("Max Sum is :"+mxSum);
    }
}