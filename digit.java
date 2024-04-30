import java.util.*;

public class digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (n > 0) {
                n = n / 10; // 345
                count++;

            }

        }

        System.out.println("number of counts is :" + count);

    }

}

