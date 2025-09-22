import java.util.*;

class NaturalSum {
    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
}

public class NaturalSumProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("Recursive Sum: " + NaturalSum.recursiveSum(n));
            System.out.println("Formula Sum: " + NaturalSum.formulaSum(n));
        } else {
            System.out.println("Not a natural number");
        }
    }
}
