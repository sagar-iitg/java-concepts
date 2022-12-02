package interview;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        int arr[]={1,2,-1,-1,-1,3,-1,100};
        int n=arr.length;
        int min=arr[0];
        int index=-1;
        List<Integer> l=new ArrayList<>();

        for(int i=0;i<n;i++)
        {

            if(arr[i]<min)
            {
                min=arr[i];
                l.add(i);
                index=i;

            }

            if(arr[i]==min)
            {
                l.add(i);

            }
        }
        System.out.println(min+"\n"+index);
        System.out.println(l);
    }
}
