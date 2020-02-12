import java.util.*;

public class maj_Element{

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int a[] = new int[n];
			for(int i=0;i<a.length;i++)a[i]=in.nextInt();
	
          System.out.println(maj_Element(a));
		
	}
      
	// Find Majority Element
	static int maj_Element(int a[]) {	 
		// assume 0 is a majority Element index
		int maj = 0, count =1,c=0;	
		Arrays.sort(a);
		for(int i=1;i<a.length;i++) {
			count = (a[i] == a[maj]) ? count+1 : count-1;
			if(count ==0) {
				maj = i;
				count=1;
			}
		}
		
		for(int i=0;i<a.length;i++) 
			if(a[maj] == a[i])c++;			
		
		return c > a.length / 2 ? 1 : 0;
	}
}
