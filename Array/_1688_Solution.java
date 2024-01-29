public class _1688_Solution {
    public static void main(String[] args) {

        // Solution function not run directaliy use only logic 
        class Solution {
            public int numberOfMatches(int n) {
                int m=0;
                while(n>1){
                    if(n%2==0){
                        m+=n/2;
                        n=n/2;
                    }
                    else{
                        m+=(n-1)/2;
                        n=((n-1)/2)+1;
                    }
                }
                return m;
            }
        }
    }
}
