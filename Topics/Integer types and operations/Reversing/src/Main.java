import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int thirdDigit = number % 10;
        int secondDigit = (number % 100 - thirdDigit) / 10;
        int firstDigit = (number % 1000 - thirdDigit - secondDigit) / 100;
        System.out.println(thirdDigit * 100 + secondDigit * 10 + firstDigit);
    }
}