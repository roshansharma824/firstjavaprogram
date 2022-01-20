package com.company.recursion2;

import java.util.Scanner;

public class CheckAB {
    public class Solution {

        public static boolean checkAB(String input) {
            if(input.length() ==0)
            {
                return true;
            }

            if(input.charAt(0) == 'a')
            {
                if(input.length() > 2 && input.substring(1,3).equals("bb"))
                {
                    return checkAB(input.substring(3));
                }
                else
                {
                    return checkAB(input.substring(1));
                }
            }
            return false;

            // Write your code here
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        System.out.println(Solution.checkAB(input));
    }
}
