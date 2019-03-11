package _013;

public class Solution_01 {
    /*
    Approach: Add --> Minus
    Time Complexity: 99.9%
    Space Complexity: 18%
     */
    public int romanToInt(String s) {
        int roman = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            switch (c[i]) {
                case 'I':
                    roman += 1;
                    break;
                case 'V':
                    roman += 5;
                    break;
                case 'X':
                    roman += 10;
                    break;
                case 'L':
                    roman += 50;
                    break;
                case 'C':
                    roman += 100;
                    break;
                case 'D':
                    roman += 500;
                    break;
                case 'M':
                    roman += 1000;
                    break;
            }
            if (i != 0) {
                if ((c[i - 1] == 'I') && (c[i] == 'V' || c[i] == 'X')) {
                    roman -= 2;
                }
                if ((c[i - 1] == 'X') && (c[i] == 'L' || c[i] == 'C')) {
                    roman -= 20;
                }
                if ((c[i - 1] == 'C') && (c[i] == 'D' || c[i] == 'M')) {
                    roman -= 200;
                }
            }
        }
        return roman;
    }
}
