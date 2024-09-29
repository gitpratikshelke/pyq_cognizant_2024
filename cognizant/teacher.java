import java.util.Scanner;
import java.util.*;
public class teacher {

    public static int  maxstudentgroup(int n,int [] studentid){
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<n;i++){
            if(studentid[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        return Math.min(evencount,oddcount);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int studentid[]=new int[n];
        for(int i=0;i<n;i++){
            studentid[i]=sc.nextInt();
        }
        System.out.println(maxstudentgroup(n, studentid));
    }
    
    
}
