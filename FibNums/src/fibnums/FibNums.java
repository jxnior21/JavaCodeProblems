/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibnums;

import java.util.Scanner;

/**
 *
 * @author power user
 */
public class FibNums {

    /**
     * @param args the command line arguments
     */
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
