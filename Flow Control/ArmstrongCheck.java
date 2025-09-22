import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number, sum=0;
        while(original!=0){
            int digit = original%10;
            sum += digit*digit*digit;
            original/=10;
        }
        System.out.println(sum==number ? "Armstrong" : "Not Armstrong");
    }
}
