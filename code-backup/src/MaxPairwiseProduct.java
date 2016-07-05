import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long  getMaxPairwiseProduct(int[] numbers) {
        long result = 0;
        int n = numbers.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (((long)numbers[i]) * numbers[j] > result) {
                    result = ((long)numbers[i]) * numbers[j];
                }
            }	
        }
        return result;
    }
    
    static long MaxPairwiseProductFast(int[] numbers) {
    	int n = numbers.length;

    	  int max_index1 = -1;
    	  for (int i = 0; i < n; ++i){
    		  if ((max_index1 == -1) || (numbers[i] > numbers[max_index1])){
    			  max_index1 = i;
    		  }
    	  }
    	   

    	  int max_index2 = -1;
    	  for (int j = 0; j < n; ++j){
    		  if ((j != max_index1) && ((max_index2 == -1) || (numbers[j] > numbers[max_index2]))){
    			  max_index2 = j;
    		  }
    	  }
    	  
    	  return ((long)(numbers[max_index1])) * numbers[max_index2];
    	}

    public static void main(String[] args) {
    	
    	// Stress Test
    	
//    	  while (true) {
//    		  
//    		  Random random = new Random();
//    		  int n = random.nextInt(200) + 2;
//    		  
//    		  //int n = (int) (Math.random() % 10 + 2);
//    		    
//    		  System.out.println(n + "\n");
//    		  int[] a = new int[n];
//    		    
//    		  for (int i = 0; i < n; ++i) {
//        	    int val = random.nextInt(1000000);
//        	   // System.out.println("Val = " +val);
//    		    a[i] = val;
//    		   // System.out.println("a[i] Val = " +a[i]);
//    		  }
//    		  
//    		  for (int i = 0; i < n; ++i) {
//    		  	System.out.println(a[i] + " ");
//    		  }
//    		  System.out.println("\n");;
//    		  
//    		  long res1 = getMaxPairwiseProduct(a);
//    		  long res2 = MaxPairwiseProductFast(a);
//    		  if (res1 != res2) {
//    		  	System.out.println("Wrong answer: " + res1 + " " + res2 + "\n");
//    		  	break;
//    		  }
//    		  else {
//    		     System.out.println("OK \n");
//    		  }
//    		}
    	  
    	
    	
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        long result = MaxPairwiseProductFast(numbers);
        System.out.println(result);
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}