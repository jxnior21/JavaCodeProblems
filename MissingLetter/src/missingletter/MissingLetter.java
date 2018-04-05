/*
Sometimes when we type we just miss letters.  Other times we go to a programming
competition and we’re asked to remove letters from perfectly good words.

Your task is to write a program which given a String and an integer will print a
new String missing the character at the given place.

The first line of the file Prob02.in.txt will contain a positive integer T
denoting the number of test cases that follow.  Each test case will have the
following input:

A single line containing a word, then a space, then a positive integer.
The integer tells us which character to remove from the string, and is 0-based
(meaning that a 0 means take away the first letter).  The index given will
always be valid – no tricks here!

Example Input:

puppy 0
kitten 4
fish 1
dog 2

Example Output:

uppy
kittn
fsh
do
 */
package missingletter;

import java.util.Scanner;

public class MissingLetter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
        String[] a = s.split(" ");
        char[] word = a[0].toCharArray();
	char[] num = a[1].toCharArray();
        int x = Character.getNumericValue(num[0]);
        word[x] = 0;
        System.out.println(word);
    }
    
}
