package gcd_example;
import java.util.Scanner;

public class GCD_Example {

    
    public static void main(String[] args) {
        int num1,num2;
        int temp;
        Scanner keyboard=new Scanner(System.in);
        
        System.out.println("The first number: ");
        num1=keyboard.nextInt();
        
        System.out.println("The second number: ");
        num2=keyboard.nextInt();
        
        if (num1<0) num1*=-1;
        if (num2<0) num2*=-1;                
        if(num1<num2) {temp= num1; num1=num2; num2=temp;}
        System.out.println("The Greatest Common Divisor of "
                +"these two numbers is "+gcd(num1,num2));
    }
    
    public static int gcd(int num1, int num2){
        if (num1%num2==0) return num2;
        else return gcd(num2, num1%num2);
    }
}
