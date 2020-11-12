import java.util.Scanner;

public class Chapter2Test {
  public static void main(String[] args) {
Scanner scan = new Scanner (System.in);

System.out.println("Please enter two integers:");
int x = scan.nextInt();
int y = scan.nextInt();
        
System.out.println("The average is: " + ((double)(x+y)/2));


  }
}