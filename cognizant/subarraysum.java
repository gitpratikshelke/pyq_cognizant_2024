import java.util.Scanner;

public class subarraysum {
    public static int validsubarray(int []arr,int n){
        int count=0;
        for( int i=0;i<=n-3;i++){
            if(arr[i]+arr[i+2]==arr[i+1]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(validsubarray(arr, n));
    }
    
}
