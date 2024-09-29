import java.util.Scanner;

public class libraryshelf {
    public static boolean isprime(int n){
        if(n<2)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int validbook(int n,int k,int[]a){
        int total=0;
        for(int i=1;i<=n;i++){
            if(isprime(i)){
                total+=Math.min(k,a[i-1]);
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int total=validbook(n, k, a);
        System.out.println(total);

    }
    
}
