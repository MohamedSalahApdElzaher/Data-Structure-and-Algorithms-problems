import java.util.*;
public class printCoins {
	
  private static Scanner in = new Scanner(System.in);
  
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    System.out.println(printCoins(n));
			 
		in.close();
	}


	// USING GREEDY ALGORITHMS
	static int printCoins(int n) { // O(n)
		List<Integer>list=new ArrayList<Integer>();
		if(n >= 10)
	    	list.add(0,10);
	    else if(n < 10 && n >= 5)
	    	list.add(0,5);
	    else list.add(0,1);
	    int i=0,sum=list.get(0);
	    while(true) {
	    	if(n == 10 || n==5||n==1 )break;			
	    	if(n - sum >= 10 && sum < n) {
	    		list.add(++i,10);
	    		sum+=list.get(i);
	    		if(sum == n)break;
	    	}else if(n - sum < 10 && n - sum >= 5 &&  sum < n) {
	    		list.add(++i,5);
	    		sum+=list.get(i);
	    		if(sum == n)break;
	    	}else if(n - sum < 5 && n - sum >= 1 &&  sum < n){	
	    		list.add(++i,1);
	    		sum+=list.get(i);
	    		if(sum == n)break;
	    	}
	    }
	   
	    return list.size();
	}
	 
	 
	
	 
}
