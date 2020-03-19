package org.troweprice.wordery;

public class Application {

    /**
     * Simple main method to provide an entry point for the Sentence Analyser
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        SentenceAnalyser sentenceAnalyser = new SentenceAnalyser();

        //enforce 2 arguments
        if (args.length != 2) {
            System.out.println("Two parameters are required: {L, l, S, s}, \"Sentence to analyse\"");
            System.exit(0);
        }

        //Get the letter of the option required
        String option = args[0];
        switch (option) {
            case "L":
                String longestWord = sentenceAnalyser.getLongestWord(args[1]);
                System.out.println("Longest word is " + longestWord);
                break;
            case "S":
                String shortestWord = sentenceAnalyser.getShortestWord(args[1]);
                System.out.println("Shortest word is " + shortestWord);
                break;
            case "l":
                int lengthLongestWord = sentenceAnalyser.getLongestLength(args[1]);
                System.out.println("Length of longest word is " + lengthLongestWord);
                break;
            case "s":
                int lengthShortestWord = sentenceAnalyser.getShortestLength(args[1]);
                System.out.println("Length of shortest word is " + lengthShortestWord);
                break;
            default:
                System.out.println("Invalid option entered: Valid options are {S, L, s, l}");
        }
    }

}


