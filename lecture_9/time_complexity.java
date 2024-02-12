/*
****************************************************************
                        TIME COMPLEXITY
****************************************************************
*/


/*
Time Complexity : Relation between Input Size and Running Time(Operations)

package lecture_9;
import java.util.*;
public class time_complexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++) {
            System.out.println("Hello");
        }
    }
}

From above example of code we can say that it is a linear relation(only for above piece of code);
So, we can say that Time complexity is directly proportional to input n(i.e., input given by the user in this case)

*/









/*
*******************************Some Notes**********************************

Time complexity of an algorithm quantifies the amount of time taken by an
algorithm to run as a function of the length of the input.

***************************************************************************
Types of notations:
1. O(Big-Oh)-notation: It is used to denote asymptotic upper bound. For a given
function g(n), we denote it by O(g(n)). Pronounced as “big-oh of g of n”. It
is also known as worst case time complexity as it denotes the upper
bound in which the algorithm terminates.
2. Ω(Omega)-notation: It is used to denote asymptotic lower bound. For a given
function g(n), we denote it by Ω(g(n)). Pronounced as “big-omega of g of
n”. It is also known as best case time complexity as it denotes the lower
bound in which the algorithm terminates.
3. 𝚯(Theta)-notation: It is used to denote the average time of a program.
Example :
        int a = 0;
        for(int i = 1; i<n; i++){
            a = a+1;
        }
Linear Time Complexity. O(n)
Comparison of functions on the basis of time complexity
It follows the following order in case of time complexity:
O(n^n) > O(n!) > O(n^3) > O(n^2) > O(n.log(n)) > O(n.log(log(n))) > O(n) > O(sqrt(n)) > O(log(n)) > O(1)
Note: Reverse is the order for better performance of a code with corresponding
time complexity, i.e. a program with less time complexity is more efficient.
*/


/*
**************************************************************
                TIME COMPLEXITY COMPARISION
**************************************************************
Compare:    O(n)    O(n^2)  O(n^3)
 n=1         1        1        1
 n=2         2        2        2
 n=3         3        3        3
  |          |        |        |
  |          |        |        |
 n=10^5     10^5    10^10    10^30
 So, from this we can say that if value of n is small then it is negligible
 and if value of n is large then it affects the time complexity of the respective program.
*/






/*
*****************************************************************
                          SPACE COMPLEXITY
*****************************************************************
Space complexity of an algorithm quantifies the amount of time taken
by a program to run as a function of length of the input. It is directly
proportional to the largest memory your program acquires at any
instance during run time.
For example: int consumes 4 bytes of memory
*/