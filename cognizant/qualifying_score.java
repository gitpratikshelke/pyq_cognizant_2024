import java.util.Arrays;
import java.util.Scanner;

public class qualifying_score {
    public static String checkqua(int n,int p,int[]s1,int []s2){
        int []diff=new int[n];
        for(int i=0;i<n;i++){
            diff[i]=s2[i]-s1[i];
        } 
        Arrays.sort(diff);
        int qscore=0;
        for(int i=n-1;i>=n-p;i--){
            qscore+=diff[i];
        }
        if(qscore>=35){
            return "qualified" + qscore;
        }
        else{
            return "disqualified" + qscore;
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         int p=sc.nextInt();
         int []s1=new int[n];
         int []s2=new int[n];
         for(int i=0;i<n;i++){
            s1[i]=sc.nextInt();
         }
         for(int i=0;i<n;i++){
            s2[i]=sc.nextInt();
         }
         System.out.println(checkqua(n, p, s1,s2));

        
    }
    
}
