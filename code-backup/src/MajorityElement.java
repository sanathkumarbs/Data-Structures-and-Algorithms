import java.util.*;
import java.io.*;

public class MajorityElement {
	
	 private static int candidate(int[] arr)
	{
	    int majorityIdx = 0, count = 1;
	 
	    for(int i=1; i<arr.length; i++)
	    {
	        if(arr[majorityIdx] == arr[i])
	            count++;
	        else
	            count--;
	 
	        if(count == 0)
	        {
	            majorityIdx = i;
	            count = 1;
	        }
	    }
	    return arr[majorityIdx];
	}
	 
	 
	
    private static int getMajorityElement(int[] a, int left, int right) {
        
    	int c = candidate(a);
    	int result = -1;
    	 
        int count = 0;
        for (int i=0; i<a.length; i++)
            if(a[i] == c)
                count++;
     
        if (count > a.length/2) result = 1;
        
    	return result;  	
    	
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (getMajorityElement(a, 0, a.length) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
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

