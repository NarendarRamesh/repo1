/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();//Integer.parseInt(sc.nextLine());
		while(t>0)
		{
		    int n = sc.nextInt();//Integer.parseInt(sc.nextLine());
		    int[] array = new int[n];
		    for(int i = 0;i<n;i++)
		    {
		        array[i]=sc.nextInt();
		    }
		    sort012(array);
		    t--;
		}
	}
	public static void sort012(int[] array)
	{
	    int low=0;
	    int mid=0;
	    int high =array.length - 1;
	    int temp;
	    while(mid<=high)
	    {
	        if(array[mid]==0)
	        {
	            temp = array[low];
	            array[low]= array[mid];
	            array[mid]=temp;
	            low++;
	            mid++;
	        }
	        else if(array[mid] == 1)
	        {
	            mid++;
	        }
	        else
	        {
	            temp = array[high];
	            array[high]= array[mid];
	            array[mid]=temp;
	            high--;
	            
	        }
	    }
	    for(int i = 0;i<array.length;i++)
	    {
	        System.out.print(array[i]+" ");
	    }
	    System.out.println();
	}
	
}
