/*
 Nowadays if you put two things together you need to come up with a cool name to
describe the two things together, like Bennifer or Brangelina. In this problem,
you will deal with the concepts of addition and multiplication. You will
Addiply! Your task is to write a program which does simple addition and
multiplication based on 2 input numbers.

The first line of the file Prob03.in.txt will contain a positive integer T
denoting the number of test cases that follow.  Each test case will have the 
following input:

A single line containing two positive integers separated by a space.
The numbers will be small enough that they will not be bigger than
Integer.MAX_VALUE when multiplied together.

Example Input:
2 2
5 4
3 8

Example Output:
4 4
9 20
11 24
*/

package addiply;

import java.util.Scanner;

public class Addiply {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
	String[] ints = s.split(" ");
        int x = Character.getNumericValue(ints[0].charAt(0));
        int y = Character.getNumericValue(ints[1].charAt(0));
        int z = y + x;
        int a = y * x;
        System.out.println(z + " " + a);
    }
    
}
