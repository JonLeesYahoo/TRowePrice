package org.troweprice.wordery;

import java.util.StringTokenizer;

/**
 * Simple class to perform various tasks on an input sentence, such as finding the longest and shortest words and also
 * finding the length of the shortest and longest words.
 *
 * A StringTokenizer is used to parse the sentence into constituent words, because this removes any expected
 * whitespace from the sentence, to prevent for example blah.... wrongly measuring as 8 characters.
 *
 * Where more than one word exists of the same longest or shortest length, then the first one found will be used.
 */
public class SentenceAnalyser {

    private static String WHIESPACE = ",.:?! ";

    /**
     * Get the longest word from a supplied sentence.
     * If there are no words, then return empty string
     * If there is more than one word of the same length, return the first found.
     *
     * @param inputSentence1
     * @return - String value with the longest Word
     */
    public String getLongestWord(String inputSentence1) {
        StringTokenizer stringTokenizer = new StringTokenizer(inputSentence1, WHIESPACE);

        String longestWord = "";
        int maxLength = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextWord = stringTokenizer.nextToken();
            if (nextWord.length() > longestWord.length()) {
                longestWord = nextWord;
            }
        }

        return longestWord;
    }

    /**
     * Get the integer length of the Longest word found
     *
     * @param inputSentence1
     * @return int value length of the First Longest Word
     */
    public int getLongestLength(String inputSentence1) {
        return getLongestWord(inputSentence1).length();
    }

    /**
     * Get the shortest word from the supplied sentence.
     * Where more than one word has the same length, return the first one found.
     *
     * @param inputSentence1
     * @return - String value with the shortest Word
     */
    public String getShortestWord(String inputSentence1) {
        StringTokenizer stringTokenizer = new StringTokenizer(inputSentence1, WHIESPACE);

        String shortestWord = "";
        int minLength = 999;
        while (stringTokenizer.hasMoreTokens()) {
            String nextWord = stringTokenizer.nextToken();
            if (nextWord.length() < minLength) {
                shortestWord = nextWord;
                minLength = shortestWord.length();
            }
        }

        return shortestWord;
    }

    /**
     * Get the integer length of the Shortest word found
     *
     * @param inputSentence1
     * @return int value length of the First Shortest Word
     */
    public int getShortestLength(String inputSentence1) {
        return getShortestWord(inputSentence1).length();
    }

}
