package String;

public class _443_Solution {
        public static void main(String[] args) {
            String str = "aaaabbcddcff";
            char arr[] = str.toCharArray();
            int i=0,j=0;
            String ans ="";
            int count=0;
            while(j<arr.length){
                if(arr[i]==arr[j]){
                    j++;
                    count++;
                }
                else{
                    ans+=arr[i];
                    if(count>1) ans+=count;
                    i=j;
                    count=0;
                }
            }
            ans+=arr[i];
            if(count>1) ans+=count;
            i=j;
            count=0;
            for(i=0;i<ans.length();i++){
                arr[i] = ans.charAt(i);
            }
            System.out.println(ans);
        }
    }
