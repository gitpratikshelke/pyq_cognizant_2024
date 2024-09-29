import java.util.HashSet;

public class uniquechar {
    public static void main(String[] args) {
        String A="pratik";
        String B="pratiksha";
        int ans=getunique(A, B);
        System.out.println("unique string are :  "+ans);
        
    }
    public static int getunique(String A,String B){
        HashSet<Character>unique=new HashSet<>();


        for(int i=0;i<A.length();i++){
            unique.add(A.charAt(i));
        }
        for(int i=0;i<B.length();i++){
            unique.add(B.charAt(i));
        }
        return unique.size();
    }
    
}
