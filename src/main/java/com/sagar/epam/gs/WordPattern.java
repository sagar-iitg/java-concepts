package com.sagar.epam.gs;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {


    private static boolean wordPattern(String pattern, String[] strs){


        if(pattern.length()!=strs.length) return false;

        Map<Character,String> charToWord=new HashMap<>();
        Map<String,Character> wordTOChar=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char c=pattern.charAt(i);
            String word=strs[i];
            if(charToWord.containsKey(c)){
                if(!charToWord.get(c).equals(word)) return  false;
            }else{
                charToWord.put(c,word);
            }

            if(wordTOChar.containsKey(word)){
                if(!wordTOChar.get(word).equals(c)) return false;

            }else{
                wordTOChar.put(word,c);
            }
        }
        return true;
    }
    public static void main(String[] args) {

        String pattern="abba";
        String[] strs={"ball","bat","bat","ball"};
        System.out.println(wordPattern(pattern,strs));
        // Test cases
        System.out.println(wordPattern("abba", new String[]{"ball", "bat", "bat", "ball"}));  // true
        System.out.println(wordPattern("abba", new String[]{"ball", "ball", "bat", "ball"}));  // false
        System.out.println(wordPattern("aaaa", new String[]{"dog", "dog", "dog", "dog"}));  // true
        System.out.println(wordPattern("abba", new String[]{"dog", "cat", "cat", "fish"}));  // false
        System.out.println(wordPattern("abc", new String[]{"cat", "dog", "fish"}));  // true
        System.out.println(wordPattern("ab", new String[]{"dog", "dog"}));  // false



    }
}
