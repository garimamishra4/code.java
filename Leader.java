import java.util.*;
class Leader{
    static ArrayList<Integer> leaders(int[] a){
        int m = a[a.length - 1];
        ArrayList<Integer> l = new ArrayList<>();
        l.add(a[a.length - 1]);
        for(int i= a.length - 2; i>=0 ; i--){
            if(a[i]>m)  l.add(a[i]);
             m =  a[i];
        }
        Collections.reverse(l);
        return l;
    }
    public static void main(String[] args){
        int[] nums = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> ans = leaders(nums);
        System.out.print("Leaders in the array are: ");
        for (int leader : ans) {
            System.out.print(leader + " ");
        }

    }
}