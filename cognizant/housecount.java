import java.util.Scanner;

public class housecount {
    public static int count(int a[],int n){
        int currentindex=0;
        int housecount=1;

        while(true){
            int nextindex=currentindex+a[currentindex];
            if(nextindex>=n){
                break;
            }
            currentindex=nextindex;
            housecount++;


        }
        return housecount;
    }
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int res=count(a, n);
        System.out.println(res);
    }
    
}
