// Problem 3

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = Fib(n);
        System.out.println("Fibonacci of given "+n+" is: "+res);
        in.close();
    }
    public static int Fib(int n){
        
        if(n <= 2 ){
            return 1;
        }else{
            return Fib(n-2)+Fib(n-1);
        }
    }
}
