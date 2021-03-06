/*
The Fibonacci sequence is attributed to Italian mathematician Leonardo of Pisa.
It is represented as a sequence of integers, starting with 0, 1 where every
number after the first 2 is the sum of the two preceding numbers.  The beginning
of the Fibonacci sequence looks like…

0, 1, 1, 2, 3, 5, 8, 13, 21, 34 …

Your task is to write a program which renders the nth number of the Fibonacci
sequence.  For example if given an n value of 9, you are to return the 9th
number of the sequence, which would be the number 21.

The first line of the file Prob04.in.txt will contain a positive integer T
denoting the number of test cases that follow.  Each test case will have the
following input:

A single positive integer which represents the position in the sequence for
which you are to determine the value.  The number will be less than or equal to
90.

Example Input:

1
5
8
11
13
21
40

Example Output:

1 = 0
5 = 3
8 = 13
11 = 55
13 = 144
21 = 6765
40 = 63245986
 */
package fibnums;

import java.util.Scanner;

public class FibNums {
    
    public static void main(String[] args) {
        int a = 0, b = 1, c = 1;
	int i = 1;
        int[] fibNums = new int[50];
	do {
            c = a + b;
            fibNums[i] = a;
            a = b;
	    b = c;
            i++;
	} while(i < 50);
	Scanner scan = new Scanner(System.in);
	int y = scan.nextInt();
        System.out.print(y + " = " + fibNums[y]);
    }
    
}
