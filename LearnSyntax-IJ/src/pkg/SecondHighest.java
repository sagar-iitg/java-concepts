package pkg;

public class SecondHighest {

    public static void main(String[] args) {
        System.out.println("hello");

        int[] arr={1,2,3,4,5};
        int first,second;
        first=second=Integer.MIN_VALUE;



        for(int i=0;i<arr.length;i++)
        {


            if (arr[i]> first){
                second=first;
                first=arr[i];

            }
            if(arr[i] > second && arr[i]!=first){
                second=arr[i];
            }

        }
        System.out.println(second);
        System.out.println(Integer.MAX_VALUE);

    }
}
