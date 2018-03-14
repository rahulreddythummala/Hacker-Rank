// Fib in O(N)
// Set the first and second term as 1, 1 and find the consecutive terms until n is greater than 2

import java.util.*;

public class Solution {

    
    public static int fibonacci(int n) {
        if(n==0) return 0;
        if(n<=2) return 1;
        int a=1, b=1;
        int c=a+b;
        while(n-- > 2){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
