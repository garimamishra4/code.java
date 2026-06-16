import java.util.*;
class Knapsack{

    /*static int t[][];

    static int knapsack(int wt[],int val[], int w, int n){
        if(w==0 || n==0) return 0;
        if(t[n][w]!= -1) return t[n][w];
        if(wt[n-1]<= w) return t[n][w] = Math.max(val[n-1] + knapsack(wt,val,w-wt[n-1],n-1),knapsack(wt,val,w,n-1));
        else return t[n][w] = knapsack(wt,val,w,n-1);

    } */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int w = sc.nextInt();
        int[] wt = new int[size];
        int[] val = new int[size];
        for(int i=0;i<size;i++){
            wt[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            val[i] = sc.nextInt();
        }
       int[][] t = new int[size + 1][w + 1];
       for(int i=0;i<size;i++){
        for(int j=0;j<w;j++){
            if(i==0||j==0) t[i][j] = 0;
            else if(wt[i-1]<=j){
                t[i][j] = Math.max((val[i-1]+t[i-1][j-wt[i-1]]),)
            }
        }
       }

/*for(int[] row : t){
    Arrays.fill(row, -1);
}
        System.out.println(knapsack(wt,val,w,size));*/

    }
}