import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, double[] values, double[] weights) {
        double value = 0;
        //write your code here
        int index = -1;
        
        while(capacity>0){
        	index = findMax(values, weights);
        	 
        	if(index==-1)
        		return value;
        	
        	double a = Math.min(weights[index], capacity);
        	
        	double valueUpdated = a*(values[index]/(double)weights[index]);
        	value += a*(values[index]/(double)weights[index]);
           	capacity -= a;
           	weights[index] -= a;
           	values[index] -= valueUpdated;
           	        
       }
       
       return value;
    }
    
    private static int findMax(double[] values, double[] weights){
    	double max = 0;
    	int index = -1;
    	
    	for(int i=0;i<values.length;i++){
    		if(weights[i]>0 && (values[i]/weights[i])>max){
    			max = values[i]/weights[i];
    			index = i;
    		}
    	}
    	return index;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        double[] values = new double[n];
        double[] weights = new double[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextDouble();
            weights[i] = scanner.nextDouble();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
