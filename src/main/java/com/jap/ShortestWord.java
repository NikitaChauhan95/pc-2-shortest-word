package com.jap;


public class ShortestWord {
    public static void main(String[] args) {
        String[] words = {"Java", "Programming", "Language"};
        ShortestWord shortestWord = new ShortestWord();
        String word = shortestWord.findShortestWord(words);
        System.out.println(word);
    }

    public String findShortestWord(String[] words) {
        String shortest = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() <= shortest.length()) {
                shortest = words[i];
            }
        }
        return shortest;
    }
}