import java.util.*;
class Main 
{
	public static void main (String args[]) 
    {
	  Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = (n % 10) + ( n / 10);
      System.out.println(sum);
	}
}