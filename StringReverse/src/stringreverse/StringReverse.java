/*
Take a string as imput and the output is in reverse

Example input:
hello world!

Example output:
!dlrow olleh
 */
package stringreverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        Collections.reverse(list);
        for(String a : list) {
            System.out.print(a);
        }
        System.out.println();
    }
    
}
