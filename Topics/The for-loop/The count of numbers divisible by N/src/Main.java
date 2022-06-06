import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int counter = 0;

        for (int i = a; i <= b; i++) {
            counter = i % n == 0 ? counter + 1 : counter;
        }
        System.out.println(counter);
    }
}