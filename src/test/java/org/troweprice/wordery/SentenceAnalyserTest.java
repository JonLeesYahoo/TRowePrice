package org.troweprice.wordery;

import org.junit.Assert;
import org.junit.Test;

public class SentenceAnalyserTest {

    private SentenceAnalyser sentenceAnalyser = new SentenceAnalyser();
    private static final String exampleSentence1 = "The cow jumped over the moon.";

    @Test
    public void testSentence1ReturnsLongestWord() {
        String longestWord = sentenceAnalyser.getLongestWord(exampleSentence1);
        Assert.assertEquals("jumped", longestWord);
    }

    @Test
    public void testSentence1ReturnsCorrectLongestLength() {
        int longestLength = sentenceAnalyser.getLongestLength(exampleSentence1);
        Assert.assertEquals(6, longestLength);
    }

    @Test
    public void testSentence1ReturnsFirstShortesttWord() {
        String shortestWord = sentenceAnalyser.getShortestWord(exampleSentence1);
        Assert.assertEquals("The", shortestWord);
    }

    @Test
    public void testSentence1ReturnsCorrectShortestLength() {
        int shortestLength = sentenceAnalyser.getShortestLength(exampleSentence1);
        Assert.assertEquals(3, shortestLength);
    }
}
