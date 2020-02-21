/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formallanguagesautomatalecture;

/**
 *
 * @author abdulhalik
 */
public class Lab2 {
    
    public static boolean DFAQ1(String str) {
        if((str.charAt(0) == 'a')) {
            if ((str.charAt(1) == 'b')) {
                return true;
            } 
        } else {
            return false;
        }
        return false;
    }
    
    public static boolean DFAQ3(String str) {
        if (str.contains("000")) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        String str = "abb";
        String str1 = "aaab";
        System.out.println(DFAQ1(str));
        System.out.println(DFAQ1(str1));
        
        String str2 = "10001101";
        String str3 = "11110110";
        System.out.println(DFAQ3(str2));
        System.out.println(DFAQ3(str3));
    }
    
}
