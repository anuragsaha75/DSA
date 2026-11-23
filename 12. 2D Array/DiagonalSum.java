public class DiagonalSum {

    public static int DiagonalSum(int arr[][]){
        int sum =0;
        int n = arr.length;
       
        for(int i=0; i<arr.length;i++){

            //Primary Diagonal
            sum = sum + arr[i][i];
        
            //Secondary Diagonal        
            if(i!=n-1-i){ //This condition is to avoid middle element count twice
                sum = sum + arr[i][n-1-i];  // i+j = n-1
            }
            
        }

        return sum;
    }
    public static void main(String[] args) {
        
        int mat[][]={   {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                    };

        System.out.println(DiagonalSum(mat));

    }
}




/*
    Diagonal Sum:

    Primary Diagonal:
        arr[i][i]

    Secondary Diagonal:
        arr[i][n - 1 - i]

    We use:
        if (i != n - 1 - i)

    Why?
        In an odd-sized matrix, the middle element belongs to BOTH
        primary and secondary diagonals.

        Example (3x3):
            1  2  3
            4  5  6
            7  8  9

        Primary  -> 1, 5, 9
        Secondary -> 3, 5, 7

        The middle element 5 would be counted twice.

        At the middle:
            i = 1
            n - 1 - i = 3 - 1 - 1 = 1

        So:
            i == n - 1 - i

        Therefore, the condition becomes false and we DON'T add
        the secondary diagonal element again.

    In short:
        if (i != n - 1 - i)
        -> Add secondary diagonal only when it is NOT the same
           element as the primary diagonal.
*/


