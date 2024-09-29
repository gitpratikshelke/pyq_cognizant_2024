import java.util.Scanner;

public class console_permutation {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String vowels="aeiouAEIOU";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(vowels.indexOf(s.charAt(i))==-1){
                count++;
            }
           
        }
        if(count==0){
            System.out.println(0);
            return ;
        }
        int ans=factorial(count);
        System.out.println(ans);

    }
    
}
