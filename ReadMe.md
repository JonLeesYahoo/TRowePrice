##T Rowe Price

###Specification for Test:

1. Write a method or function in the major programming language of your choice that returns the longest word in a sentence and its length. For example, “The cow jumped over the moon.” should return “jumped” and 6.
2. Write unit tests, reworking code as needed
3. Add a method that returns the shortest word and length with unit tests
4. Create a README documenting any assumptions you made and including instructions on how to build and execute your tests.
5. Share your code using GitHub or similar.


###The Solution:

By Jon Lees.

The solution is written using Java/Maven.
It is built using the following command (from the project root folder);

    mvn package

You can then run the built jar file with the following, supplying two input parameters. 
The first parameter is used to select which action to carry out; L - longest word, l - longest word length, S - shortest word, s - shortest word length 
The second parameter is the sentence to parse in inverted commas.

For example, the following will make a call to find the longest word for the given sentence;

    java -cp target/TRowePriceTest-1.0-SNAPSHOT.jar org.troweprice.wordery.Application L "The cow jumped over the moon."


###Easy Run
A second method of running the code has been supplied to make it easier for regular users to run.
From the project root folder, simply type the "run" command followed by two parameters as described below;
 
The first parameter is used to select which action to carry out; L - longest word, l - longest word length, S - shortest word, s - shortest word length 
The second parameter is the sentence to parse in inverted commas.

For example, the following will make a call to find the length of the shortest word for the given sentence;

run s "The cow jumped over the moon...."

###Comments
I am happy to say that I wrote the first two tests first, before writing a line of code.
Then ran the tests and had them fail. This was my starting point.


