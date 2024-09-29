import java.util.Scanner;

public class balloon {

    public static int ballooncount(int n,int x,int a[],int b[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(b[i]+b[j]<=x && a[i]+a[j]>max){
                    max=a[i]+a[j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter the number of packets: ");
        int n = sc.nextInt();
        System.out.print("Enter Aaron's budget: ");
        int x = sc.nextInt();
        
        int[] A = new int[n];  // Number of balloons in each packet
        int[] B = new int[n];  // Cost of each packet

        System.out.println("Enter the number of balloons in each packet: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Enter the cost of each packet: ");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        // Calculate the maximum number of balloons
        int result = ballooncount(n, x, A, B);
        System.out.println("Maximum number of balloons: " + result);
    }
}
 
    

