
public class print_Substring {
    
    public static String SubString(String str, int s1,int s2){
        String sub_str="";
        for(int i=s1; i<=s2;i++){
            sub_str=sub_str+str.charAt(i);
        }
        return sub_str;
    }

    public static void main(String[] args) {
        String s = "HelloWorld";
        System.out.println(SubString(s, 0, 5)); // METHOD 1
        System.out.println(s.substring(0,5)); // METHOD 2 (INTERNAL FUNCTION(Here we have to write (ending index + 1) to complete)
    }
}
