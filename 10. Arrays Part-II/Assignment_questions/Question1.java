
//the array, and return false if every element is distinct.

public class Question1{
    public static boolean atleastDoubleElementCheck(int arr[]){

        int count =0;
        int reference;
        for(int i=0;i<arr.length;i++){
            reference = arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 4, 2, };
        System.out.println(atleastDoubleElementCheck(nums));
        
    }
}