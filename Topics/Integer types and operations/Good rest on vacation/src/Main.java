import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int holidayDuration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelCost = scanner.nextInt();

        int totalCost = 0;
        totalCost += (holidayDuration -1) * hotelCost;
        totalCost += holidayDuration * foodCost;
        totalCost += flightCost * 2;

        System.out.println(totalCost);
    }
}