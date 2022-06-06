import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time1 = 3600 * scanner.nextInt();
        time1 += 60 * scanner.nextInt();
        time1 += scanner.nextInt();

        int time2 = 3600 * scanner.nextInt();
        time2 += 60 * scanner.nextInt();
        time2 += scanner.nextInt();

        System.out.println(time2 - time1);
    }
}