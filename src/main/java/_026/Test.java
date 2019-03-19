package _026;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int same = 2;
        System.arraycopy(array, 2, array, 0, 2);
        array = Arrays.copyOf(array, array.length - same);
        System.out.println(Arrays.toString(array));;
    }
}
