import java.util.Scanner;

public class MinMaxMethods {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
//input three numbers
        Scanner reader=new Scanner(System.in);
        System.out.println("Please enter three numbers: ");
        System.out.println("Number 1: ");
        a= reader.nextDouble();
        System.out.println("Number 2: ");
        b= reader.nextDouble();
        System.out.println("Number 3: ");
        c= reader.nextDouble();
        //check if user has entered integers
        if(a%1==0){
            System.out.println("Minimum number is "+minNumber((int)a, (int)b, (int)c));
            System.out.println("Maximum number is "+maxNumber((int)a, (int)b, (int)c));
        }
        else{
            System.out.println("Minimum number is "+minNumber(a, b, c));
            System.out.println("Maximum number is "+maxNumber(a, b, c));
        }

    }
    //method to return minimum number
    public static int minNumber(int n1, int n2, int n3){
        if(n1<n2 && n2<n3)
            return n1;
        else if(n2<n3)
            return n2;
        else return n3;
    }
    //method to return maximum number
    public static int maxNumber(int n1, int n2, int n3){
        if(n1>n2 && n2>n3)
            return n1;
        else if(n2>n3)
            return  n2;
        else return n3;

    }
    //method to return minimum number provided 3 doubles
    public static double minNumber(double n1, double n2, double n3){
        if(n1<n2 && n2<n3)
            return n1;
        else if(n2<n3)
            return n2;
        else return n3;
    }
    public static double maxNumber(double n1, double n2, double n3){
        if(n1>n2 && n2>n3)
            return n1;
        else if(n2>n3)
            return  n2;
        else return n3;

    }

}
