public class Question4 {
    public static int Totalwater(int arr[]){
        
        int leftmax[]=new int[arr.length];
        int rightmax[]=new int[arr.length];

        leftmax[0]=arr[0];
        
        for(int i=1;i<arr.length;i++){ //
            leftmax[i]=Math.max(arr[i], leftmax[i-1]);
        }

        rightmax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i], rightmax[i+1]);
        }
        int total_water=0;
        for(int i=0;i<arr.length;i++){
            int waterlevel= (Math.min(leftmax[i], rightmax[i]))- arr[i];
            total_water=total_water+waterlevel;

        }

        return total_water;
    }
    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int height2[]={4, 2, 0, 3, 2, 5};
        System.out.println(Totalwater(height2)); 
    }
}
