package selectionSortCode;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	
	 void selectionSort(int array[]) {
		    int size = array.length;

		    for (int step = 0; step < size - 1; step++) {
		      int min_idx = step;

		      for (int i = step + 1; i < size; i++) {

		     
		        if (array[i] < array[min_idx]) {
		          min_idx = i;
		        }
		      }

		   
		      int temp = array[step];
		      array[step] = array[min_idx];
		      array[min_idx] = temp;
		    }
		  }
	public static void main(String[] args) {
		  int n;  
		  Scanner sc=new Scanner(System.in);  
		  System.out.print("Enter the number of elements you want to store: ");  
		  
		  n=sc.nextInt();  
		
		  int[] data = new int[n];  
		  System.out.println("..................................................................");
		  System.out.println("Enter the elements of the array: "); 
		  System.out.println("..................................................................");
		  for(int i=0; i<n; i++)  
		  {  
		  
		  data[i]=sc.nextInt();  
		  }  
		  System.out.println("Array elements are: ");  
		 
		  for (int i=0; i<n; i++)   
		  {  
		  System.out.println(data[i]);  
		  }  
		  System.out.println("..................................................................");
	    
		    SelectionSort ss = new SelectionSort();
		    ss.selectionSort(data);
		    System.out.println("Sorted Array in Ascending Order: ");
		    System.out.println(Arrays.toString(data));
		  }
		

	}


