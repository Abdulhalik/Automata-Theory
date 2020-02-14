/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formallanguagesautomatalecture;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abdulhalik
 * LAB 1 - Deterministic Finite Automata
 */
public class Lab1 {
    
    
    public static boolean isAcceptableSimple(String str) {
        if (str.contains("01")) { return true; }
        return false;
    }
    
    
    public static boolean isAcceptable(String str) {
        boolean accepted = false;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i-1) == '0' && str.charAt(i) == '1') {
                accepted = true;
                return accepted;
            }
        }
        return accepted;
    }
    
    public static void noConsecutiveBinaries(int n) {
        for (int i = 0; i < Math.pow(2, n); i++) {
            String binaryString = Integer.toBinaryString(i);
            
            while (binaryString.length() < n) {
                binaryString = "0" + binaryString;
            }
            
            if(!binaryString.contains("11")) {
                System.out.println(binaryString);
            }
        }
    }
     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        System.out.println(str + " is acceptable : " + isAcceptable(str));
        noConsecutiveBinaries(2);
        
    }
    
}
