/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addiply;

import java.util.Scanner;

/**
 *
 * @author power user
 */
public class Addiply {

    /**
     * @param args the command line arguments
     */
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
