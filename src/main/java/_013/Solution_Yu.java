package _013;

public class Solution_Yu {
    /*
     * Approach: Add --> Get Times --> Minus
     * Time Complexity: 26%
     * Space Complexity: 5%
     */
    public int romanToInt(String s) {
        int roman = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            switch (c[i]) {
                case 'I': roman += 1; break;
                case 'V': roman += 5; break;
                case 'X': roman += 10; break;
                case 'L': roman += 50; break;
                case 'C': roman += 100; break;
                case 'D': roman += 500; break;
                case 'M': roman += 1000; break;
            }
        }
        int ivNums = getTimes(s, "IV");
        int ixNums = getTimes(s, "IX");
        int xlNums = getTimes(s, "XL");
        int xcNums = getTimes(s, "XC");
        int cdNums = getTimes(s, "CD");
        int cmNums = getTimes(s, "CM");
        roman = roman - (ivNums + ixNums) * 2 - (xlNums + xcNums) * 20 - (cdNums + cmNums) * 200;
        return roman;
    }

    public int getTimes(String s, String target) {
        int times = s.split(target).length - 1;
        if(times <= 0 && s.contains(target)) {
            times = 1;
        }
        return times;
    }
}
