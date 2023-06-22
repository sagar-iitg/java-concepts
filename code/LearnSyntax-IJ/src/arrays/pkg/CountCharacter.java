package arrays.pkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountCharacter {

    public static void main(String[] args) {

        Map<Character,Integer> map=new HashMap<>();
        String input="sagarkumar";

        for(int index=0;index<input.length();index++)
        {

            char ch=input.charAt(index);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
                continue;
            }
            else {
                map.put(input.charAt(index), 1);
            }

        }



        List<Integer> arr=new ArrayList<>();

        arr.add(1);
        arr.add(1);
        arr.add(13);
        arr.add(1333);
        arr.add(1344);
        arr.add(1555);


        arr.stream().forEach(System.out::println);




        System.out.println(map);

    }
}
