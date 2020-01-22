package Maths;

//change around 'n' for different factorial results
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n + "! = " + factorial(n));
    }

    //Factorial = n! = n1 * (n-1) * (n-2)*...1

    /**
     * Calculate factorial N
     *
     * @param n the number
     * @return the factorial of {@code n}
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new ArithmeticException("n < 0"); //if n will be less than 0,then it will throw an Exception that is ArithmeticException//
        }
        long fac = 1;   
        for (int i = 1; i <= n; ++i) {
            fac *= i;   //fac *=i is; is equivalent to fac=fac*i;//
        }
        return fac; //Return factorial  
    }
}
