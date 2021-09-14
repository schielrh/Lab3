import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s =  new Scanner(System.in);

    System.out.println("Enter a number to count up or down from:"); 

    int number; 
    number = s.nextInt();

    System.out.println("");

    if (number < 0)
      for (int i=number; i < 1; i++)
      System.out.println(i);

    else
      for (int i=number; i > -1; i--)
      System.out.println(i);

    System.out.println("Blast off!");
  }
}