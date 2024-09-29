public class redtogreen {


    public static int ballswitch(int n,int []a){
        int count=0;
        for(int i=0;i<n-1;i++){
            if(a[i]%2>0 && a[i+1]%2==0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=6;
        int a[]={1,2,1,6,10,9};
        int countswitch=ballswitch(n, a);
        System.out.println(countswitch);
    }

    
}
