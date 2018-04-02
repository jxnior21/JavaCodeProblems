/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missingletter;

import java.util.Scanner;

/**
 *
 * @author power user
 */
public class MissingLetter {

    /**
     * @param args the command line arguments
     */
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
