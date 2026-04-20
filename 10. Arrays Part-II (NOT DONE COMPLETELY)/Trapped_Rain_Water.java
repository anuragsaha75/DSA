public class Trapped_Rain_Water {

    public static int Trappedwater(int height[]){

        int L_Max [] = new int [height.length];
        
         L_Max[0] = height[0];

        for(int i=1; i<height.length; i++){
            L_Max[i]=Math.max(height[i], L_Max[i-1]);
        }


        int R_Max [] = new int [height.length];
        
         R_Max[height.length-1] = height[height.length-1]; 

        for(int i=height.length-2; i>=0; i--){
            R_Max[i]=Math.max(height[i], R_Max[i+1]);
        }

        
        int trappedwater=0;
        for(int i=0; i<height.length;i++){
            int Wlevel= Math.min(L_Max[i], R_Max[i]);
            trappedwater=trappedwater+(Wlevel-height[i]);
        }

        return trappedwater;

    }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int s = Trappedwater(height);
        System.out.println(s);


    }
}
