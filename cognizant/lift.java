import java.util.*;

public class lift {
    
    public static int maxpeopleinlift(int n,int x,int []A){
        Arrays.sort(A);
        int totalweight=0;
        int peoplecount=0;
        for(int i=0;i<n;i++){
            if(totalweight+A[i]<=x){
                totalweight+=A[i];
                peoplecount++;
            }
            else{
                break;
            }
        }
        return peoplecount;
    }
    public static void main(String[] args) {
        int n=3;
        int x=9;
        int []A={5,1,5};
        System.out.println(maxpeopleinlift(n, x, A));
    }
}
