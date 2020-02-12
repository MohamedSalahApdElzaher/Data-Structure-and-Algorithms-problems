import java.util.*;
public class sort {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		    int a[] = new int[n]; 
	    	for(int i=0;i<n;i++)
	    	a[i] = in.nextInt();
      		  int l=0,r=a.length-1;
	         a =  quicksort(a,l,r);

		  
	    for(int i : a)
	    	System.out.print(i+" ");
	
		in.close();
	}
	
	// Quick Sort 2
	static int [] quicksort2(int[]a,int l,int r) {
		  Random d = new Random();
		if(l < r) {
			  int k = l + d.nextInt(r-l);
			  // swap (a[l] , a[k])
			  int t = a[l];
			  a[l] = a[k];
			  a[k] = t;
			    int i[] = partition3(a,l,r);
			    int m1 = i[0] , m2 = i[1];
			    quicksort2(a,l,m1-1);
			    quicksort2(a,m2+1,r);
			   
		}
			return a;
	}
		
		static int[] partition3(int a[],int l,int r) {
			int m2 = partition(a,l,r);
			int m1=0;
			for(int i=0;i<m2;i++) {
				if(a[i] == a[m2]) {
					m1 = i;
					break;
				}
			}
			int x[] = {m1,m2};
			return x;
		}
	
	// Quick Sort
	static int [] quicksort(int[]a,int l,int r) {
			
			while(l<r) {
				int m = partition(a,l,r);
			if((m-l) < (r-m)){
				
				quicksort(a,l,m-1);
				l = m+1;
				
			}else {
				
				quicksort(a,m+1,r);
				r = m-1;
			}
			}
			return a;
	}

	// partition sub array
	static int partition(int a[] ,int l ,int r ) {
		// l =0 ; r = a.length-1;
		int x = a[l]; // pivot
		int j = l;
		for(int i = l+1; i<=r;i++) {
			if(a[i] <= x) {
				j++;
		    int t = a[j];
		    a[j] = a[i];
		    a[i]=t;
			}
		}
		int t = a[l];
		a[l] = a[j];
		a[j]=t;
		return j;
	}
	
	
}
