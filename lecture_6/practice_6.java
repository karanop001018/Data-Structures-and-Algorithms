package lecture_6;

public class practice_6 {
    public static void main(String[] args) {
        int n = 5; // size of the butterfly
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            System.out.print("*");
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
