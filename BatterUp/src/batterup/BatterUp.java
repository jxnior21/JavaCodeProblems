/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batterup;

import java.util.Scanner;

/**
 *
 * @author power user
 */
public class BatterUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] player = input.split(":");
        String name = player[0];
        String[] indvBases = player[1].split(",");
        int totalBases = 0;
        int abts = indvBases.length;
        for (String base : indvBases) {
            if (base.equals("1B")) {
                totalBases += 1;
            } else if (base.equals("2B")) {
                totalBases += 2;
            } else if (base.equals("3B")) {
                totalBases += 3;
            } else if (base.equals("HR")) {
                totalBases += 4;
            } else if (base.equals("BB")) {
                abts -= 1;
            }
        }
        float perc = (float) totalBases / abts;
        System.out.printf(name + ":%.3f\n", perc);
    }
    
}
