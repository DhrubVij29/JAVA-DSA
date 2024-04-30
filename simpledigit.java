import java.util.*;

public class simpledigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;

        }
        int div = (int) Math.pow(10, count - 1);
        while (div != 0) {
            n = n / div;
            n = n % 10;
            div = div / 10;
            System.out.println(n);

        }

    }

}
