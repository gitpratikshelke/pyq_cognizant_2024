import java.util.Scanner;

public class min_attempt_clean_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s=sc.next();
        int removals=minremvals(s);
        System.out.println(" min remove no ::: "+removals);
        
        
    }
    public static int  minremvals(String s){
        int remov=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                remov++;
            }
        }
        return remov;
    }
}
