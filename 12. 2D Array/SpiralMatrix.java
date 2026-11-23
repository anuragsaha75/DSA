public class SpiralMatrix{

 public static void SpiralMatrix_2D(int matrix[][]){
    int S_Col=0;
    int S_Row=0;
    int E_Col = matrix[0].length-1; // matrix[0].length gives total Row Count
    int E_Row = matrix.length-1; // matrix.length gives total Column Count

    while(S_Col<=E_Col && S_Row<=E_Row){
        //Top side
        for(int j=S_Col; j<=E_Col; j++ ){
            System.out.print(matrix[S_Row][j] + " ");
        }

        //Right Side
        for(int i=S_Row+1; i<=E_Row; i++){
            System.out.print(matrix[i][E_Col] + " ");
        }

        //Bottom Side
        for(int j=E_Col-1; j>=S_Col; j--){

            if(S_Row==E_Row){ // Special case: avoid duplicate elements when only one row remains
                break;
            }
            System.out.print(matrix[E_Row][j] + " ");
        }

        //Left Side
        for(int i=E_Row-1; i>=S_Row+1; i--){

            if(S_Col==E_Col){ // Special case: avoid duplicate elements when only one column remains
                break;
            }
            System.out.print(matrix[i][S_Col] + " ");
        }

        // Update 
        S_Col++;
        E_Col--;
        S_Row++;
        E_Row--;

    }
 }






    public static void main(String[] args) {

        int mat[][]={   {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                    };



        SpiralMatrix_2D(mat);

    }
}