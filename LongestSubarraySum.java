import java.util.*;

class LongestSubarraySum{
    static int Checkfxn(int[] a, int k){
        int len = 0;
        long sum = 0;
        HashMap<Long,Integer> m = new HashMap<>();
        for(int i=0; i<
        a.length ;i++){
            sum+=a[i];
            if(sum == k) len = i+1;
            long need = sum - k;
            if(m.containsKey(need)){
                int l = i - m.get(need);
                len = Math.max(l,len);
            }
            if(!m.containsKey(sum)) m.put(sum,i);
        } 
        return len;

    }
    public static void main(String[] args){
        int[] a = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int x = Checkfxn(a,k);
        System.out.println(x);
    }
}