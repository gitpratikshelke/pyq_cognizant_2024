import java.util.Scanner;

public class maria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int res=sumdivbyx(n, x);
        System.out.println("output"+res);
        

        
    }
    public static int sumdivbyx(int n,int x){
        int sum=0;
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=i+1;
        }
        for(int i=0;i<n;i++){
            int b_array;
            if(i==n-1){
                b_array=a[i]+a[0];
            }
            else{
                b_array=a[i]+a[i+1];
            }
            if(b_array % x== 0){
                sum+=b_array;
            }
        }
        return sum;
    }
    
}
