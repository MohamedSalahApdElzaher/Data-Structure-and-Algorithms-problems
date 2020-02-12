import java.util.*;

public class bs{

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();		
		// Binary search 	
		int size = in.nextInt();
		int  [] arr = new int [size];
		for(int i=0;i<arr.length;i++) // O(n)
			arr[i] = in.nextInt() ;
	
		int k = in.nextInt();		
		for(int i=0;i<k;i++) {
			int itm = in.nextInt();
			int low=0;
			int high = size-1;
			int mid = 0;
				while(true) {
					mid = low + (high-low)/2; // (low+high)\2;
				
					if(low > high) {
						System.out.print("-1 " );
						break;
					}
			
					if(arr[mid] == itm) {
						System.out.print( mid +" ");
						break;
					}
					if(arr[mid] < itm) 
						low = mid+1;	
					if(arr[mid] > itm) 
						high = mid-1;
			
					}
				}
		
	
	}

}