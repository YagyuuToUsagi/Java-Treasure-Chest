package cantoring_quiz;

import java.util.Scanner;
import java.io.*;

/**
 * @Quiz 4
 * @author Isaiah, Brian
 * @date 02/21/17
 */
public class Cantoring_Quiz {

    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new File("file.txt"));
        int order, n;
        String line;

        while (file.hasNext()) {
            order = file.nextInt();
            n = (int) Math.pow(3, order);
//            cantor(n);
            line = lineCantor(n);
            System.out.println(line);
//            cantor(line);

        }

    }

    public static String cantor(String line) {
        if (n == 1) {
            return 1;
        } else if (n > 1) {
            cantor(n - 1);
        }
    }

    public static String lineCantor(int n) {
        String a = "";
        for (int i = 0; i < n; i++) {
            a += "-";
            for (int i = 0; i < 3; ) {
                
            }
        }
        return a;

    }

}
