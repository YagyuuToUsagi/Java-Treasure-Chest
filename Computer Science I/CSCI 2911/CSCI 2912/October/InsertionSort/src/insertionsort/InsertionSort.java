package insertionsort;

// Java program for implementation of Insertion Sort
class InsertionSort
{
	void sort(int array[])
	{
		int n = array.length;
		for (int i=1; i<n; ++i)
		{
			int d = array[i];
			int b = i-1;
                        
			while (b>=0 && array[b] > d)
			{
				array[b+1] = array[b];
				b = b-1;
			}
			array[b+1] = d;
		}
	}

	static void displayArray(int array[])
	{
		int n = array.length;
		for (int i=0; i<n; ++i)
			System.out.print(array[i] + " ");

		System.out.println();
	}

	public static void main(String args[]) //Main method
	{	 
		int array[] = {12, 11, 13, 5, 6};

		InsertionSort a = new InsertionSort();	 
		a.sort(array);
		
		displayArray(array); //Displays arrayay
	}
} /* This code is contributed by Rabat Mishra. */

