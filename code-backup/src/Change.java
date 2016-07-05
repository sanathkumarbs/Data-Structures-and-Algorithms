import java.util.Scanner;

public class Change {
    private static int getChange(int n) {
        //write your code here
    	int min = 0;
    	int num = n;
    	
    	while(num>=10){
    		min++;
    		num = num - 10;
    	}
    	
    	while(num>=5){
    		min++;
    		num = num - 5;
    	}
    	
    	while(num>=1){
    		min++;
    		num--;
    	}
    	
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getChange(n));

    }
}

