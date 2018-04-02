/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.code;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author power user
 */
public class PracticeCode {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] nums = input.split(" ");
        float distance = Float.parseFloat(nums[0]);
        distance *= 1000000;
        float speed = Float.parseFloat(nums[1]);
        float totalHours = distance / speed;
        float daysWholeNum = totalHours / 24;
        String dayRemString = String.valueOf(daysWholeNum);
        String[] dayRemainder =  dayRemString.split("\\.");
        List<Character> dayRemainderList = new ArrayList<>(Arrays.asList(dayRemainder[1]));
        int days = Integer.parseInt(dayRemainder[0]);
//        float dayRemNum = Float.parseFloat(dayRemainder[1]);
//        float hoursWholeNum = dayRemNum *= 24;
//        String hourRemString = String.valueOf(hoursWholeNum);
//        String[] hourRemainder =  hourRemString.split("\\.");
//        int hours = Integer.parseInt(hourRemainder[0]);
//        float hourRemNum = Float.parseFloat(hourRemainder[1]);
//        float minutesWholeNum = hourRemNum * 60;
//        String minuteRemString = String.valueOf(minutesWholeNum);
//        String[] minuteRemainder =  minuteRemString.split("\\.");
//        int minutes = Integer.parseInt(minuteRemainder[0]);
//        float secondRemNum = Float.parseFloat(minuteRemainder[1]);
//        int seconds = Math.round(secondRemNum * 60);
//        System.out.println("Time to Mars: " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }    
}
    
