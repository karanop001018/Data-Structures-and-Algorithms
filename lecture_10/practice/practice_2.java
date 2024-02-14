//Q. Find the maximum & minimum number in an array of integers.

package lecture_10.practice;
//import java.util.*;
//public class practice_2 {
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter size of an array : ");
//        int size = sc.nextInt();
//        int numbers[] = new int[size];
//
//        for (int i=0; i<size; i++){
//            System.out.println("Enter a number for your array : ");
//            numbers[i] = sc.nextInt();
//        }
//
//        int maximum = Integer.MAX_VALUE;
//        int minimum = Integer.MIN_VALUE;
//
//        for (int i=0; i< numbers.length;i++){
//            if (numbers[i] < minimum){
//                minimum = numbers[i];
//            }
//            if (numbers[i] > maximum){
//                maximum = numbers[i];
//            }
//        }
//        System.out.println("Largest number is : "+maximum);
//        System.out.println("Smallest number is : "+minimum);
//    }
//
//}




public class practice_2 {
    public static void main(String[] args) {
        int[] array = {10, 20, 25, 63, 96, 57};
        int max = findMax(array);
        int min = findMin(array);
        System.out.println("Maximum number in array is : " + max);
        System.out.println("Minimum number in array is : " + min);
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for(int i=1;i < array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}



