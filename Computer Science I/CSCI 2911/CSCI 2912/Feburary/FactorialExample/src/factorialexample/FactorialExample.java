package factorialexample;
public class FactorialExample {
    
    public static void main(String[] args) {
        System.out.println("4!= "+factorial(4));
    }
    
    public static long factorial(int n){
        
        if (n<=1) return 1;        
        else return n*factorial(n-1);
//        return(n<=1)?1:n*factorial(n-1);
        }
    }
    
    

