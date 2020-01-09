package numberconverterdemo;

public class NumberConverterDemo {

    public static void main(String[] args) {
        String aString = "123";
        int aInt = Integer.parseInt(aString);
                
        System.out.println("The input value: " + aInt);
        System.out.println("Binary value: " + Integer.toBinaryString(aInt));
        System.out.println("Octal value: " + Integer.toOctalString(aInt));
    }

}
