package lol;
import java.util.Random;

public class Lol {

    public static void main(String[] args) {
       Random bag= new Random();
       int[][] matrix=new int[5][6];
       int number=bag.nextInt(10);
       
       System.out.print(number);
       
       for(int i=0;i<matrix.length;++i){ //Go through row first
           sum=0;
           for(int j=0;j<6;++j){//Go through column second
               matrix[i][j]=number;
           }
       }
           
       
    }
    
}
