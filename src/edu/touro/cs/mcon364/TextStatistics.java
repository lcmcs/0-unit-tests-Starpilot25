package edu.touro.cs.mcon364;

import java.util.*;

public class TextStatistics {

    public static int wordCount(String text) {
        return text.split(" ").length;
    }


   public static int uniqueWordCount(String text) {
        String[] strings = text.split(" ");
        HashSet<String> set = new HashSet<>();
        for (String s : strings) {
            set.add(s);
        }
        return set.size();
    }

   public static Map<String, Integer> wordStats(String text) {
        String[] strings = text.toLowerCase().split(" ");
        HashMap<String, Integer> hashBrown = new HashMap<>();
        for (String s : strings) {
            int counter = 0;
            for (String d : strings) {
                if (Objects.equals(d, s)) {
                    counter++;
                }
            }
            hashBrown.put(s, counter);
        }
        return hashBrown;
    }

   public static int letterCount(String text) {
        char[] will = text.toLowerCase().toCharArray();
        HashSet<Character> muffin = new HashSet<>();
        for (char c : will) {
            if (Character.isLetter(c)) {
            muffin.add(c);
            }

        }
        return muffin.size();
    }

    public static Map<Character, Integer> letterStats(String text) {
        char[] will = text.toLowerCase().toCharArray();
        HashMap<Character,Integer> muffin = new HashMap<>();
        for (char c : will) {
            if (Character.isLetter(c)) {
               int counter = 0;
                for (char g : will) {
                   if (c == g) {
                       counter++;
                   }
               }
                muffin.put(c, counter);
            }

        }
        return muffin;
    }

}
