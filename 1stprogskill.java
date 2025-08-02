package scannerexa;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        double d = num;  
        System.out.println("Implicit (int to double): " + d);


        System.out.print("Enter a decimal number: ");
        double dec = sc.nextDouble();
        int i = (int) dec; 
        System.out.println("Explicit (double to int): " + i);


        sc.nextLine(); 
        System.out.print("Enter a number as string: ");
        String strNum = sc.nextLine();
        int parsed = Integer.parseInt(strNum);
        System.out.println("String to int: " + parsed);


        String numAsString = String.valueOf(num);
        System.out.println("Int to String: " + numAsString);

        sc.close();
    }
}
