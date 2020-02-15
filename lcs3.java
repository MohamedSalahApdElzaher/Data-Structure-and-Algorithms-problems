import java.util.*;
public class lcs3{	
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
	    
	    int z = in.nextInt();
	    int Z[] = new int[z];
	    for(int i=0;i<z;++i)
	    	Z[i] = in.nextInt();
	    
		System.out.println(lcs3(x,y,Z,x.length,y.length,Z.length));
		 
		in.close();
	}
	
	// Longest Common subString bottom up version
	
	static int lcs3(int[] X, int[] Y, int Z [] , int m, int n , int z) 
	    { 
	        int L[][][] = new int[m + 1][n + 1][z + 1]; 

	        for (int i = 0; i <= m; i++) { 
	            for (int j = 0; j <= n; j++) { 
	            	for(int l = 0;l<=z;l++) {
	                if (i == 0 || j == 0 || l==0) 
	                    L[i][j][l] = 0; 
	                else if (X[i - 1] == Y[j - 1] && X[i - 1] == Z[ l - 1] && Y[j - 1] == Z[ l - 1] ) 
	                    L[i][j][l] = L[i - 1][j - 1][ l - 1 ] + 1; 
	                else
	                    L[i][j][l] = Math.max(  Math.max( L[i - 1][j][l], L[i][j - 1][l]) , L[i][j][l-1]); 
	            } 
	            }
	        } 
	        return L[m][n][z]; 
	    } 
	
	
}
