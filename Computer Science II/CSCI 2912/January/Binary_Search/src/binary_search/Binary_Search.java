

package binary_search;

public class Binary_Search {

    public static void main(String[] args) {
        int values[]={101, 142,189, 199, 207, 222,
                      234, 289, 296, 310, 319, 388,
                      417, 429, 447, 521, 536, 600, 706};
        long startTime=System.nanoTime();
        int found=binarySearch(values, 310);
        
        
        
        if(found>=0){
            System.out.println("The value is found at index "+found);
        }
        else System.out.print("The value is not found.");
    }
    
    //reutrn -1 if not found
    //return the index if found
    private static int binarySearch(int[] values, int targetValue){
        int left, right, middle, index;
        boolean found;
        
        left=0; 
        right=values.length-1;
        index=-1;
        found=false;
        
        while(!found && left <=right){
            middle=(left+right)/2;
            if(values[middle]==targetValue){
                found=true;
                index=middle;
            }
            else if(targetValue>values[middle]) left=middle+1;
            else right = middle - 1;
        }
        return index;
    }
}
