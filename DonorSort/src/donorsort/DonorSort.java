/*
 A local charity has hired you to help organize their lists of donors.  
The organization has a list of people who donated to the organization last year,
and another list of this year’s donors.  The group wants to send emails to three
groups of people:

*People who donated last year but didn’t this year
*People who donated both years
*People who donated this year but didn’t last year

Each group will receive a different email, so they need to know which donors
belong to each group.

The first line of the file Prob05.in.txt will contain a positive integer T 
denoting the number of test cases that follow.  Each test case will have the 
following input:

The first line of each test case will contain a comma separated list of the
names of last year’s donors.
The second line of each test case will contain a comma separated list of the
names of this year’s donors.

Example Input:

Bob,Joe,Steve,Mary,Ann
Bob,Steve,Ann,Paula,Chris

Bill,Ted,Liz,Quinn
Quinn,Liz,Ken,Bill

Example Output:

Joe,Mary
Ann,Bob,Steve
Chris,Paula

Ted
Bill,Liz,Quinn
Ken
 */
package donorsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DonorSort {

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
            if (a.equals(lastYearList2.get(lastYearList2.size() - 1))){
                System.out.print(a); 
            } else {
                System.out.print(a + ",");   
            }
        }
        System.out.println();
        for(String b : bothYearList){
            if (b.equals(bothYearList.get(bothYearList.size() - 1))){
                System.out.print(b); 
            } else {
                System.out.print(b + ",");   
            }
        }
        System.out.println();
        for(String c : thisYearList2){
            if (c.equals(thisYearList2.get(thisYearList2.size() - 1))){
                System.out.print(c); 
            } else {
                System.out.print(c + ",");   
            }
        }
        System.out.println();
    }
    
}
