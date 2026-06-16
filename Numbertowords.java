public class Numbertowords{
    static void recurse(String wrds[],int n){
        if(n<10){
            System.out.println(wrds[n]);
            return;
        }

        recurse(wrds, n/10);
        System.out.println(""+ wrds[n%10]);
    }

    public static void main (String args[]){
        int number = 1947;
        String[] words = {"zero","one","two","three","four","five","six","seven", "eight","nine"};
        recurse(words,number);
    }
}