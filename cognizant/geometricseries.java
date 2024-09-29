import java.util.ArrayList;
import java.util.List;

public class geometricseries {
    public static void main(String[] args) {
        int A=2;
        int R=3;
        int Z=100;
        List<Integer>ans=gp(A, R, Z);
        System.out.println(ans);
        
    }
    public static List<Integer>gp(int A,int R,int Z){
        List<Integer>res=new ArrayList<>();

        int term=A;
        while(term<=Z){
            res.add(term);
            term=term*R;
        }
        return res;
    }
    
}
