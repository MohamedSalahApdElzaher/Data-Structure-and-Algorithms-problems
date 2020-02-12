import java.util.*;
public class maxPrize{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		if(n == 1) {
			System.out.println(1 + "\n" + 1);
		}
		else {
			ArrayList<Integer>l=maxPrize(n);
			System.out.println(l.size());
		for(int i : l)
			System.out.print(i+" ");
		}

		in.close();
	}
	
	// max pair prizes
	static ArrayList<Integer> maxPrize(int n){
    	ArrayList<Integer>list = new ArrayList<Integer>();
    	list.add(1);
    	int sum = 1, x=0;
     
    	while(true){ 		
    	if(Math.abs(n - sum) > list.get(list.size()-1)){ // 5 - 4 = 1 > 3 		
    		 x = list.get(list.size()-1); // 1
    		list.add(++x);  // 1 2 
    		sum += list.get(list.size()-1);  // 3
    		if(sum - n == 0)break;
    	}else{
    		 x = list.get(list.size()-1); // 3
    		++x; // 4
    		sum-=list.get(list.size()-1);
    		list.remove(list.get(list.size()-1)); // 3
    		list.add(x); // 1 4	
    		sum += list.get(list.size()-1);  // 5
    		if(sum - n == 0)break;
    	}
    		
    	}
    	return list;
    }
}