import java.util.Scanner;

public class APlusB {
  public static void main(String[] args) {
	System.out.println("Hello World!");
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    s.close();
    System.out.println(a + b);
  }
}