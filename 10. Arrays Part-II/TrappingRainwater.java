
public class TrappingRainwater {

    //Trapped Water = (Water Level - Height of the bar)* Width
    // Water Level = min(Left Max Height , Right Max Height)
    // Left max
    // Right max

 public static int TrappedRainWater(int height[]){

     // Calculate Left max and store to an Array (Auxiliary/Helping Array)

         int LeftMax[]= new int[height.length];

         LeftMax[0]=height[0]; // Left Side 1st bar is the max height of the 1st bar itself

            for(int i=1;i<=height.length-1;i++){
                
                LeftMax[i]=Math.max(height[i], LeftMax[i-1]);

            }

    // Calculate Right max and store to an Array (Auxiliary/Helping Array)
    int RightMax[]= new int[height.length];

         RightMax[height.length-1]= height[height.length-1]; // Right Side last bar is the max height of the Last bar itself

        for(int j=height.length-2;j>=0;j--){
            
            RightMax[j]= Math.max(height[j], RightMax[j+1]);

        }



    int TrappedWater=0;
    for(int k=0;k<=height.length-1;k++){
        
        // Calculating Water Level of each bar
        int waterLevel=Math.min(LeftMax[k], RightMax[k]);
        // Calculating Total Trapped Water
        TrappedWater = TrappedWater + (waterLevel-height[k]);


    }

    return TrappedWater;

 }

   


    
    public static void main(String[] args) {

        int height[]={4,2,0,6,3,2,5};

        System.out.println(TrappedRainWater(height));
    }
}

// Use this video for understanding : https://youtu.be/UZG3-vZlFM4?si=80Vg_TZdV7fCRM7d