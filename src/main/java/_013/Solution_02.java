package _013;

public class Solution_02 {
    /*
    Approach
    Time Complexity: 99.5%
    Space Complexity: 11%
     */
    public int romanToInt_03(String s) {
        int roman = 0;
        char[] c = s.toCharArray();
        int rightDigit = 0;
        for(int i = c.length - 1; i >= 0; i --) {
            switch (c[i]) {
                case 'I':
                    if(rightDigit > 1) {
                        roman -= 1;
                    }else {
                        roman += 1;
                    }
                    rightDigit = 1;
                    break;
                case 'V':
                    roman += 5;
                    rightDigit = 5;
                    break;
                case 'X':
                    if(rightDigit > 10) {
                        roman -= 10;
                    }else {
                        roman += 10;
                    }
                    rightDigit = 10;
                    break;
                case 'L':
                    roman += 50;
                    rightDigit = 50;
                    break;
                case 'C':
                    if(rightDigit > 100) {
                        roman -= 100;
                    }else {
                        roman += 100;
                    }
                    rightDigit = 100;
                    break;
                case 'D':
                    roman += 500;
                    rightDigit = 500;
                    break;
                case 'M':
                    roman += 1000;
                    rightDigit = 1000;
                    break;
            }
        }
        return roman;
    }
}
