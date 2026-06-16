public class Occurn{
    public static int occurence(int arr[], int key , int i)
    {
        int count =0;

        if(i==arr.length){
            return -1;
        }
        if(arr[i] == key){
            System.out.print(i);
        }

       return occurence(arr,key,i+1);
    }

    public static void main (String args[])
    {
        int[] array = {3,2,4,5,6,2,2,7};
        occurence(array,2,0);


    }

}