import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        if (canSplit(n, m, k)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean canSplit(int n, int m, int k) {
        if (k > m * n) {
            return false;
        } else if (m * n == k) {
            return true;
        } else {
            for (int i = 1; i < n; i++) {
                if (m * i == k) {
                    return true;
                }
            }

            for (int i = 1; i < m; i++) {
                if (n * i == k) {
                    return true;
                }
            }
        }
        return false;
    }
}