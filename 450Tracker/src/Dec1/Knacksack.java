package Dec1;

import java.util.Arrays;
class Item {
	int weight;
	int value;
	
}
public class Knacksack {
	 double fractionalKnapsack(int W, Item arr[], int n) 
	    {
	        // Your code here
	        Arrays.sort(arr,(b, a) -> Double.compare( (double)a.value/ (double)a.weight,  (double)b.value/ (double)b.weight));
	        double result = 0;
	        for (Item i: arr){
	            if (W >= i.weight){
	                result += i.value;
	                W = W - i.weight;
	            }
	            else{
	                
	                result += (double)W * ((double) i.value / (double) i.weight);  
	                break;
	            }
	            
	        }
	        return result;
	    }
	 // Time : (ONlogN)
	 // Space: O(1)
}
