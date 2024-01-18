package lecture_6;

public class practice_7 {
        public static void main(String[] args) {
            int n = 5; // size of the rhombus
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                if (i == 1 || i == n) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                    for (int j = 1; j <= n - 2; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                if (i == 1 || i == n) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                    for (int j = 1; j <= n - 2; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
