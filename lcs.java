import java.util.*;
public class lcs{	
	public static void main(String[] e) {
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int x[] = new int[n];
	    for(int i=0;i<n;++i)
	    	x[i] = in.nextInt();
	    
	    int m = in.nextInt();
	    int y[] = new int[m];
	    for(int i=0;i<m;++i)
	    	y[i] = in.nextInt();
	    
		System.out.println(lcs(x,y,x.length,y.length));
		 
		in.close();
	}
	
	// Longest Common subString bottom up version
	
	static int lcs(int[] X, int[] Y, int m, int n) 
	    { 
	        int L[][] = new int[m + 1][n + 1]; 

	        for (int i = 0; i <= m; i++) { 
	            for (int j = 0; j <= n; j++) { 
	                if (i == 0 || j == 0) 
	                    L[i][j] = 0; 
	                else if (X[i - 1] == Y[j - 1]) 
	                    L[i][j] = L[i - 1][j - 1] + 1; 
	                else
	                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]); 
	            } 
	        } 
	        return L[m][n]; 
	    } 
	
	
}
