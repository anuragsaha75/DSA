public class PrintPairsOfAnArray {

    public static void pairs(int arr[]){

        int NumberOfPairs = 0;

        for(int i=0;i<arr.length-1;i++){

            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                NumberOfPairs++;
            }
            System.out.println();
        }
        System.out.println("Total number of Pairs :" + NumberOfPairs);
        
    }


    public static void main(String[] args) {
        
        int numbers[]= {1,2,3,4,5,6};

        pairs(numbers);

    }

}
