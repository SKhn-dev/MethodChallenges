import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        //Declare two integer values
        double num1, num2;
        //Read in two numbers
        Scanner reader=new Scanner(System.in);
        String choice="yes";
        int op;
        //a loop that quit from the program when user enters no
        do {
            System.out.println("What operation you want to perform?");
            System.out.println("1- Addition\n2-Subtraction\n3-Multiplication\n4-Division");
            System.out.println("Please enter choice");
            op=reader.nextInt();


            switch(op){

                case 1:
                    System.out.println("Please enter a number");
                    num1=reader.nextDouble();
                    System.out.println("Please enter a number");
                    num2=reader.nextDouble();
                    addition(num1, num2);
                    break;
                case 2:
                    System.out.println("Please enter a number");
                    num1=reader.nextDouble();
                    System.out.println("Please enter a number");
                    num2=reader.nextDouble();
                    subtraction(num1, num2);
                    break;
                case 3:
                    System.out.println("Please enter a number");
                    num1=reader.nextDouble();
                    System.out.println("Please enter a number");
                    num2=reader.nextDouble();
                    multiply(num1,num2);
                    break;
                case 4:
                    System.out.println("Please enter a number");
                    num1=reader.nextDouble();
                    System.out.println("Please enter a number");
                    num2=reader.nextDouble();
                    divide(num1, num2);
                    break;
                default:
                    System.out.println("Wrong choice");

            }
            System.out.println("Do you wish to continue(yes/no? ");
            choice=reader.next();
        }while (choice.equals("yes"));
    }
        //function to add two numbers
       public static void addition(double a, double b){
        double sum=a+b;
            System.out.println("Result: "+sum);
        }
    //function to subtract two numbers
    public static void subtraction(double a, double b){
        double sub=a-b;
        System.out.println("Result: "+sub);
    }
    //function to multiply two numbers
    public static void multiply(double a, double b){
        double mul=a*b;
        System.out.println("Result: "+mul);
    }
    //function to divide two numbers
    public static void divide(double a, double b){
        double div=a/b;
        System.out.println("Result: "+div);
    }
    }



