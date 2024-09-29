import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class minsum {
    
    // Method to calculate minimum sum of A[i] * B[i]
    public static int minimumSum(int N, int[] A, Integer[] B) {
        // Sort A in ascending order
        Arrays.sort(A);
        
        // Sort B in descending order
        Arrays.sort(B, Collections.reverseOrder());
        
        // Calculate the sum of products
        int minSum = 0;
        for (int i = 0; i < N; i++) {
            minSum += A[i] * B[i];
        }
        
        return minSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of arrays
        System.out.print("Enter the size of arrays: ");
        int N = sc.nextInt();

        // Input the elements of array A
        int[] A = new int[N];
        System.out.println("Enter elements of array A: ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Input the elements of array B
        Integer[] B = new Integer[N];
        System.out.println("Enter elements of array B: ");
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        // Calculate the minimum sum
        int result = minimumSum(N, A, B);
        System.out.println("Minimum possible sum: " + result);
    }
}
