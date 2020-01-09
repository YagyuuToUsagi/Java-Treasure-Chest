package javaapplication14;

import java.util.Scanner;

public class JavaApplication14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int power = 1;
        int sum = 0;
        String number;

        System.out.print("Type a number: ");
        number = input.nextLine();

        for (int i = number.length() - 1; i >= 0; --i) {
            int digit = number.charAt(i) - '0';
            int n = digit * power;
            sum += n;
            power *= 10;

        }
        System.out.print(sum);
    }

}
