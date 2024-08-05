package org.example;

import java.util.HashMap;
import java.util.Map;

public class StringCompressor {

    public static void main(String[] args) {
        String str = "aabbbccaa";
        String compressedStr = compressString(str);
        System.out.println(compressedStr);
    }

    public static String compressString(String text) {
        if (text == null || text.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if(i+1<text.length() && text.charAt(i) == text.charAt(i+1)) {
                count++;
            } else {
                sb.append(text.charAt(i));
                if(count>1){
                    sb.append(count);
                }
                count = 1;
            }
        }
        int newText = sb.toString().length();

        if(newText > text.length()) return text;

        return sb.toString();
    }
}
