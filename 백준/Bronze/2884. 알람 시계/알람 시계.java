import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (hour == 0) {
            if (min < 45) {
                hour = 23;
                min += 15;
            } else
                min -= 45;
        } else {
            if (min < 45) {
                hour -= 1;
                min += 15;
            } else {
                min -= 45;
            }
        }

        System.out.printf("%d %d", hour, min);
        sc.close();
    }
}
