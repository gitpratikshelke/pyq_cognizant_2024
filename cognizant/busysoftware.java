import java.util.*;
public class busysoftware {
    public static void main(String[] args) {
        int n=6;
        int []difficulty={3,5,2,3,8,7};
        int res=maxpairsum(n, difficulty);
        System.out.println(res);
        
    }
    public static int maxpairsum(int n,int[] difficulty){
        Arrays.sort(difficulty);
        int maxsum=0;
        for(int i=0;i<n/2;i++){
            int pairsum=difficulty[i]+difficulty[n-1-i];
            maxsum=Math.max(maxsum,pairsum);
        }
        return maxsum;
    }
}
