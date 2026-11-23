public class Search_in_Sorted_Matrix {


    public static boolean Stair_Case_Search(int matrix[][], int key) {
        int n= matrix.length;
        int row = 0;
        int col = matrix[0].length-1;
        while(row<n && col>=0 ){
            if(matrix[row][col]==key){
                System.out.println("Found the Key at ["+row+","+col+"]"); 
                return true;
            }
            else if(key<matrix[row][col]){
                col--;  // if key is less than current element, then move to left side
            }
            else{
                row++;  // if key is greater than current element, then move bottom
            }
        }

        System.out.println("Key NOT Found !! Does not exist in this 2D Array");
        
        return false;
    }





    public static void main(String[] args) {
        int matrix[][] = {  {10, 20, 30, 40},
                            {15, 25, 35, 45},
                            {27, 29, 37, 48},
                            {32, 33, 39, 50}
                        };

        int key = 33;

    Stair_Case_Search(matrix,key);


        
    }
}
