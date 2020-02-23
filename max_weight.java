import java.util.*;
public class max_weight{	
	
	public static void main(String[] e) {
		Scanner in = new Scanner(System.in);
	  
		int c = in.nextInt();
		int n = in.nextInt();
		int w[]=new int[n];
		for(int i=0;i<n;i++)
			w[i]=in.nextInt();
		
		System.out.println(max_weight(w,n,c));
		
		in.close();
	}
static int max_weight(int w[] , int n , int c) {
		  int t[][] = new int [n+1][c+1];
		     for(int i=1;i<=n;i++) {
		    	 for(int j=1;j<=c;j++) {		    		 
		    		  if(w[i-1] > j) t[i][j]=t[i-1][j];
		    	  	 else {
		    			t[i][j] = Math.max(w[i-1] + t[i-1][j-w[i-1]], t[i-1][j]);
		    		}
		    	 }
		     }
		     return t[n][c];
	}
}