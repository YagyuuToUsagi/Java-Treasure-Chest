package getmessagedemo;

/**
 *
 * @author brianaranda
 * @Exception
 */
public class GetMessageDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            callMethod1();
            
        }
        catch (Exception e){
            System.err.println("There's an error: "+e.getMessage());
            //System.err.println(e.getStackTrace());
            e.printStackTrace();
        }
    }
    
    private static void callMethod1()throws myOwnException{
        callMethod2();
    }
    
    private static void callMethod2() throws myOwnException
    {
        double balance = -1;
        if(balance<0) throw new myOwnException("Negative Balance");
    }
}
