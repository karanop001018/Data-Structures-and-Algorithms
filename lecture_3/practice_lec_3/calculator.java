package lecture_3.practice_lec_3;
import java.util.Scanner;
public class calculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the first number (a): ");
            double a = sc.nextDouble();

            System.out.println("Enter the second number (b): ");
            double b = sc.nextDouble();

            System.out.println("Enter the operation (1: Addition, 2: Subtraction, 3: Multiplication, 4: Division, 5: Modulus): ");
            int operation = sc.nextInt();

            double result;
            switch (operation) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Error! Dividing by zero is not allowed.");
                        return;
                    }
                    break;
                case 5:
                    result = a % b;
                    break;
                default:
                    System.out.println("Error! Invalid operation. Please enter an integer between 1 and 5.");
                    return;
            }

            System.out.println("The result is: " + result);
        }
}
