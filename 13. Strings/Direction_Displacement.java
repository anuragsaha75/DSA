// Given a route containing 4 directions (E, W, N, S),
// find the shortest path to reach destination.
// "W N E E N E S E N N N"


public class Direction_Displacement {
    
    public static double getShortestPath(String path){
        int x=0;
        int y=0;

        for(int i=0; i<=path.length()-1;i++){
            char dir=path.charAt(i);
            //West(W)
            if(dir=='W'){
                x--;
            }
            else if(dir=='E'){
                x++;
            }
            else if(dir=='N'){
                y++;
            }
            else{
                y--;
            }
        }

        double res= Math.sqrt(x*x+y*y);
        return(res);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        double shortstPath= getShortestPath(str);
        System.out.println(shortstPath);
    }
}
