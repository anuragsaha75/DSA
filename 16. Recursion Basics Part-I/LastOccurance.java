public class LastOccurance {

    public static int LastOccur(int arr[],int key , int i){
        //Base Case
        if(i==arr.length-1){
            return -1;
        }
        //checking the later part is it exist there
        int isFound = LastOccur(arr, key, i+1);
        if(isFound!=-1){
            return isFound;
        }
        //checking with self 
        if(arr[i]==key){
            return i;
        }

        return isFound;
    }
    public static void main(String[] args) {

        int arr[]= {0,1,2,5,6,7,8,9,5,6,78,90};
        System.out.println(LastOccur(arr, 5, 0));
    }
}
