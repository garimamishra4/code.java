class Frequencycounter{
    public static void main(String args[]){
        int marks[] = {5,3,7,7,10,3,10,5,7,3,5,5};
        int freq[] = new int[11];

        for(int i=0; i<marks.length-1; i++){
            freq[marks[i]]++;
        }
         /*for(int i=0; i<marks.length; i++){
           System.out.println(i+"--"+freq[i]);
        }*/
       for(int i=0; i<marks.length-1; i++){
           if(freq[i]==1){
            System.out.println(i);
           }
        }

    }
}        