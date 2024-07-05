package Counting;
import java.util.HashMap;
public class numPairsDivisibleBy60_1010 {
    public static int numPairsDivisibleBy60(int[] time) {
        int count=0;
        for(int i=0;i<time.length;i++){
            if(time[i]>=60) time[i]%=60;
        }
        HashMap<Integer,Integer> al = new HashMap<>();
        for(int i=0;i<time.length;i++){
            if(time[i]==0 && al.containsKey(time[i])){
                count+=al.get(time[i]);
            }
            if(al.containsKey(60-time[i])){
                count+=al.get(60-time[i]);
            }
            al.put(time[i],al.getOrDefault(time[i],0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int time[] = {30,20,150,100,40};
        numPairsDivisibleBy60(time);
//        System.out.println(k);
    }
}
