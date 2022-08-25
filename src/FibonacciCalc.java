import java.math.BigInteger;

public class FibonacciCalc {
    public static void main(String[] args) {
        Fibonacci(100);

    }

    //Method to calculate first 100 numbers of fibonacci
    public static void Fibonacci(int n) {
        //long n1=0; long n3;
        if (n == 0 || n == 1) {
            System.out.println(BigInteger.ONE);
        }
//using big integer since 100th term can not be stored in int or long data type
        BigInteger n1, n2, n3;
        n1 = BigInteger.ZERO;
        n2 = BigInteger.ONE;
        n3 = BigInteger.ONE;

        int counter = 0;
        while (counter < n) {
            n3 = n1.add(n2);
            n1 = n2;
            n2 = n3;
            System.out.print(n1+" ");
            counter++;
        }

    }



}
