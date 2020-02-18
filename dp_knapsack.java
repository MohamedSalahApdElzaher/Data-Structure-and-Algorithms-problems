import java.util.*;
public class dynamic_programming {	
	
	public static void main(String[] e) {
		Scanner in = new Scanner(System.in);

		int v[]= {3,4,6};
		int w[]= {2,3,5};
		int c = 8;
		System.out.println(dp_knapsack(w,v,w.length,c));
 
		in.close();
	}
	


	static int dp_knapsack(int w[] , int v[] , int n , int c) {
	     int t[][] = new int [n+1][c+1];
	     for(int i=0;i<=n;i++) {
	    	 for(int j=0;j<=c;j++) {
	    		 if(i==0||j==0)t[i][j]=0;
	    		 else if(w[i-1] > j) t[i][j]=t[i-1][j];
	    	  	 else {
	    			t[i][j] = Math.max(v[i-1] + t[i-1][j-w[i-1]], t[i-1][j]);
	    		}
	    	 }
	     }
	     return t[n][c];
	}
}
