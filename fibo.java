import java.util.*;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, c;

        for (int i = 0; i <= n; i++) {
            System.out.println(a + "");
            c = a + b;
            a = b;
            b = c;

        }
    }

}