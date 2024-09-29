public class magicalno {
    public static int magicalno(int r,int c,int [][]m){
        int count=0,sum;
        for(int i=0;i<r;i++){
            sum=0;
            for(int j=0;j<c;j++){
                if(m[i][j]%2>0){
                    sum+=m[i][j];
                }
            }
            if(sum > 0 && sum%2==0){
                count++;
            }
        }
        return  count;
    }
    public static void main(String[] args) {
        int r=3,c=2;
        int m[][]={{2,4},{0,0},{11,11}};
        int total=magicalno(r, c, m);
        System.out.println(total);
    }
}
