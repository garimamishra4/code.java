import java.util.*;

class Balancedparanthesis{
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch =='[' || ch == '{'){
                st.push(ch);
            }
            else if(ch == ')' || ch ==']' || ch == '}'){
                if(st.isEmpty()) return false;
                char c = st.pop();
                if(ch == '(' && c!=')' || ch =='[' && c!=']' || ch == '{' && c!='}') return false;
            }
        }
        return st.isEmpty();


    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isValid(s));  
    }
}
