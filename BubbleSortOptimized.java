
public class BubbleSortOptimized {
public static void bubbleSort(int arr[],int n)
	    {
	        boolean swapped = true;
	        for (int i = 0; i < n-1 && swapped; i++){
                    swapped = false;
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
                            swapped = true;
	                }
                }
	    }
	 
	    /* Prints the array */
	    void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
	    // Driver method to test above
	    public static void main(String args[])
	    {
	        BubbleSortOptimized ob = new BubbleSortOptimized();
	        int arr[] = {64, 34, 25, 12, 22, 11, 90};                
	        int numberofele=arr.length;
	        ob.bubbleSort(arr,numberofele);
	        System.out.println("Sorted array");
	        ob.printArray(arr);
	    }
}
