import java.util.*;
class Stackqs{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter stack size: ");
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        System.out.println("enter stack elements: ");
        for(int  i=0; i<n; i++){
            st.push(sc.nextInt());
        }
        int min = Integer.MAX_VALUE;
        for(int num : st){
            if(num < min) min = num;
        }     
        System.out.println("min element: " + min);
        Stack<Integer> s = new Stack<>();
        while(!st.isEmpty()){
            int num = st.pop();
            if(num!=min) s.push(num);
            if(num == min)
            {  
            System.out.println("removed: " + num);
            break;
            }
        }
        while(!s.isEmpty()){
            st.push(s.pop());
        }
          System.out.println("after removing: " );
        for(int num: st){
            System.out.println(num);
        }

    }
}