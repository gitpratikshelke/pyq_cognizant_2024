import java.util.Scanner;

public class starsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int count=countvalidM(N);
        System.out.println("COUNT"+count);
    }
    public static int countvalidM(int N){
        int validcount=0;
        for(int M=1;M<=N;M++){
            if(calstarsum(M)>N){
                validcount++;
            }
        }
        return validcount;
    }
    public static int calstarsum(int M){
        String strM=Integer.toString(M);
        int sum=0;
        for(int i=1;i<=strM.length();i++){
            String prefix=strM.substring(0, i);
           sum+=Integer.parseInt(prefix);
        }
        return sum;
    }
    
}
