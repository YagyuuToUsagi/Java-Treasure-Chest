
package bisectionsearch;

/**
 *
 * @author brianaranda
 */

public class BisectionSearch {

    /**
     * @param args the command line arguments
     */
    
    public static double function(double x){
        double value=0;
        value=Math.pow(x, 5)+Math.pow(x, 3)+2*x*x+5*x-100;
        return value;
    }
    
//    public static double guessValue(){
//       int i=0;
//       while(function(i)*function(i+1)>0) i++;
//       
//       return value;
//    }
    
    public static void BiSearch(double a, double b){
        if(Math.abs(b-a)<0.1) System.out.println("The root is "+((a+b)/2));
        
        else{
            double middle=(a+b)/2;
            
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
