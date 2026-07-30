public class IncreasingOrder{
    
    public static void Accending(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
       Accending(n-1);
       System.out.print(n+" ");


    }



    public static void main(String args[]){
        Accending(10);
    }
}