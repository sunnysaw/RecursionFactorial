/*
Question : Write a program to get factorial of any number by using recursion.
 */
import java.util.Scanner;
public class Main {
    static void RecursiveFunction(int number){
        int temp = 1;
        if (number == 1){
            System.out.println(temp);
            return;
        }
        temp *= number;
        number--;
        RecursiveFunction(number);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();
        System.out.println("Printing the result :");
        RecursiveFunction(number);

    }
}