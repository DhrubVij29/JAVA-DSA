import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // prime or not!

        int count = 0;
        for (int j = 1; j <= n; j++) {
            if (n % j == 0) {
                count++;

            }
            if (count == 2) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }

        }
    }
}
