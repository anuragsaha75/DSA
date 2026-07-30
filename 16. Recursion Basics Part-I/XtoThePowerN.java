public class XtoThePowerN {
    public static int XtoN(int x ,int p){
        if(p==0){
            return 1;
        }
        return x*XtoN(x, p-1);
    }

    public static void main(String[] args) {
        System.out.println(XtoN(10, 1));
    }
}
