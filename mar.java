import java.util.*;
public class mar{
	
    public static void main(String []s){
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	long  a[]=new long  [n];
    	long   b[]=new long  [ n];
    	for(int i=0;i<n;i++)
    		a[i]=in.nextLong();
    	for(int i=0;i<n;i++)
    		b[i]=in.nextLong();
    	
    	System.out.println(mar(n,a,b));
    		
    }
    
    

    static long  mar(int n , long  []a, long  []b){
    	Arrays.sort(a);
    	Arrays.sort(b);
    	long  sum=(long  )0;
    	for(int i=0;i<n;i++){
    		sum += a[i] * b[i];
    	}
    	return sum;
    }
}