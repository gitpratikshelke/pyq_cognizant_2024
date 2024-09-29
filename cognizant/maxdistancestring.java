public class maxdistancestring {
    public static void main(String[] args) {
        String input="abc10a";
        System.out.println(maxdistance(input));
        
    }
    public static  int maxdistance(String s){
        int maxd=0;
        int n=s.length();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arenonsimilar(s.charAt(i),s.charAt(j))){
                    int distance=Math.abs(i-j);
                    maxd=Math.max(maxd,distance);
                }
            }
        }
        return maxd;
    }
    public static boolean arenonsimilar(char a,char b){
        if(Character.isLetter(a)&& Character.isDigit(b)){
            return true;
        }
        if(Character.isDigit(a)&& Character.isLetter(b)){
            return true;
        }
        return false;
    }
    
}
