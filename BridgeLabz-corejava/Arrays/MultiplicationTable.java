package Arrays;

import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] table = new int[10];
        for (int i = 1; i <= 10; i++) {
            table[i-1] = num * i;
            System.out.println(num + " * " + i + " = " + table[i-1]);
        }
    }
}
