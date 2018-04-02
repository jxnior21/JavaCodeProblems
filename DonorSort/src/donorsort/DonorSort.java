/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donorsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author power user
 */
public class DonorSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String lineOne = scan.nextLine();
	String lineTwo = scan.nextLine();
        System.out.println();
	List<String> lastYearList = new ArrayList<>(Arrays.asList(lineOne.split(",")));
	List<String> thisYearList = new ArrayList<>(Arrays.asList(lineTwo.split(",")));
        List<String> lastYearList2 = new ArrayList<>();
	List<String> thisYearList2 = new ArrayList<>();
	List<String> bothYearList = new ArrayList<>();
        for(String s : lastYearList){
            if(thisYearList.contains(s)){
                bothYearList.add(s);
            } else if(!thisYearList.contains(s)) {
                lastYearList2.add(s);
            }
        }
        for(String a : thisYearList){
            if(!lastYearList.contains(a)){
                thisYearList2.add(a);
            }
        }    
        Collections.sort(lastYearList2);
        Collections.sort(bothYearList);
        Collections.sort(thisYearList2);
        for(String a : lastYearList2){
            if (a == lastYearList2.get(lastYearList2.size() - 1)){
                System.out.print(a); 
            } else {
                System.out.print(a + ",");   
            }
        }
        System.out.println();
        for(String b : bothYearList){
            if (b == bothYearList.get(bothYearList.size() - 1)){
                System.out.print(b); 
            } else {
                System.out.print(b + ",");   
            }
        }
        System.out.println();
        for(String c : thisYearList2){
            if (c == thisYearList2.get(thisYearList2.size() - 1)){
                System.out.print(c); 
            } else {
                System.out.print(c + ",");   
            }
        }
        System.out.println();
    }
    
}
