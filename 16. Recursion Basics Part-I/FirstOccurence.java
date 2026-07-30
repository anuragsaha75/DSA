public class FirstOccurence {
    public static int FirstOccur(int arr[], int n, int i){
        
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==n){
            return i;
        }
        return FirstOccur(arr,n,i+1);
    }


    public static void main(String args[]){
        int arr[] = {8,3,6,9,3,10,2,5,3};
        System.out.println(FirstOccur(arr,5,0));
    }
}
