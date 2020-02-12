package coursera_assignments;
import java.util.*;
public class sol  {

	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   Random r = new Random();
	   while(true) {
		int n =  r.nextInt(100) + 2 ;
		long  a[] = new long[n];
		for(int i=0;i<a.length;++i)
			a[i] = r.nextInt(99) ;
		for(int i=0;i<a.length;++i)
			System.out.print(a[i] + " ");
		long x = getmaxFast(a);
		long y = getmax(a);
		if( x == y )
			System.out.println( "\n"+getmaxFast(a) + " " + getmax(a) + "\nOK");
		else {
			System.out.println("InCorrect : " + getmaxFast(a) + " " + getmax(a));
			break;
		}
	   
		in.close();
	  }
	}
	
	static Long getmaxFast(long a[]){
		int maxindex1 =-1,maxindex2=-1;
		for(int i=0;i<a.length;i++)
			if(maxindex1==-1 || a[i] > a[maxindex1])
				maxindex1 = i;
		
		for(int j=0;j<a.length;j++)
			if(j != maxindex1)
			if(maxindex2==-1  || (a[j] > a[maxindex2]))
				maxindex2 = j;
		
	   return a[maxindex1] * a[maxindex2] ;
	
	}
	
	static Long getmax(long[]a) {
		Long max_product=(long)0;
		for(int i=0;i<a.length;i++)
			for(int j=i+1;j<a.length;j++)
				if(a[i] * a[j] > max_product)
					max_product = a[i] * a[j];
				
			return max_product;	
				
	}

}
