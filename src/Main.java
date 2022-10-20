import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        do {
            b = sc.nextInt();
            a += b;
            c = a;
        } while (b != 0);
        System.out.println(c);
    }
}
