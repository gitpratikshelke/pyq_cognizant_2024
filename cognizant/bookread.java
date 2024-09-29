import java.util.*;

public class bookread {

    public static int maxbook(int A[], int totalTime){
        Arrays.sort(A);
        int count = 0;
        int totaltime = 0;
        for (int time : A) {
            if (totaltime + time <= totalTime) {
                totaltime += time;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numBooks = sc.nextInt();  // Number of books
        int totalTime = sc.nextInt(); // Total available time to read
        int[] A = new int[numBooks];
        for (int i = 0; i < numBooks; i++) {
            A[i] = sc.nextInt();  // Reading time of each book
        }
        int res = maxbook(A, totalTime);
        System.out.println(res);
    }
}
