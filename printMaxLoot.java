
import java.text.DecimalFormat;
import java.util.*;
public class printMaxLoot{
	
	public static void main(String[] args) {

		ArrayList <lootItem> list = new ArrayList<lootItem>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int W = in.nextInt();
	double  sum=0 , value=0 , v =0,w=0; 
	double arr[]=new double[n];
	for(int i=0;i<n;i++){
		 v = in.nextInt();
		 w = in.nextInt();
		double u = (double) v / w;
		arr[i] = u;
		list.add(new lootItem(v,w,u));
	}
	in.close();
	Arrays.sort(arr); 
	int index = n-1; 
	int i =0;
	
	while(true){   	
		 if(n == 1 && w < W) {
			   value += v; break;}

		if(i==n)break;
		if(arr[index] == list.get(i).u){   			
				sum+=list.get(i).w; 
				value+=list.get(i).v;  
			       if(sum==W )   			    	
			    	   break;   			       
			       if(sum > W){  
			    	   value-=list.get(i).v;  
			    	   sum-=list.get(i).w;  
			    	   double s = Math.abs(sum-W); 
			    	   sum+=s;  		    	     			    	  
			    	 value += s * list.get(i).u; 
			    	 break;
			       }
			       index--;
			       i = -1;
			}		
		       i++;  		    
		} 
	
		DecimalFormat f = new DecimalFormat("#.000");
		System.out.println(f.format(value));
			
		}
	
	static class lootItem {
		  double v;
		double w;
		double u;
		  lootItem(double v,double w,double u){
			  this.u=u;
			  this.v=v;
			  this.w=w;
		  }
	}
	
		 
	}
	
