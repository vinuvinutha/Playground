import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int first_digit = n / 100;
    int sec_digit = ((n / 10) % 10);
    int last_digit = n % 10;
    int rev =(last_digit * 100) + ( sec_digit * 10) + first_digit;
    System.out.println(rev);
  }
}