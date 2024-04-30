import java.util.*;

public class n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // prime number till n (low an high)
        int low = sc.nextInt();
        int high = sc.nextInt();
        int i, j;
        for (i = low; i <= high; i++) {
            for (j = 2; j <= i; j++) {
                if (i % 2 == 0) {

                    break;

                }
                if (i == j) {
                    System.out.println(j + "");

                }

            }

        }

    }

}
