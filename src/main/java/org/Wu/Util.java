package org.Wu;

public class Util {

    public static String toTitleCase(String str) {
        if (str == null) return null;

        String[] words = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            result += w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase() + " ";
        }
        return result.trim();
    }
}