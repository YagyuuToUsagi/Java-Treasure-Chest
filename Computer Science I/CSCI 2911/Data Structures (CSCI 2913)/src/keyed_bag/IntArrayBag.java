package keyed_bag;

import java.util.Scanner;

public class IntArrayBag {
    
    private int[] keys; //Int array that stores keys
    private String[] data; //Int array that stores strings of data
    private int manyItems; //
    private int occurrence; //

    
    //Constructor
    public IntArrayBag(){
        int Initial_C = Integer.MAX_VALUE; //
        manyItems = 0;
        data = new String[Initial_C];  
        keys = new int[Initial_C];

    }

    
    public IntArrayBag(int initialCapacity){
        if (initialCapacity < 0)
        {
            throw new IllegalArgumentException
                    ("The initialCapacity is negative: " + initialCapacity);            
        }
        
        data = new String[initialCapacity];
        keys = new int[initialCapacity];
        manyItems = 0; 
    }
    
    public void add (String entry, int key){
        
        if (keyExists(key))
        {
            throw new IllegalArgumentException
                    ("Key " + key + " already exists.");
        }
        
        if (manyItems == data.length)
        {  // Ensure twice as much space as we need.
            ensureCapacity((manyItems + 1)*2);
        }

        data[manyItems] = entry;
        keys[manyItems] = key;
        manyItems++;
    }
    
    public void addMany(int elements){
        
    }
    
    public void addAll(IntArrayBag addend){
        
    }
    
    public IntArrayBag clone( ){
        
    }
    
    public int countOccurrences(int target){
        
        int occurrence=0;
        
        for (int i=0;i<.length;++i)
        if (target==occurrence){
            ++occurrence;
        }
        
        return occurrence;
    }
    
    public void ensureCapacity(int minimumCapacity){
        
    }
    
    public int getCapacity( ){
       return data.length; 
    }
    
    public boolean remove(int key){
        int index = findKey(key); // The location of target in the data array.    
         
        if (index == manyItems)
            // The target was not found, so nothing is removed.
            return false;
        else
        {   // The target was found at keys[index].
            // So reduce manyItems by 1 and copy the last element onto data[index].
            manyItems--;
            data[index] = data[manyItems];
            keys[index] = keys[manyItems];
            return true;
        }        
    }
    
    public int size( ){
        
    }
    
    public void trimToSize( ){
        
    }
    
    public static IntArrayBag union(IntArrayBag b1, IntArrayBag b2){
        
    }
}
