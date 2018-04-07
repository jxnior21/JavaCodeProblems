/*
The International Civil Aviation Organization (ICAO) developed a system in the
1950s so that critical combinations of letters and numbers can be pronounced and
understood by those exchanging voice messages by radio or telephone regardless
of language or quality of the communication channel.  Today it is widely used
and known as the phonetic alphabet, the US Army alphabet, ICAO alphabet, NATO
alphabet, or spelling alphabet.  We probably hear it most in military
applications or in movies.  It is made up of 26 words that are assigned to the
26 letters of the English alphabet as follows:

Letter
Code Word
A
Alpha
N
November
B
Bravo
O
Oscar
C
Charlie
P
Papa
D
Delta
Q
Quebec
E
Echo
R
Romeo
F
Foxtrot
S
Sierra
G
Golf
T
Tango
H
Hotel
U
Uniform
I
India
V
Victor
J
Juliet
W
Whiskey
K
Kilo
X
Xray
L
Lima
Y
Yankee
M
Mike
Z
Zulu

Your application should convert a string of text into its phonetic alphabet code.

The first line of the file Prob06.in.txt will contain a positive integer T
denoting the number of test cases that follow.  Each test case will have the
following input:

The first line of each test case will be a positive integer N denoting how many
lines of text the message contains.

The next N lines will contain a string of text to be converted.

Example Input:

2
Code Quest
Rocks

1
Lockheed

Example Output:

Charlie-Oscar-Delta-Echo Quebec-Uniform-Echo-Sierra-Tango
Romeo-Oscar-Charlie-Kilo-Sierra

Lima-Oscar-Charlie-Kilo-Hotel-Echo-Echo-Delta
 */

package charliequebec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharlieQuebec {

    public static void main(String[] args) {
        String[] alph = {"alpha", "bravo", "charlie", "delta", "echo",
            "foxtrot", "golf", "hotel", "india", "juliet", "kilo", "lima",
            "mike", "november", "oscar", "papa", "quebec", "romeo", "sierra",
            "tango", "uniform", "victor", "whiskey", "xray", "yankee", "zulu"};
        Scanner scan = new Scanner(System.in);
        String numLinesString = scan.nextLine();
        int numLines = Integer.parseInt(numLinesString);
        List<String> output = new ArrayList<>();
        for (int lines = 0; lines < numLines; lines++) {
            String before = scan.nextLine();
            String after = before.toLowerCase();
            char[] chars = after.toCharArray();
            String[] end;
            String concat = "";
            for (int character = 0; character < chars.length; character++) {
                for (String s : alph) {
                    if (chars[character] == s.charAt(0) && (chars[character] == chars[chars.length - 1])) {
                        String cap = s.substring(0,1).toUpperCase();
                        String rest = s.substring(1, s.length());
                        concat += cap + rest;
                    } else if (chars[character] == s.charAt(0) && (chars[character + 1] == ' ')) {
                        String cap = s.substring(0,1).toUpperCase();
                        String rest = s.substring(1, s.length());
                        concat += cap + rest + " ";
                    } else if ((chars[character] == s.charAt(0))) {
                        String cap = s.substring(0,1).toUpperCase();
                        String rest = s.substring(1, s.length());
                        concat += cap + rest + "-";
                    }
                }
            }
            output.add(concat);
        }
        System.out.println();
        for (String a : output) {
            System.out.println(a);
        }
    }
    
}
