/*
An echo is when sound waves bounce off something and come back to you, so you
hear yourself saying what you just said.  An echo is when sound waves bounce off
something and come back to you, so you hear yourself saying what you just said.
Wait, did you hear that?

You have been tasked to create an echo program.

The first line of the file Prob01.in.txt will contain a positive integer T
denoting the number of test cases that follow.  Each test case will have the
following input:

A single line of text that should be echoed

Example Input:

Code Quest rules!
I’m definitely coming back next year.

Example Output:

Code Quest rules!
Code Quest rules!
I’m definitely coming back next year.
I’m definitely coming back next year.
 */
package echo;

import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
	System.out.println(s);
	System.out.println(s);
    }
    
}
